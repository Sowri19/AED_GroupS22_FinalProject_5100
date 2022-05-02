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