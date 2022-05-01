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
import java.util.List;

public class RS_Entertainment_SingerORG extends RS_Organization {

    private List<RS_Entertainment_Singer> listOfSinger;

    public RS_Entertainment_SingerORG(String name, String contact, String city) {
        super(name, contact, city);
        listOfSinger = new ArrayList<>();
    }


