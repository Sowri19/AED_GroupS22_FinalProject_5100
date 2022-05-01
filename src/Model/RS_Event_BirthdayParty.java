/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Pavithra Ramkumar
 */

import java.util.List;

public class RS_Event_BirthdayParty extends RS_Organization {

    public RS_Event_BirthdayParty(String name, String contact, String city) {
        super(name, contact, city);
    }

    public enum BirthdayPartyType {
        DELUXE(1000, "DELUXE", "Includes basic Ballon Decor, Cake with Food for 100 guest"),
        PREMIUM(2500, "PREMIUM", "Includes Return gift, Ballon Decor, Customised Cake and Food for 300 guest"),
        ELITE(5000, "ELITE", "Includes PhotoBoth decor, baloon decor, customised Cake, Return Gift and food for 500 guest ");

        private final int rate;
        private final String name;
        private final String description;

        private BirthdayPartyType(int rate, String name, String description) {
            this.rate = rate;
            this.name = name;
            this.description = description;
        }

        public int getRate() {
            return rate;
        }

        public String getName() {
            return name;
        }

        public String toString() {
            return getName() + " (" + rate + "$ per night)";
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public List<RS_Supervisor> getListOfSupervisor() {
        return listOfSupervisor;
    }

    public void setListOfSupervisor(List<RS_Supervisor> listOfSupervisor) {
        this.listOfSupervisor = listOfSupervisor;
    }

    public RS_Supervisor addSupervisor(String name, String city, String user, String password1) {
        RS_Supervisor supervisor = new RS_Supervisor(name, user, password1);
        listOfSupervisor.add(supervisor);
        return supervisor;
    }

    public void deleteSupervisor(RS_Supervisor supr) {
        listOfSupervisor.remove(supr);
    }

}
