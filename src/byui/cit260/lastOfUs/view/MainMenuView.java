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
                ErrorView.display(this.getClass().getName(),ex.getMessage());
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
                ErrorView.display(this.getClass().getName(),"\n*** Invalid Selection *** Try again");
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
        this.console.println("\n\nEnter the file path for file where the game "
                             +"is to be saved.");
        
        String filePath = this.getInput();
        
        try{
            GameControl.getSavedGame(filePath);
        }catch (Exception ex){
            ErrorView.display("MainMenuView",ex.getMessage());
        }
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void displayHelpMenu() {
    
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
        
        
                
    }    
    private void saveGame() {
       this.console.println("\n\nEnter the file path for file where the game "
                            +"is to be saved."); 
       String filePath = this.getInput();
       
        try{
           GameControl.saveGame(LastOfUsGame.getCurrentGame(),filePath);
        }catch(Exception ex){
            ErrorView.display("MainMenuView", ex.getMessage());
        }
    }

}
