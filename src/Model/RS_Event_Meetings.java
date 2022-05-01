/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Pavithra Ramkumar
 */

public class RS_Event_Meetings extends RS_Organization {

    public RS_Event_Meetings(String name, String contact, String city) {
        super(name, contact, city);
    }

    public enum MeetingsType {
        DELUXE(1200, "DELUXE", "Includes decor and standard food for 50 guest"),
        PREMIUM(3000, "PREMIUM", "Includes flower decoration, two cuisines for Food and Projector for 150 guests"),
        ELITE(5500, "ELITE", "Includes decoration,Multi cuisine Food , Projector and customised items for 300 guests");

        private final int rate;
        private final String name;
        private final String description;

        private MeetingsType(int rate, String name, String description) {
            this.rate = rate;
            this.name = name;
            this.description = description;
        }

