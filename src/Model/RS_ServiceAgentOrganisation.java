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

public class RS_ServiceAgentOrganisation extends RS_Organization{

    private List<RS_ServiceAgent> listOfServiceAgent;

  public RS_ServiceAgentOrganisation(String name, String contact, String city) {
        super(name, contact, city);
        this .listOfServiceAgent = new ArrayList<>();
    }
  
    public List<RS_ServiceAgent> getListOfServiceAgent() {
        return listOfServiceAgent;
    }

    public void setListOfServiceAgent(List<RS_ServiceAgent> listOfServiceAgent) {
        this.listOfServiceAgent = listOfServiceAgent;
    }


