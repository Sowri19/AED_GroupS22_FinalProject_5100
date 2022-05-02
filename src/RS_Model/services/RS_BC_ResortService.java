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
