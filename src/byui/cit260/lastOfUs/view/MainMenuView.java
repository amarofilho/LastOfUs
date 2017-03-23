/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lastOfUs.view;

import byui.cit260.lastOfUs.control.GameControl;
import byui.cit260.lastOfUs.exceptions.MapControlException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import lastofusgame.LastOfUsGame;

/**
 *
 * @author AmaroIdelfonso
 */
public class MainMenuView extends View {
    
    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice){
            case "N":
        {
            try {
                this.startNewGame();
            } catch (MapControlException ex) {
                Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                break;
            case "G":
                this.startExistingGame();
                break;
            case "H":
                this.displayHelpMenu();
                break;
            case "S":
                this.saveGame();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try again");
                break;
        }
        return false;
    }
        
    public MainMenuView(){
            super("\n"
                  + "\n---------------------------------------------------------"
                  + "\n|                     Main Menu                         |"
                  + "\n---------------------------------------------------------"
                  + "\nN - Start new game"
                  + "\nG - Get and start saved game"
                  + "\nH - Get help on how to play the game"
                  + "\nS - Save Game"
                  + "\nQ - Quit"
                  + "\n---------------------------------------------------------");
    }

    private void startNewGame() throws MapControlException {
        
        GameControl.createNewGame(LastOfUsGame.getPlayer());
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void startExistingGame() {
        System.out.println("*** startExistingGame function called ***");
    }

    private void displayHelpMenu() {
        /*System.out.println("*** displayHelpMenu function called ***");*/
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
        
        
                
    }    
    private void saveGame() {
       System.out.println("*** saveGame function called ***"); 
    }

}
