/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lastOfUs.view;


import java.util.Scanner;


/**
 *
 * @author AmaroIdelfonso
 */
public class HelpMenuView extends View{

    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice){
            case "G":
                this.gameGoal();
                break;
            case "M":
                this.howMove();
                break;
            case "E":
                this.amoutResources();
                break;
            case "H":
                this.harvestingResources();
                break;
            case "D":
                this.deliveringRecources();
                break;    
            default:
                ErrorView.display(this.getClass().getName(),"\n*** Invalid Selection *** Try again");
                break;
        }
        return false;
    }
        
    public HelpMenuView(){
        super("\n"            
                
                  + "\n---------------------------------------------------------"
                  + "\n|                     Getting Help                       |"
                  + "\n---------------------------------------------------------"
                  + "\nG - What is the goal of the game?"
                  + "\nM - How to move"
                  + "\nE - Estimating the amount of resources"
                  + "\nH - Harvesting resources"
                  + "\nD - Delivering resources to warehouse"
                  + "\nQ - Back to main menu"
                  + "\n---------------------------------------------------------");
    }

    private void gameGoal() {
        this.console.println(" The ultimate goal of the game is survive until reaching"
                             +"\n the city of Rexburg,ID. During the journey the player"
                             +"\n will be tested and make use of some resources as water,"
                             +"\n rope and sometimes should fight against enemies.");
    }

    private void howMove() {
        this.console.println("All the moviment during the game must be made using"
                             +"\n letter opitions and menus.");
    }

    private void amoutResources() {
        this.console.println("All the resources avaliable in the game are:"
                             + "\n1 bottler of water."
                             + "\n1 rope."
                             + "\n1 medice kit."
                             + "\n1 Scalpel." 
                             + "\n1 Linen." 
                             + "\n1 Blanket." 
                             + "\n1 Serum Metal Stick."
                             + "\n24 extras resources hidden in a game scene.");
    }

    private void harvestingResources() {
       this.console.println(" To get the avaliables Resources the player must, in"
                            + "\n some cases, answer questions, while sometimes the"
                            + "\n resources will be delivered After reaching"
                            + "\n certain stages of the game."); 
    }
    
    private void deliveringRecources() {
       this.console.println("While some resources must be used immediately, others"
                            + "\n resources can be added to the inventory and used"
                            + "\n according to the user choice."); 
    }

    
}
