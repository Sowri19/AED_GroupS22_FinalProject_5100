/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Pavithra Ramkumar
 */

public class RS_Catering_Menu {

    private String details;
    private int price;

    public RS_Catering_Menu(String item, int price) {
        this.details = item;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String toString() {
        return details + " ($" + price + ")";
    }
}
