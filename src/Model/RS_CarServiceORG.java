/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sampathkorturti
 */
public class RS_CarServiceORG extends RS_Organization {

    private List<RS_CarService> listOfCarService;

    public RS_CarServiceORG(String name, String contact, String city) {
        super(name, contact, city);
        listOfCarService = new ArrayList<>();
    }
