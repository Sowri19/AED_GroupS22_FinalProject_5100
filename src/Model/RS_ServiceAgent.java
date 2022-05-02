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

public class RS_ServiceAgent extends RS_Person {

    private String city;
    List<RS_Catering_Order> list = new ArrayList<>();

    public RS_ServiceAgent(String name, String city, String username, String password) {
        this.name = name;
        this.password = password;
        this.username = username;
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<RS_Catering_Order> getList() {
        return list;
    }

    public void setList(List<RS_Catering_Order> list) {
        this.list = list;
    }

    public void addOrder(RS_Catering_Order order) {
        list.add(order);
    }

    public RS_Catering_Order findOrder(String orderId) {
        for (int i = 0; i < list.size(); i++) {
            if (orderId.equals(list.get(i).getId())) {
                return list.get(i);
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return name;
    }

}
