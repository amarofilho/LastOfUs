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
 * @author AmaroIdelfonso
 */
public class MainMenuView extends View {
    
   // private String menu;
    
   /* public void displayMainMenuView() {
        boolean done = false;
        do{
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(menuOption);
        } while (!done);
    }*/

   /* private String getMenuOption() {
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
    }*/

    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice){
            case "N":
                this.startNewGame();
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

    private void startNewGame() {
        
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
