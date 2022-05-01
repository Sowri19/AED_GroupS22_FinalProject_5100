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

