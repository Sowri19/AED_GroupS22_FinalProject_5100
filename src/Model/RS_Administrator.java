/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.*;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;

/**
 *
 * @author Pavithra Ramkumar
 */
public class RS_Administrator {

    private List<RS_ServiceLocation> listOfServiceLocation;
    private RS_ClientDirectory clientDirectory;
    private Map<String, String> mapType;
    private Map<String, String> userNamePasswordMap;

    public RS_Administrator(String userName, String password) {
        listOfServiceLocation = new ArrayList<>();
        listOfServiceLocation.add(new RS_ServiceLocation("NewYork"));
        listOfServiceLocation.add(new RS_ServiceLocation("Texas"));
        clientDirectory = new RS_ClientDirectory();
        mapType = new HashMap<>();
        userNamePasswordMap = new HashMap<>();
        userNamePasswordMap.put(userName, password);
        addUser(userName, password, "admin");
    }

    public Map<String, String> getUserNamePasswordMap() {
        return userNamePasswordMap;
    }

    public void setUserNamePasswordMap(Map<String, String> userNamePasswordMap) {
        this.userNamePasswordMap = userNamePasswordMap;
    }

    public Map<String, String> getMapType() {
        return mapType;
    }

    public void setMapType(Map<String, String> mapType) {
        this.mapType = mapType;
    }

    public List<RS_ServiceLocation> getListOfServiceLocation() {
        return listOfServiceLocation;
    }

    public void setListOfServiceLocation(List<RS_ServiceLocation> listOfServiceLocation) {
        this.listOfServiceLocation = listOfServiceLocation;
    }

    public RS_ClientDirectory getClientDirectory() {
        return clientDirectory;
    }

    public void setClientDirectory(RS_ClientDirectory clientDirectory) {
        this.clientDirectory = clientDirectory;
    }

    public void addNetwork(String name) {
        RS_ServiceLocation serviceLocation = new RS_ServiceLocation(name);
        listOfServiceLocation.add(serviceLocation);
    }

    public RS_ServiceLocation findServiceLocation(String serviceLocationName) {
        for (RS_ServiceLocation serviceLocation : listOfServiceLocation) {
            if (listOfServiceLocation != null && serviceLocation.getName().equals(serviceLocationName)) {
                return serviceLocation;
            }
        }
        return null;
    }

    public void addUser(String username, String password, String type) {
        mapType.put(username, type);
        userNamePasswordMap.put(username, password);
    }

    public String findUserType(String username) {
        if (mapType.containsKey(username)) {
            return mapType.get(username);
        }
        return null;
    }

    public boolean userExistsInSystem(String username) {
        return mapType.containsKey(username);
    }

    public boolean validateUserNamePassword(String userName, String password) {
        return userNamePasswordMap.containsKey(userName) && userNamePasswordMap.get(userName).equals(password);
    }

    public static RS_Administrator createSystemAdmin() {
        return new RS_Administrator("admin", "admin");
    }

    public void deleteCustomer(RS_Client customer) {
        clientDirectory.getListOfClientDirectory().remove(customer);
        mapType.remove(customer.getUserName());
    }

    public void updateUser(String username, String password) {
        if (userNamePasswordMap.containsKey(username)) {
            userNamePasswordMap.put(username, password);
        }
    }

    public RS_Client findCustomer(String user) {
        for (RS_Client custom : clientDirectory.getListOfClientDirectory()) {
            if (custom.getUserName().equals(user)) {
                return custom;
            }
        }
        return null;
    }
}

