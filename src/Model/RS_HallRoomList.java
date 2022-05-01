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
import java.util.List;
import model.RS_HallType.HallRoomType;

public class RS_HallRoomList {

    private List<RS_HallType> listOfHalls;
    private int nextRoomorHallNumber = 1;

    public RS_HallRoomList() {
        listOfHalls = new ArrayList<>();
    }

    public int getNextRoomorHallNumber() {
        return nextRoomorHallNumber;
    }

    public void setNextRoomorHallNumber(int nextRoomorHallNumber) {
        this.nextRoomorHallNumber = nextRoomorHallNumber;
    }

    public List<RS_HallType> getListOfHallRoom() {
        return listOfHalls;
    }

    public void setListOfHalls(List<RS_HallType> listOfHalls) {
        this.listOfHalls = listOfHalls;
        if (listOfHalls != null && listOfHalls.size() > 0) {
            nextRoomorHallNumber = listOfHalls.get(listOfHalls.size() - 1).getRoomorHallNo() + 1;
        }
    }

    public void createHallRoom(HallRoomType type) {
        RS_HallType room = new RS_HallType(type, nextRoomorHallNumber);
        nextRoomorHallNumber++;
        listOfHalls.add(room);
    }

    public String toString() {
        return listOfHalls.toString();
    }
}
