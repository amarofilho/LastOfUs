/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lastOfUs.control;

import byui.cit260.lastOfUs.exceptions.InventoryControlExeptions;
import byui.cit260.lastOfUs.model.Game;
import byui.cit260.lastOfUs.model.Inventory;
import byui.cit260.lastOfUs.model.Inventory.Item;
import byui.cit260.lastOfUs.model.Resources;
import byui.cit260.lastOfUs.model.Resources.Choices;
import lastofusgame.LastOfUsGame;

/**
 *
 * @author Survivors of Brazil
 */
public class InventoryControl {
    
    public void calcBottlerOfWather(double consume)
                    throws InventoryControlExeptions{
        
         
        int distance;
        distance = 1;
        double teste;
        teste = 2.64;
        if (consume == teste){
            double liters = (teste * distance);
            
        }
        if (consume != 2.64){
            throw new InventoryControlExeptions(""+ consume+ " isn´t a number"
                                                +" Please,insert only numbers");
        }
        
    
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
    
    public void showArray() {
        Choices[] itens = Resources.Choices.values();
        int index = 0;
        for (Choices Choice : itens) {
            index++;
            System.out.println("The index list of itens "+Choice.name()+" is "+Choice.ordinal()+"");    
        }
        System.out.println("\n This array has "+ index+ " options!!!");
    }
}

          

