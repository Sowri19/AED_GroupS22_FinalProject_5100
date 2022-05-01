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

public class RS_ClientDirectory {

    private List<RS_Client> listOfClient;

    public RS_ClientDirectory() {
        listOfClient = new ArrayList<>();
    }

    public List<RS_Client> getListOfClientDirectory() {
        return listOfClient;
    }

    public void setListOfClient(List<RS_Client> listOfClient) {
        this.listOfClient = listOfClient;
    }

    public RS_Client addCustomer() {
        RS_Client client = new RS_Client();
        listOfClient.add(client);
        return client;
    }

    public RS_Client findClientUsername(String username) {
        for (int i = 0; i < listOfClient.size(); i++) {
            if (listOfClient.get(i).getUserName().equals(username)) {
                return listOfClient.get(i);
            }
        }
        return null;
    }

}

