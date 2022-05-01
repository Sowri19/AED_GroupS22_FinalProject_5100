/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author sampathkorturti
 */

public class RS_ServiceLocation {

    private String name;
    private RS_BusinessCatalogueDirectory BusinessCatalogueDirectory;

    public RS_ServiceLocation(String name) {
        this.name = name;
        BusinessCatalogueDirectory = new RS_BusinessCatalogueDirectory();
    }

