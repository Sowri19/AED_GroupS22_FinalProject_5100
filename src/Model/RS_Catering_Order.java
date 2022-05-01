/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Pavithra Ramkumar
 */
import java.util.UUID;

public class RS_Catering_Order {
    private String id;
    private String status;
    private String details;
    private String feedback;
    private RS_Client client;
    private RS_BC_Catering catering;
    private RS_ServiceAgent serviceAgent;

    public RS_Catering_Order(String details) {
//        id = UUID.randomUUID().toString();
        this.details = details;
    }
      public String getFeedback() {
        return feedback;
    }