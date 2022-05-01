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

public class RS_CarService {
    private String name;
    private String city;
    private String password;
    private String username;

    List<RS_Catering_Order> list = new ArrayList<>();

    public  RS_CarService(String name, String city, String username, String password) {
        this.name = name;
        this.password = password;
        this.username = username;
    }

