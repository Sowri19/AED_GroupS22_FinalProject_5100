package model;

import java.util.ArrayList;
import java.util.List;

public class RS_BC_Catering extends RS_BusinessCatalogue {

    private List<RS_Supervisor> listOfSupervisor;
    private List<RS_Catering_Order> listOfCateringOrder;
    private List<RS_Catering_Menu> listOfMenuItem;
    private List<RS_ServiceAgentOrganisation> listOfServiceAgentOrganisation;

    public RS_BC_Catering(String name, String contact) {
        super(name, contact);
        listOfSupervisor = new ArrayList<>();
        listOfCateringOrder = new ArrayList<>();
        listOfMenuItem = new ArrayList<>();
        listOfServiceAgentOrganisation = new ArrayList<>();
    }

    public List<RS_Catering_Menu> getListOfMenuItem() {
        return listOfMenuItem;
    }

    public void setListOfMenuItem(List<RS_Catering_Menu> ListOfMenuItem) {
        this.listOfMenuItem = ListOfMenuItem;
    }

    public List<RS_Supervisor> getListOfSupervisor() {
        return listOfSupervisor;
    }

    public void setListOfSupervisor(List<RS_Supervisor> listOfSupervisor) {
        this.listOfSupervisor = listOfSupervisor;
    }

    public List<RS_Catering_Order> getListOfCateringOrder() {
        return listOfCateringOrder;
    }

    public void setListOfCateringOrder(List<RS_Catering_Order> listOfCateringOrder) {
        this.listOfCateringOrder = listOfCateringOrder;
    }

    public List<RS_ServiceAgentOrganisation> getListOfServiceAgentOrganisation() {
        return listOfServiceAgentOrganisation;
    }

    public void setListOfServiceAgentOrganisation(List<RS_ServiceAgentOrganisation> listOfServiceAgentOrganisation) {
        this.listOfServiceAgentOrganisation = listOfServiceAgentOrganisation;
    }

    public RS_Supervisor addSupervisor(String name, String username, String password) {
        RS_Supervisor supervisor = new RS_Supervisor(name, username, password);
        listOfSupervisor.add(supervisor);
        return supervisor;
    }

    public RS_Supervisor findSupervisor(String username) {
        for (RS_Supervisor supr : listOfSupervisor) {
            if (supr.getUsername().equals(username)) {
                return supr;
            }
        }
        return null;
    }

    public void addServiceAgentOrganisation(String name, String contact, String ServiceLocationName) {
        RS_ServiceAgentOrganisation del = new RS_ServiceAgentOrganisation(name, contact, ServiceLocationName);
        listOfServiceAgentOrganisation.add(del);
    }

    public void addMenuItem(String item, int price) {
        listOfMenuItem.add(new RS_Catering_Menu(item, price));
    }

    public void deleteSupervisor(RS_Supervisor supr) {
        listOfSupervisor.remove(supr);
    }
}
