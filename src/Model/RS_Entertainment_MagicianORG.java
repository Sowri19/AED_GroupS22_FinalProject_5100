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
import java.util.List;

public class RS_Entertainment_MagicianORG extends RS_Organization {

    List<RS_Entertainment_Magician> listOfMagician;

    public RS_Entertainment_MagicianORG(String name, String contact, String city) {
        super(name, contact, city);
        listOfMagician = new ArrayList<>();
    }

    public List<RS_Entertainment_Magician> getListOfMagician() {
        return listOfMagician;
    }

    public void setListOfMagician(List<RS_Entertainment_Magician> listOfMagician) {
        this.listOfMagician = listOfMagician;
    }

    public void addMagician(String name, String city, String user, String password1) {
        RS_Entertainment_Magician magician = new RS_Entertainment_Magician(name, city, user, password1);
        listOfMagician.add(magician);
        System.out.println("Magician's manager added is " + listOfMagician.size());
    }

    public void deleteSupervisor(RS_Supervisor supr) {
        listOfSupervisor.remove(supr);
    }

}
