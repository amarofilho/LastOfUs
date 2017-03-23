/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lastOfUs.view;

import byui.cit260.lastOfUs.control.GameControl;
import byui.cit260.lastOfUs.exceptions.MapControlException;
import byui.cit260.lastOfUs.model.Player;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
import lastofusgame.LastOfUsGame;

/**
 *
 * @author Família Haitmann
 */
public class StartProgramView {
    
    protected String displayMessage;
    
    protected final BufferedReader keyboard = LastOfUsGame.getInFile();
    protected final PrintWriter console = LastOfUsGame.getOutFile();
    
    public StartProgramView(){
        this.displayMessage = "\n Please enter your name: ";
        //display the banner when view is created
        this.displayBanner();
    }
    
    private void displayBanner() {
        this.console.println(
        
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

    public void displayStartProgramView() throws MapControlException{
        
        boolean done  = false;
        do {
            String playersName = this.getPlayersName();
            if (playersName.toUpperCase().equals("Q"))
                return;
           
            done = this.doAction(playersName);
           
            
        }while (!done);
    }
    
    private String getPlayersName() throws MapControlException{
        
        String value = "";
        boolean valid = false;
    try{    
        while (!valid){
            this.console.println("\n "+ this.displayMessage);
            
                value = this.keyboard.readLine();
                value = value.trim();
           
            if(value.isEmpty()){
                throw new MapControlException("Player's name cannot be blank!!Try Again...");
            
            }
            break;
        }
    }catch(Exception e){
        ErrorView.display(this.getClass().getName(),"You must enter a value!! "+ e.getMessage());
    }    
        return value;
    }
    private boolean doAction(String value) throws MapControlException {

            try{
                Player player = GameControl.createPlayer(value);
                this.displayNextView(player);
            }catch(MapControlException mce){
                ErrorView.display(this.getClass().getName(),mce.getMessage());
            }
        
        return true;
    }

    private void displayNextView(Player player) {
        this.console.println("\n=================================================="
                          +"\n Welcome to the game " + player.getName()
                          +"\n We hope you have a lot of fun!"
                          +"\n=================================================="
                          );
        MainMenuView mainMenuView = new MainMenuView();
                
        mainMenuView.display();        
            
    }
    
}
