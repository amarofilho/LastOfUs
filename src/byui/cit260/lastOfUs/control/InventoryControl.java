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
import java.io.BufferedReader;
import java.io.PrintWriter;
import lastofusgame.LastOfUsGame;

/**
 *
 * @author Survivors of Brazil
 */
public class InventoryControl {
    
    protected final BufferedReader keyboard = LastOfUsGame.getInFile();
    protected final PrintWriter console = LastOfUsGame.getOutFile();
    
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
            this.console.println("####The index of "+Item.name()+" is "+Item.ordinal()+" ####");    
        }
        this.console.println("\n This array has "+ index+ " positions!!!");
    }
    
    public void showArray() {
        Choices[] itens = Resources.Choices.values();
        int index = 0;
        for (Choices Choice : itens) {
            index++;
            this.console.println("Resource name: "+Choice.name()+" is at array nº "+Choice.ordinal()+"");    
        }
        this.console.println("\n This array has "+ index+ " options!!!");
    }
}

          

