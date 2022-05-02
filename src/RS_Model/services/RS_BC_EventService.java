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

    public RS_BC_EventService(RS_BC_Events business, Date eventDate) {
        super(business, ServiceType.EVENT, eventDate);
        this.EventServiceTypes = new HashMap<>();
    }

    public Map<EventServiceType, Integer> getEventServiceTypes() {
        return EventServiceTypes;
    }

    public void setEventServiceTypes(Map<EventServiceType, Integer> EventServiceTypes) {
        this.EventServiceTypes = EventServiceTypes;
    }

    public void addService(EventServiceType type, int cost) {
        EventServiceTypes.put(type, cost);
        totalCost += cost;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("\nEvent service details:");
        sb.append("\n").append(TAB).append("Organization conducting event: ").append(businessCatalogue);
        sb.append("\n").append(TAB).append("Date of event: ").append(getDate());
        sb.append("\n").append(TAB).append("Status: ").append(getStatus());

        if (EventServiceTypes == null || EventServiceTypes.isEmpty()) {
            sb.append("\n").append(TAB).append("No services selected for this booking.");
        } else {
            sb.append("\n").append(TAB).append("Below are the details of services included for the event:");
            for (Map.Entry<EventServiceType, Integer> entry : EventServiceTypes.entrySet()) {
                sb.append("\n").append(TAB).append(TAB)
                        .append(String.format("Service type: %s, Cost: $%d", entry.getKey(), entry.getValue()));
            }
            sb.append("\n").append(TAB).append("Total cost for event: $").append(totalCost);
        }
        return sb.toString();
    }
}
