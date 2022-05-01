/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Pavithra Ramkumar
 */

import java.util.Date;

public class RS_Entertainment_Choreographer {

    private String name;
    private String city;
    private String contact;
    private String username;
    private String password;

    public RS_Entertainment_Choreographer(String name, String contact, String city, String username, String password) {
           this.name = name;
           this.contact = contact;
           this.city = city;
           this.username = username;
           this.password = password;
    }

    RS_Entertainment_Choreographer(String name, String city, String user, String password1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
