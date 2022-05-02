package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class RS_BusinessCatalogueDirectory {

    private List<RS_BC_Resort> listOfResort;
    private List<RS_BC_Events> listOfEvents;
    private List<RS_BC_Entertainment> listOfEntertainment;
    private List<RS_BC_Catering> listOfCatering;

    public RS_BusinessCatalogueDirectory() {
        listOfResort = new ArrayList<>();
        listOfEvents = new ArrayList<>();
        listOfEntertainment = new ArrayList<>();
        listOfCatering = new ArrayList<>();
    }

    public List<RS_BC_Resort> getListOfResort() {
        return listOfResort;
    }

    public void setListOfResort(List<RS_BC_Resort> listOfResort) {
        this.listOfResort = listOfResort;
    }

    public List<RS_BC_Events> getListOfEvents() {
        return listOfEvents;
    }

    public void setListOfEvents(List<RS_BC_Events> listOfEvents) {
        this.listOfEvents = listOfEvents;
    }

    public List<RS_BC_Entertainment> getListOfEntertainment() {
        return listOfEntertainment;
    }

    public void setListOfEntertainment(List<RS_BC_Entertainment> listOfEntertainment) {
        this.listOfEntertainment = listOfEntertainment;
    }

    public List<RS_BC_Catering> getListOfCatering() {
        return listOfCatering;
    }

    public void setListOfCatering(List<RS_BC_Catering> listOfCatering) {
        this.listOfCatering = listOfCatering;
    }

    public void addEntertainment(String name, String contact) {
        RS_BC_Entertainment entertainment = new RS_BC_Entertainment(name, contact);
        listOfEntertainment.add(entertainment);
    }

    public void addCatering(String name, String contact) {
        RS_BC_Catering catering = new RS_BC_Catering(name, contact);
        listOfCatering.add(catering);
    }

    public void addEvents(String name, String contact) {
        RS_BC_Events event = new RS_BC_Events(name, contact);
        listOfEvents.add(event);
    }

    public void addResort(String name, String contact) {
        RS_BC_Resort resort = new RS_BC_Resort(name, contact);
        listOfResort.add(resort);
    }

    public RS_BC_Resort findResort(String resortName) {
        for (RS_BC_Resort resort : listOfResort) {
            if (resort.getName().equals(resortName)) {
                return resort;
            }
        }
        return null;
    }

    public RS_BC_Entertainment findEntertainment(String entertainmentName) {
        for (RS_BC_Entertainment entr : listOfEntertainment) {
            if (entr.getName().equals(entertainmentName)) {
                return entr;
            }
        }
        return null;
    }

    public RS_BC_Catering findCatering(String name) {
        for (RS_BC_Catering entertainment : listOfCatering) {
            if (entertainment.getName().equals(name)) {
                return entertainment;
            }
        }
        return null;
    }

    public RS_BC_Events findEvents(String name) {
        for (RS_BC_Events event : listOfEvents) {
            if (event.getName().equals(name)) {
                return event;
            }
        }
        return null;
    }

    public void deleteBusinessCatalogueEvents(RS_BC_Events event) {
        listOfEvents.remove(event);
    }

    public void deleteBusinessCatalogueEntertainment(RS_BC_Entertainment Entertainment) {
        listOfEntertainment.remove(Entertainment);
    }

    public void deleteBusinessCatalogueCatering(RS_BC_Catering cater) {
        listOfCatering.remove(cater);
    }

    public void deleteBusinessCatalogueResort(RS_BC_Resort resort) {
        listOfResort.remove(resort);
    }
}
