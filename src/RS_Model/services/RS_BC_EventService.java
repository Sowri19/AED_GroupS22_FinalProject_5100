/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RS_Model.services;

/**
 *
 * @author sampathkorturti
 */

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import model.RS_HallBooking;
import model.RS_BC_Events;

public class RS_BC_EventService extends RS_Service {

    private RS_HallBooking id;

    public static enum EventServiceType {
        WEDDING,
        BIRTHDAYPARTY,
        MEETINGS
    }

    private Map<EventServiceType, Integer> EventServiceTypes;

