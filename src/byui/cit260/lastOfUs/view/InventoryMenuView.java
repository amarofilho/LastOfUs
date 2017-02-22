/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lastOfUs.view;

import java.util.Scanner;
import byui.cit260.lastOfUs.control.GameControl;

/**
 *
 * @author AmaroIdelfonso
 */
public class InventoryMenuView {
  
    private String inventoryMenu;
    
    public void displayInventoryMenuView() {
        boolean done = false;
        do{
            String inventoryMenuOption = this.getInventoryOption();
            if (inventoryMenuOption.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(inventoryMenuOption);
        } while (!done);
    }
    
    private String getInventoryOption(){
        Scanner keyboard = new Scanner(System.in);
        
        String value = "";
        boolean valid = false;
        
        while (!valid){
            System.out.println("\n "+ this.inventoryMenu);
            
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
            case "W":
                this.bottleWater();
                break;
            case "S":
                this.scalpel();
                break;
            case "L":
                this.linen();
                break;
            case "B":
                this.blaket();
                break;
            case "M":
                this.serumStick();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try again");
                break;
        }
        return false;
    }
        
    public InventoryMenuView() {
        
        this.inventoryMenu = "\n"
                + "\n---------------------------------------------------------"
                  + "\n|                Resources Options                     |"
                  + "\n---------------------------------------------------------"
                  + "\nW - Bottle of Water"
                  + "\nS - Scalpel"
                  + "\nL - Linen"
                  + "\nB - Blanket"
                  + "\nM - Serum Metal Stick"
                  + "\n---------------------------------------------------------";
    
    }

    private void bottleWater() {
        System.out.println("\n*** bottleWater() Called!!");
    }

    private void scalpel() {
        System.out.println("\n*** scalpel() Called!!");
    }

    private void linen() {
        System.out.println("\n*** linen() Called!!");
    }

    private void blaket() {
        System.out.println("\n*** blaket() Called!!");
    }
    
    private void serumStick() {
        System.out.println("\n*** serumStick() Called!!");
    }
}

    

