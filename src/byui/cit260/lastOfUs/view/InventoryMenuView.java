/*
 * To change this license header, choose License Headers in Project Properties.
 * To chwange this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lastOfUs.view;

import java.util.Scanner;
import byui.cit260.lastOfUs.control.InventoryControl;
import byui.cit260.lastOfUs.model.Inventory;
import byui.cit260.lastOfUs.model.Inventory.Item;


/**
 *
 * @author AmaroIdelfonso
 */
public class InventoryMenuView extends View{
  
    @Override
    public boolean doAction(String choice) {
        
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
            case "O":
                this.othersResources();
                break;
            default:
                ErrorView.display(this.getClass().getName(),"\n*** Invalid Selection *** Try again");
                break;
        }
        return false;
    }
        
    public InventoryMenuView() {
        
        super("This is a long journey, full of many obastacles and challenges."
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
                  + "\nO - Others Resources"
                  + "\nQ - Back to main menu"
                  + "\n---------------------------------------------------------");
    
    }

    private void bottleWater() {
      
       CalcWaterView calcWaterView = new CalcWaterView();
        calcWaterView.displayCalcWaterView();
      
    }
    private void scalpel(){
        InventoryControl findScalpel = new InventoryControl();
        findScalpel.findIndex();
    }

    private void linen() {
        this.console.println("\n*** linen Added to inventory!!");
        
    }

    private void blaket() {
        this.console.println("\n*** blaket Added to inventory!!");
    }
    
    private void serumStick() {
        this.console.println("\n*** serumStick Added to inventory!!");
    }
    
    private void othersResources(){
      InventoryControl showResources = new InventoryControl();
        showResources.showArray();  
    
}
}

    

