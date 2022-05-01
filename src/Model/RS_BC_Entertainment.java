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

public class RS_BC_Entertainment extends RS_BusinessCatalogue {

    private List<RS_Supervisor> listOfSupervisor;
    private List<RS_Entertainment_MagicianORG> listOfMagicianORG;
    private List<RS_Entertainment_ChoreographerORG> listOfChoreographerORG;
    private List<RS_Entertainment_SingerORG> listOfSingerORG;

    RS_BC_Entertainment(String name, String contact) {
        super(name, contact);
        listOfSupervisor = new ArrayList<>();
        listOfMagicianORG = new ArrayList<>();
        listOfChoreographerORG = new ArrayList<>();
        listOfSingerORG = new ArrayList<>();
    }

    public List<RS_Entertainment_SingerORG> getListOfSingerORG() {
        return listOfSingerORG;
    }

    public void setListOfSingerORG(List<RS_Entertainment_SingerORG> listOfSingerORG) {
        this.listOfSingerORG = listOfSingerORG;
    }

    public List<RS_Entertainment_MagicianORG> getListOfMagicianORG() {
        return listOfMagicianORG;
    }
   public void setListOfMagicianORG(List<RS_Entertainment_MagicianORG> listOfMagicianORG) {
        this.listOfMagicianORG = listOfMagicianORG;
    }

    public List<RS_Entertainment_ChoreographerORG> getListOfChoreographerORG() {
        return listOfChoreographerORG;
    }

    public void setListOfChoreographerORG(List<RS_Entertainment_ChoreographerORG> listOfChoreographerORG) {
        this.listOfChoreographerORG = listOfChoreographerORG;
    }

    public List<RS_Supervisor> getListOfSupervisor() {
        return listOfSupervisor;
    }

    public void setListOfSupervisor(List<RS_Supervisor> listOfSupervisor) {
        this.listOfSupervisor = listOfSupervisor;
    }

    public RS_Supervisor addSupervisor(String name, String username, String password) {
        RS_Supervisor supervisor = new RS_Supervisor(name, username, password);
        listOfSupervisor.add(supervisor);
        System.out.println("size of supervisor in Entertainment is " + listOfSupervisor.size() + " name is " + supervisor.getUsername());
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

    public void addMagicianORG(String name, String contact, String city) {
        RS_Entertainment_MagicianORG magicianORG = new RS_Entertainment_MagicianORG(name, contact, city);
        listOfMagicianORG.add(magicianORG);
    }

    public void addSingerORG(String name, String contact, String city) {
        RS_Entertainment_SingerORG singerORG = new RS_Entertainment_SingerORG(name, contact, city);
        listOfSingerORG.add(singerORG);
    }

    public void addChoreographerORG(String name, String contact, String serviceLocationName) {
        RS_Entertainment_ChoreographerORG choreographerORG = new RS_Entertainment_ChoreographerORG(name, contact, serviceLocationName);
        listOfChoreographerORG.add(choreographerORG);
    }
    
    public String toString() {
        return name;
    }

    public void deleteSupervisor(RS_Supervisor supr) {
        listOfSupervisor.remove(supr);
    }

    public void deleteMagician(RS_Entertainment_MagicianORG magician) {
      listOfMagicianORG.remove(magician);
    }

    public void deleteChoreographer(RS_Entertainment_ChoreographerORG choreographer) {
        listOfChoreographerORG.remove(choreographer);
    }

    public void deleteSinger(RS_Entertainment_SingerORG singer) {
           listOfSingerORG.remove(singer);
    }
}
