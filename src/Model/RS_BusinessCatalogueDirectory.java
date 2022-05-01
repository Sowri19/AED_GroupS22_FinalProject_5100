/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;



/**
 *
 * @author aishw
 */
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

