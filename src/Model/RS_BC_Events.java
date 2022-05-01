/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Pavithra Ramkumar
 */
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RS_BC_Events extends RS_BusinessCatalogue {

    private Date date;
    private List<RS_Supervisor> listOfSupervisor;
    private List<RS_Event_BirthdayParty> listOfBirthdayParty;
    private List<RS_Event_Wedding> listOfWeddingServices;
    private List<RS_Event_Meetings> listOfMeetings;

    public RS_BC_Events(String name, String contact) {
        super(name, contact);
        listOfSupervisor = new ArrayList<>();
        listOfBirthdayParty = new ArrayList<>();
        listOfWeddingServices = new ArrayList<>();
        listOfMeetings = new ArrayList<>();

    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<RS_Supervisor> getListOfSupervisor() {
        return listOfSupervisor;
    }

    public void setListOfSupervisor(List<RS_Supervisor> listOfSupervisor) {
        this.listOfSupervisor = listOfSupervisor;
    }

    public List<RS_Event_BirthdayParty> getListOfBirthdayParty() {
        return listOfBirthdayParty;
    }

    public void setListOfBirthdayParty(List<RS_Event_BirthdayParty> listOfBirthdayParty) {
        this.listOfBirthdayParty = listOfBirthdayParty;
    }

    public List<RS_Event_Wedding> getListOfWeddingServices() {
        return listOfWeddingServices;
    }

    public void setListOfWeddingServices(List<RS_Event_Wedding> listOfWeddingServices) {
        this.listOfWeddingServices = listOfWeddingServices;
    }

    public List<RS_Event_Meetings> getListOfMeetings() {
        return listOfMeetings;
    }

    public void setListOfMeetings(List<RS_Event_Meetings> listOfMeetings) {
        this.listOfMeetings = listOfMeetings;
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

    public void addBirthdayParty(String name, String contact, String city) {
        RS_Event_BirthdayParty bp = new RS_Event_BirthdayParty(name, contact, city);
        System.out.println(name);
        listOfBirthdayParty.add(bp);
        System.out.println("BirthDay Party size is " + listOfBirthdayParty.size() + " name is " + listOfBirthdayParty.get(0).getName());

    }

    public void addWeddingServices(String name, String contact, String city) {
        RS_Event_Wedding wed = new RS_Event_Wedding(name, contact, city);
        listOfWeddingServices.add(wed);

    }
