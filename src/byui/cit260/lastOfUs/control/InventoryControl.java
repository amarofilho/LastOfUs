/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lastOfUs.control;

import byui.cit260.lastOfUs.model.Game;
import byui.cit260.lastOfUs.model.Inventory;
import byui.cit260.lastOfUs.model.Inventory.Item;
import lastofusgame.LastOfUsGame;

/**
 *
 * @author Survivors of Brazil
 */
public class InventoryControl {
    
    public double calcBottlerOfWather(double consume){
        
         
        int distance;
        distance = 1;
        double teste;
        teste = 2.64;
        if (consume == teste){
            double liters = (teste * distance);
            return liters;
        }
        if (consume != 2.64){
            return -1;
        }
        
     return -1;
    }

    public void findIndex() {
        Item[] itens = Inventory.Item.values();
        int index = 0;
        for (Item Item : itens) {
            index++;
            System.out.println("####The index of "+Item.name()+" is "+Item.ordinal()+" ####");    
        }
        System.out.println("\n This array has "+ index+ " positions!!!");
    }
    
}

          

