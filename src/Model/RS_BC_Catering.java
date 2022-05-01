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
