/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lastOfUs.view;

import byui.cit260.lastOfUs.control.GameControl;
import java.util.Scanner;
import lastofusgame.LastOfUsGame;

/**
 *
 * @author Família Haitmann
 */
public class GameMenuView {
    
    private String menu;
    
    public void displayMenu(){
            
        //InventoryMenuView inventoryMenu = new InventoryMenuView();
        //inventoryMenu.displayInventoryMenuView();
        boolean done = false;
        do{
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(menuOption);
        } while (!done);
    }    

    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in);
        
        String value = "";
        boolean valid = false;
        
        while (!valid){
            System.out.println("\n "+ this.menu);
            
            value = keyboard.nextLine();
            value = value.trim();
            
            if(value.isEmpty()){
                System.out.println("\n Invalid value: value can not be blank");
                continue;
            }
            break;
        }
        return value;
    }

    private boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice){
            case "R":
                this.searchForResources();
                break;
            case "F":
                this.findWayOut();
                break;
            case "H":
                this.healthCondition();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try again");
                break;
        }
        return false;
    }
        
    public GameMenuView(){
        this.menu = "\n My name is John Smith I´ve been trying to survive here in Saint George Utah  "
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
                  + "\n "
                  + "\n R - Search for resources"
                  + "\n F - Find a way out of the room"
                  + "\n H - Check your Health Condition"
                  + "\n Q - Quit Game"
                  + "\n---------------------------------------------------------";
    }

    private void searchForResources() {
        System.out.println("*** searchForResources() function called ***");
    }

    private void findWayOut() {
        System.out.println("*** findWayOut() function called ***");
    }

    private void healthCondition() {
        System.out.println("*** healthCondition() function called ***");
    }


    
    
    
}
