/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Pavithra Ramkumar
 */
public class RS_Entertainment_Magician extends RS_Person {

    private String city;

    public RS_Entertainment_Magician(String name, String city, String username, String password) {
        this.name = name;
        this.city = city;
        this.username = username;
        this.password = password;
    }

    public String getCity() {
        return city;
    }
}

