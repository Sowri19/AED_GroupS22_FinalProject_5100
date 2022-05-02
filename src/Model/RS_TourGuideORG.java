package model;

import java.util.ArrayList;
import java.util.List;

public class RS_TourGuideORG extends RS_Organization {

    private List<RS_TourGuideService> listOfTourGuideAgent;

    public RS_TourGuideORG(String name, String contact, String city) {
        super(name, contact, city);
        listOfTourGuideAgent = new ArrayList<>();
    }

    public List<RS_TourGuideService> getListOfTourGuideAgent() {
        return listOfTourGuideAgent;
    }

    public void setListOfTourGuideAgent(List<RS_TourGuideService> listOfTourGuideAgent) {
        this.listOfTourGuideAgent = listOfTourGuideAgent;
    }

    public void addTourGuide(String name, String city, String user, String password1) {
        RS_TourGuideService TourGuideStaff = new RS_TourGuideService(name, city, user, password1);
        listOfTourGuideAgent.add(TourGuideStaff);
        System.out.println("ToutGuideAgent manager added is " + listOfTourGuideAgent.size());
    }

    public void deleteManager(RS_Supervisor supr) {
       listOfSupervisor.remove(supr);
    }

}
