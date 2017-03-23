/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lastOfUs.view;

import byui.cit260.lastOfUs.control.GameControl;
import byui.cit260.lastOfUs.exceptions.MapControlException;
import byui.cit260.lastOfUs.model.Game;
import byui.cit260.lastOfUs.model.Inventory;
import byui.cit260.lastOfUs.model.Location;
import byui.cit260.lastOfUs.model.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import lastofusgame.LastOfUsGame;

/**
 *
 * @author Família Haitmann
 */
public class GameMenuView extends View {
   
    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice){
            case "M":
                this.displayMap();
                break;
            case "I":
                this.viewInventory();
                break;
            case "R":
                this.searchForResources();
                break;
            case "F":
        {
            try {
                this.findWayOut();
            } catch (Exception ex) {
                ErrorView.display(this.getClass().getName(),ex.getMessage());
            }
        }
                break;
            case "H":
                this.healthCondition();
                break;
            default:
                ErrorView.display(this.getClass().getName(),"\n*** Invalid Selection *** Try again");
                break;
        }
        return false;
    }
        
    public GameMenuView(){
        super("\n My name is John Smith I´ve been trying to survive here in Saint George Utah  "
                  + "\n but things are getting worse day after day, I’ve lost all my family and friends,"
                  + "\n and I don’t remember the last time I saw a living person. I don’t know why the "
                  + "\n virus seems not to affect me, I was bitten by my neighbor when I was trying to "
                  + "\n help her husband, but so far, I still feel ok. As far as I know everyone that is "
                  + "\n bitten don´t last more than 2 hours, so don´t bet bitten or even get in contact "
                  + "\n with any contaminated person. After reading this message, please come after me, "
                  + "\n I’m going towards Rexburg Idaho, I heard though a radio broadcast, that there "
                  + "\n are some people which has found a way to survive to all this chaos, and work "
                  + "\n to find a cure. Perhaps the answer to stop this virus is current running in "
                  + "\n my veins. I’m stopping from time to time to search for supplies, and I´ll always "
                  + "\n leave a red mark throughout may way.  Ps - Be careful to everyone you can possibly "
                  + "\n meet along the road. I've blocked the door to protect you from them, so good luck. "
                  + "\n "
                  + "\n Choose on the below menu your next action"
                  + "\n "
                  + "\n M - View Map"
                  + "\n I - View Inventory"
                  + "\n R - Search for resources"
                  + "\n F - Find a way out of the room"
                  + "\n H - Check your Health Condition"
                  + "\n Q - Quit Game"
                  + "\n---------------------------------------------------------");
    }

    private void searchForResources() {
        InventoryMenuView inventoryMenu = new InventoryMenuView();
        inventoryMenu.display();
    }

    private void findWayOut() throws MapControlException, Exception {
        Escape escape = new Escape();
        escape.displayEscape();
    }

    private void healthCondition() {
        this.console.println("*** healthCondition() function called ***");
    }

    private void displayMap() {
        StringBuilder line;
        Game game = LastOfUsGame.getCurrentGame();
        Map map = game.getMap();
        Location[][] locations = map.getLocations();
        
        this.console.println("\n      WEST OF USA MAP");
        line = new StringBuilder("                                  ");
        line.insert(0, "1");
        line.insert(5, "2");

        this.console.println(line.toString());
        
        for(int i=0; i < locations.length; i++){
            
            for(int j=0; j < locations.length; j++){
                line.insert(0,locations[i][j]);
            }            
               
            this.console.println(line.toString());
        }
    }  
    

    private void viewInventory() {
        StringBuilder line;
        
        Game game = LastOfUsGame.getCurrentGame();
        Inventory[] inventoryItem = game.getInventory();
        
        this.console.println("\n      LIST OF INVENTORY ITENS");
        line = new StringBuilder("                                  ");
        line.insert(0, "DESCRIPTION");
        line.insert(20, "IN STOCK");
        this.console.println(line.toString());
        
        for(Inventory item : inventoryItem){
            line = new StringBuilder("                                  ");
            line.insert(0,item.getDescription());
            line.insert(25,item.getQuantityInStock());
            if(item.getDescription()== null){
                break;
            }
            this.console.println(line.toString());
        }
    }    
}
