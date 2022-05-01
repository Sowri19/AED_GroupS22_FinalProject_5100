/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author sampathkorturti
 */

import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import ui.main.DateUtils;

public class RS_HallType {

    public enum HallRoomType {
        BALLROOM(500, "BALLROOM"),
        ELITE(1500, "ELITE"),
        ONLY_ROOM(2500, "ONLY_ROOM");

        private final int rate;
        private final String name;

        private HallRoomType(int rate, String name) {
            this.rate = rate;
            this.name = name;
        }

        public int getRate() {
            return rate;
        }

        public String getName() {
            return name;
        }

        public String toString() {
            return getName() + " (" + rate + "$ per night)";
        }
    }
