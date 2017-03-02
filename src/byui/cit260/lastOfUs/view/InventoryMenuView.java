/*
 * To change this license header, choose License Headers in Project Properties.
 * To chwange this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lastOfUs.view;

import java.util.Scanner;
import byui.cit260.lastOfUs.control.InventoryControl;


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
        
        this.inventoryMenu = "This is a long journey, full of many obastacles and challenges."
                  + "\nTo acomplish this, the best thing to do is chose one of the"
                  + "\ntools below. But you must be prepared to be tested when you"
                  + "\nchoose one of them. Good Luck!\n"
                
                  + "\n---------------------------------------------------------"
                  + "\n|                Resources Options                     |"
                  + "\n---------------------------------------------------------"
                  + "\nW - Bottle of Water"
                  + "\nS - Scalpel"
                  + "\nL - Linen"
                  + "\nB - Blanket"
                  + "\nM - Serum Metal Stick"
                  + "\nQ - Back to main menu"
                  + "\n---------------------------------------------------------";
    
    }

    private void bottleWater() {
       /*System.out.println("\n*** bottlerWater() Called!!"); */
       CalcWaterView calcWaterView = new CalcWaterView();
        calcWaterView.displayCalcWaterView();
      
    }
    private void scalpel(){
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

    

