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
public class HelpMenuView {
    private String menu;
    
    public void displayMainMenuView() {
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
                System.out.println("\n*** Invalid Selection *** Try again");
                break;
        }
        return false;
    }
        
    public HelpMenuView(){
        this.menu = "\n"
                  + "\n---------------------------------------------------------"
                  + "\n|                     Getting Help                       |"
                  + "\n---------------------------------------------------------"
                  + "\nG - What is the goal of the game?"
                  + "\nM - How to move"
                  + "\nE - Estimating the amount of resources"
                  + "\nH - Harvesting resources"
                  + "\nD - Delivering resources to warehouse"
                  + "\n---------------------------------------------------------";
    }

    private void gameGoal() {
        System.out.println("*** Gamegoal function called ***");
    }

    private void howMove() {
        System.out.println("*** How to move function called ***");
    }

    private void amoutResources() {
        System.out.println("*** Estimating the amount of resources called ***");
    }

    private void harvestingResources() {
       System.out.println("*** harvesting Resources function called ***"); 
    }
    
    private void deliveringRecources() {
       System.out.println("*** Delivering resources to warehouse function called ***"); 
    }

    
}
