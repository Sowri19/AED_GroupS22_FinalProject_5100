/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RS_Model.services;

/**
 *
 * @author sampathkorturti
 */

import java.util.ArrayList;
import java.util.List;
import model.RS_BC_Resort;
import model.RS_HallRoomList;
import ui.main.DateUtils;

public class RS_BC_ResortService extends RS_Service {

    public static enum ResortServiceType {
        TOURGUIDE(10),
        CARSERVICE(20);

        private final int price;

        private ResortServiceType(int price) {
            this.price = price;
        }

        public int getPrice() {
            return price;
        }
    }

    private RS_HallRoomList hallroomlist;
    private List<ResortServiceType> ResortServices;

    public RS_BC_ResortService(RS_BC_Resort resort) {
        super(resort, RS_Service.ServiceType.RESORT, DateUtils.now());
        this.ResortServices = new ArrayList<>();
        this.hallroomlist = new RS_HallRoomList();
    }

    public List<ResortServiceType> getResortServices() {
        return ResortServices;
    }

    public void setResortServices(List<ResortServiceType> ResortServices) {
        this.ResortServices = ResortServices;
    }

    public RS_HallRoomList getHallroomlist() {
        return hallroomlist;
    }

    public void setHallroomlist(RS_HallRoomList hallroomlist) {
        this.hallroomlist = hallroomlist;
    }

    public void addService(RS_BC_ResortService.ResortServiceType type) {
        ResortServices.add(type);
        totalCost += type.price;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("\nResort service details:");
        sb.append("\n").append(TAB).append("Resort: ").append(businessCatalogue);
        sb.append("\n").append(TAB).append("Date of appointment: ").append(getDate());
        sb.append("\n").append(TAB).append("Status: ").append(getStatus());

        if (ResortServices == null || ResortServices.isEmpty()) {
            sb.append("\n").append(TAB).append("No services selected for this booking.");
        } else {
            sb.append("\n").append(TAB).append("Below are the details of services included for your booking:");
            for (RS_BC_ResortService.ResortServiceType service : ResortServices) {
                sb.append("\n").append(TAB).append(TAB)
                        .append(String.format("Service type: %s, Cost: $%d", service.toString(), service.getPrice()));
            }
            sb.append("\n").append(TAB).append("Total cost for hotel: $").append(totalCost);
        }
        return sb.toString();
    }

}
