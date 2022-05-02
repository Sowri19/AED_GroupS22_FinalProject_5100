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
import java.util.Date;
import java.util.List;
import model.RS_BC_Entertainment;

public class RS_BC_EntertainmentService extends RS_Service {

    public static enum EntertainmentServiceType {
        MAGICIAN(60),
        CHOREOGRAPHY(60),
        SINGER(60);

        private final int price;

        private EntertainmentServiceType(int price) {
            this.price = price;
        }

        public int getPrice() {
            return price;
        }
    }
    

    private List<EntertainmentServiceType> EntertainmentServices;

    public RS_BC_EntertainmentService(RS_BC_Entertainment entertainment, Date date) {
        super(entertainment, RS_Service.ServiceType.ENTERTAINMENT, date);
        this.EntertainmentServices = new ArrayList<>();
    }

    public List<EntertainmentServiceType> getEntertainmentServices() {
        return EntertainmentServices;
    }

    public void setEntertainmentServices(List<EntertainmentServiceType> EntertainmentServices) {
        this.EntertainmentServices = EntertainmentServices;
    }

    public void addService(EntertainmentServiceType type) {
        EntertainmentServices.add(type);
        totalCost += type.price;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("\nEntertainment service details:");
        sb.append("\n").append(TAB).append("Entertainment: ").append(businessCatalogue);
        sb.append("\n").append(TAB).append("Date of appointment: ").append(getDate());
        sb.append("\n").append(TAB).append("Status: ").append(getStatus());
        if (EntertainmentServices == null || EntertainmentServices.isEmpty()) {
            sb.append("\n").append(TAB).append("No services selected for this booking.");
        } else {
            sb.append("\n").append(TAB).append("Below are the details of services included for your appointment:");
            for (EntertainmentServiceType service : EntertainmentServices) {
                sb.append("\n").append(TAB).append(TAB)
                        .append(String.format("Service type: %s, Cost: $%d", service.toString(), service.getPrice()));
            }
            sb.append("\n").append(TAB).append("Total cost for health club: $").append(totalCost);
        }
        return sb.toString();
    }
}
