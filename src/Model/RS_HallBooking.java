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
import java.util.Date;
import java.util.List;
import java.util.UUID;
import RS_Model.services.RS_BC_ResortService;
import RS_Model.services.RS_Service;
import ui.main.DateUtils;

public class RS_HallBooking {

    private static final String TAB = "      ";

    private Date checkin;
    private Date checkout;
    private String status;
    private int cost;
    private RS_ServiceLocation serviceLocation;

    private List<RS_Service> services;
    private String id;

    public RS_HallBooking() {
        
    }
    
    public RS_HallBooking(RS_BC_Resort resort, RS_ServiceLocation serviceLocation) {
        this.services = new ArrayList<>();
        this.services.add(new RS_BC_ResortService(resort));
        this.serviceLocation = serviceLocation;
        this.id = UUID.randomUUID().toString();
    }

    public int getTotalCost() {
        int totalCost = this.cost;
        for (RS_Service service : services) {
            totalCost += service.getTotalCost();
        }
        return totalCost;
    }

