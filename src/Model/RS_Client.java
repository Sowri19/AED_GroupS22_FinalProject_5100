package model;

import java.util.ArrayList;
import java.util.List;

public class RS_Client {

    private String name;
    private String contact;
    private String address;
    private String city;
    private String password;
    private String userName;
    private List<RS_HallBooking> hallbookingList;

    public RS_Client() {
        hallbookingList = new ArrayList<>();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public List<RS_HallBooking> getHallbookingList() {
        return hallbookingList;
    }

    public void setHallbookingList(List<RS_HallBooking> hallbookingList) {
        this.hallbookingList = hallbookingList;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public RS_HallBooking addBooking(RS_BC_Resort resort, RS_ServiceLocation serviceLocation) {
        RS_HallBooking booking = new RS_HallBooking(resort, serviceLocation);
        hallbookingList.add(booking);
        return booking;
    }

    public String toString() {
        return userName;
    }
}
