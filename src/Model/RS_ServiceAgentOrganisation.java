package model;

import java.util.ArrayList;
import java.util.List;

public class RS_ServiceAgentOrganisation extends RS_Organization{

    private List<RS_ServiceAgent> listOfServiceAgent;

  public RS_ServiceAgentOrganisation(String name, String contact, String city) {
        super(name, contact, city);
        this .listOfServiceAgent = new ArrayList<>();
    }
  
    public List<RS_ServiceAgent> getListOfServiceAgent() {
        return listOfServiceAgent;
    }

    public void setListOfServiceAgent(List<RS_ServiceAgent> listOfServiceAgent) {
        this.listOfServiceAgent = listOfServiceAgent;
    }

    public void addServiceAgent(String name, String city, String user, String password1) {
        RS_ServiceAgent del = new RS_ServiceAgent(name, city, user, password1);
        listOfServiceAgent.add(del);
        System.out.println("Service Agent manager added is " + listOfServiceAgent.size());
    }

    public void deleteServiceAgent(RS_ServiceAgentOrganisation del) {
     listOfServiceAgent.remove(del);
    }

    public void deleteSupervisor(RS_Supervisor supr) {
      listOfSupervisor.remove(supr);
    }

}
