package model;

import java.util.ArrayList;
import java.util.List;

public class RS_CarServiceORG extends RS_Organization {

    private List<RS_CarService> listOfCarService;

    public RS_CarServiceORG(String name, String contact, String city) {
        super(name, contact, city);
        listOfCarService = new ArrayList<>();
    }

    public List<RS_CarService> getListOfCarService() {
        return listOfCarService;
    }

    public void setListOfCarService(List<RS_CarService> listOfCarService) {
        this.listOfCarService = listOfCarService;
    }

    public void addCarServiceman(String name, String city, String user, String password1) {
        RS_CarService carService = new RS_CarService(name, city, user, password1);
        listOfCarService.add(carService);
        System.out.println("Service Agent manager added is " + listOfCarService.size());
    }

    public void deleteSupervisor(RS_Supervisor supr) {
       listOfSupervisor.remove(supr);
    }
}
