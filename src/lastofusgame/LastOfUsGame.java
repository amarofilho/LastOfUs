/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lastofusgame;

import byui.cit260.lastOfUs.model.Inventory;
import byui.cit260.lastOfUs.model.Player;

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
             
        
        
    }
    
    
}
