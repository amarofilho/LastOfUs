/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lastofusgame;

import byui.cit260.lastOfUs.model.Inventory;
import byui.cit260.lastOfUs.model.Map;
import byui.cit260.lastOfUs.model.Player;
import byui.cit260.lastOfUs.model.Resources;
import byui.cit260.lastOfUs.model.Scene;

/**
 *
 * @author Survivors of Brazil
 */
public class LastOfUsGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Diogo Haitmann");
        playerOne.setGender("Male");
        playerOne.setAge(29);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        Inventory inventoryOne = new Inventory();
        
        inventoryOne.setItem("Map");
        
        String inventoryInfo = inventoryOne.toString();
        System.out.println(inventoryInfo);
        
        Scene sceneOne = new Scene();
        
        sceneOne.setName("Room");
        sceneOne.setType("First");
        sceneOne.setDescription("InsideHospital");
        
        String sceneInfo = sceneOne.toString();
        System.out.println(sceneInfo);
        
        Map mapOne = new Map();
        
        mapOne.setCityLocation("Saint George");
        mapOne.setSpotLocation("Hospital");
        
        String mapInfo = mapOne.toString();
        System.out.println(mapInfo);
        
        Resources resourcesOne = new Resources();
        
        resourcesOne.setName("tool1");
        resourcesOne.setType("tool2");
        resourcesOne.setStatus("tool3");
        resourcesOne.setQuantity(05);
        
        String resourcesInfo = resourcesOne.toString();
        System.out.println(resourcesInfo);
        
        
        
    }
    
    
}
