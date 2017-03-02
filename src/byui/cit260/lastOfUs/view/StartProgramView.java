/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lastOfUs.view;

import byui.cit260.lastOfUs.control.GameControl;
import byui.cit260.lastOfUs.model.Player;
import java.util.Scanner;

/**
 *
 * @author Família Haitmann
 */
public class StartProgramView {
    
    private String displayMessage;
    
    public StartProgramView(){
        this.displayMessage = "\n Please enter your name: ";
        //display the banner when view is created
        this.displayBanner();
    }
    
    private void displayBanner() {
        System.out.println(
        
            "\n**********************************************************************************"
        +    "\n                                                                                *"        
        +   "\n* This game is about a terrible accident on an important genetic laboratory, that*"
        +   "\n* has released a deadly virus, well, I guess deadly is not the right way         *"
        +   "\n* to describe it, because all people that get exposed to the virus,              *"
        +   "\n* besides dying in 2 hours, they don’t stand still to be buried, they rise again.*"
        +   "\n* The critical point is that the virus has took months until people started      *"
        +   "\n* getting seek, and you can’t imagine how quickly, until it was spread           *"
        +   "\n* throughout the world.                                                          *"
        +   "\n* Your character has awaken from a coma in a hospital in St George Utah, and     *"
        +   "\n* has discoved a misterious message from a man called John Smith. John was one   *"
        +   "\n* of the hospital’s security guards and he locked you at the hospital room to    *"
        +   "\n* protect you, and left the message believing you could wake up from coma.       *"
        +   "\n* Your goal is to survive, follow John´s leads, make sure to find him, get all   *"
        +   "\n* the supplies you can find and are useful, and together reach Rexburg Idaho.    *"
        +   "\n* You also have to find the place where this survivor group is gathered, so      *"
        +   "\n* you all can try using John´s blood to synthesize a cure.                       *"
        +   "\n                                                                                 *"                    
        +   "\n**********************************************************************************"
        );
    }

    public void displayStartProgramView() {
        
        boolean done  = false;
        do {
            String playersName = this.getPlayersName();
            if (playersName.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(playersName);
        }while (!done);
    }

    private String getPlayersName() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        while (!valid){
            System.out.println("\n "+ this.displayMessage);
            
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

    private boolean doAction(String playersName) {
        if (playersName.length() < 2){
            System.out.println("\nInvalid Players name: "+ "The name must be greater than 1 character");
            return false;
        }
        
        Player player = GameControl.createPlayer(playersName);
        
        if(player == null){
            System.out.println("\n Error creating the player");
            return false;
        }
        this.displayNextView(player);
        return true;
    }

    private void displayNextView(Player player) {
        System.out.println("\n=================================================="
                          +"\n Welcome to the game " + player.getName()
                          +"\n We hope you have a lot of fun!"
                          +"\n=================================================="
                          );
        MainMenuView mainMenuView = new MainMenuView();
                
        mainMenuView.displayMainMenuView();        
            
    }
    
}
