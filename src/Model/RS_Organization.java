/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author sampathkorturti
 */

import java.util.ArrayList;
import java.util.List;

public abstract class RS_Organization {

    protected String name;
    protected String city;
    protected String contact;
    protected List<RS_Supervisor> listOfSupervisor;

    public RS_Organization(String name, String contact, String city) {
        this.name = name;
        this.city = city;
        this.contact = contact;
        this.listOfSupervisor = new ArrayList<>();
    }

