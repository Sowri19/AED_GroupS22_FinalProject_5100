package model;

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

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getId() {
        return id;
    }

    public List<RS_Service> getServices() {
        return services;
    }

    public void setServices(List<RS_Service> services) {
        this.services = services;
    }

    public void addService(RS_Service service) {
        this.services.add(service);
    }

    public Date getCheckin() {
        return checkin;
    }

    public void setCheckin(Date checkin) {
        this.checkin = DateUtils.formatDate(checkin);
    }

    public Date getCheckout() {
        return checkout;
    }

    public void setCheckout(Date checkout) {
        this.checkout = DateUtils.formatDate(checkout);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public RS_ServiceLocation getServiceLocation() {
        return serviceLocation;
    }

    public void setServiceLocation(RS_ServiceLocation serviceLocation) {
        this.serviceLocation = serviceLocation;
    }

    public RS_BC_ResortService getResortService() {
        for (RS_Service service : services) {
            if (service instanceof RS_BC_ResortService) {
                return (RS_BC_ResortService) service;
            }
        }

        throw new RuntimeException("Booking should always have an resort service");
    }

    public String prettyPrint() {
        StringBuilder sb = new StringBuilder("Below are your booking details -\n");
        sb.append("\n").append("RESORT BOOKING: ");
        sb.append("\n").append(TAB).append("City: ").append(serviceLocation.getName());
        sb.append("\n").append(TAB).append("Checkin date: ").append(checkin);
        sb.append("\n").append(TAB).append("Checkout date: ").append(checkout);
        
        List<RS_HallType> listOfHalls = getResortService().getHallroomlist().getListOfHallRoom();
        int roomCost = 0;
        sb.append("\n").append(TAB).append(String.format("Below are the details of the %d Hall booked:", listOfHalls.size()));
        for (RS_HallType room : listOfHalls) {
            roomCost += room.getHallRoomType().getRate();
            sb.append("\n").append(TAB).append(TAB).append("HallorRoom number: ")
                    .append(room.getRoomorHallNo()).append(",Hall type: ").append(room.getHallRoomType());
        }
        sb.append("\n").append(TAB).append("Total cost for your stay or Hall: $").append(roomCost);
        
        int totalCost = roomCost;
        for (RS_Service service : services) {
            totalCost += service.getTotalCost();
            sb.append("\n").append(service).append("\n");
        }
        
        sb.append("\nTotal cost of the booking including all services: $").append(getTotalCost()).append("\n");
     
        return sb.toString();
    }

    public String toString() {
        return id;
    }
}
