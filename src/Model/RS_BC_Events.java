/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Pavithra Ramkumar
 */
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RS_BC_Events extends RS_BusinessCatalogue {

    private Date date;
    private List<RS_Supervisor> listOfSupervisor;
    private List<RS_Event_BirthdayParty> listOfBirthdayParty;
    private List<RS_Event_Wedding> listOfWeddingServices;
    private List<RS_Event_Meetings> listOfMeetings;

    public RS_BC_Events(String name, String contact) {
        super(name, contact);
        listOfSupervisor = new ArrayList<>();
        listOfBirthdayParty = new ArrayList<>();
        listOfWeddingServices = new ArrayList<>();
        listOfMeetings = new ArrayList<>();

    }
