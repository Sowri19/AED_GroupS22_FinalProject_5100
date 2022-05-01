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

    public List<RS_TourGuideORG> getTourGuideORG() {
        return tourGuideORG;
    }

    public void setTourGuideORG(List<RS_TourGuideORG> tourGuideList) {
        this.tourGuideORG = tourGuideList;
    }

    public List<RS_CarServiceORG> getCarServiceORGList() {
        return carServiceORGList;
    }

    public void setCarServiceORGList(List<RS_CarServiceORG> carServiceList) {
        this.carServiceORGList = carServiceList;
    }

    public RS_HallRoomList getHallRoomListDirectory() {
        return hallRoomListDirectory;
    }

    public void setHallRoomListDirectory(RS_HallRoomList roomList) {
        this.hallRoomListDirectory = roomList;
    }

    public List<RS_HallType> availableRooms(Date startDate, Date endDate, RoomType roomType) {
        List<RS_HallType> availableRooms = new ArrayList<>();
        for (RS_HallType hall : hallRoomListDirectory.getListOfHallRoom()) {
            if (hall.getHallRoomType().equals(roomType) && hall.isAvailable(startDate, endDate)) {
                availableRooms.add(hall);
            }
        }
        return availableRooms;
    }

    public List<RS_HallType> bookRooms(Date startDate, Date endDate, int count, RoomType roomType) {
        List<RS_HallType> availableRooms = availableRooms(startDate, endDate, roomType);
        if (availableRooms.size() < count) {
            throw new IllegalArgumentException("Hall is not available for the specified date.");
        }

        for (int i = 0; i < count; i++) {
            availableRooms.get(i).book(startDate, endDate);
        }

        // return booked hall list
        return availableRooms.subList(0, count);
    }

    public List<RS_Supervisor> getListOfSupervisor() {
        return listOfSupervisor;
    }

    public void setListOfSupervisor(List<RS_Supervisor> listOfSupervisor) {
        this.listOfSupervisor = listOfSupervisor;
    }

    public RS_Supervisor addSupervisor(String name, String username, String password) {
        RS_Supervisor supervisor = new RS_Supervisor(name, username, password);
        listOfSupervisor.add(supervisor);
        return supervisor;
    }

    public RS_Supervisor findSupervisor(String username) {
        for (RS_Supervisor supr : listOfSupervisor) {
            if (supr.getUsername().equals(username)) {
                return supr;
            }
        }
        return null;
    }

    public void addTourGuideORG(String name, String contact, String city) {
        RS_TourGuideORG tourGuideORG1 = new RS_TourGuideORG(name, contact, city);
        tourGuideORG.add(tourGuideORG1);
    }

    public void addCarServiceORG(String name, String contact, String serviceLocationName) {
        RS_CarServiceORG to = new RS_CarServiceORG(name, contact, serviceLocationName);
        carServiceORGList.add(to);
    }

    public void deleteSupervisor(RS_Supervisor supr) {
        listOfSupervisor.remove(supr);
    }

    public void deleteTourGuide(RS_TourGuideORG tourGuide) {
        tourGuideORG.remove(tourGuide);
    }

    public void deleteCarService(RS_CarServiceORG carService) {
        carServiceORGList.remove(carService);
    }

}
