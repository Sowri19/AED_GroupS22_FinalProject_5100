/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author sampathkorturti
 */
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.RS_HallType.HallRoomType;

public class RS_BC_Resort extends RS_BusinessCatalogue {

    private RS_HallRoomList hallRoomListDirectory;
    private List<RS_Supervisor> listOfSupervisor;
    private List<RS_TourGuideORG> tourGuideORG;
    private List<RS_CarServiceORG> carServiceORGList;

    public RS_BC_Resort() {

    }

    public RS_BC_Resort(String name, String contact) {
        super(name, contact);
        listOfSupervisor = new ArrayList<>();
        hallRoomListDirectory = new RS_HallRoomList();
        carServiceORGList = new ArrayList<>();
        tourGuideORG = new ArrayList<>();
    }
