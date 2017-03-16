/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lastOfUs.view;
import byui.cit260.lastOfUs.control.InventoryControl;
import byui.cit260.lastOfUs.exceptions.InventoryControlExeptions;
import static java.lang.Double.isNaN;
import java.util.Scanner;

/**
 *
 * @author AmaroIdelfonso
+ */
/*public class CalcWaterView {
    InventoryControl calcBottlerOfWather = new InventoryControl();*/

//public double message(){
  //     System.out.println("\n*** You chosen bottle of water. Now you must"
   //                       + "\n know the necessary amount of water!!");

public class CalcWaterView {
    private String infor;
    
    public void displayCalcWaterView(){
        
        double done = 0.0;
        do{
            double userEntry = this.getUserInput();
            
            done = this.doAction(userEntry);
        }while (done == 0.0);
        
        this.displayNextView(done);
    }
    public CalcWaterView(){
        this.infor = "\n For each kilometer your body will consume 0.055 lierts"
                + "\n of water. You will walk 48 kilometers of distance until your"
                + "\n final destiny. Now as you know this information, insert the"
                + "\n liters of water necessary to complete this journey."
                + "\n"
                + "\n Insert liters:";
    }
    
        private double getUserInput(){
            Scanner keyboard = new Scanner (System.in);
            
            double value = 0.0;
            boolean valid = false;
            
            while (!valid){
                System.out.println("\n"+ this.infor);
                value = keyboard.nextDouble();
                
                if(value != 2.64){
                    System.out.println("\n Sorry! Calculate again");
                    continue;
                }
                if(isNaN(value)){
                    System.out.println("\n Please insert only number");
                    continue;
                }
                break;
            }
            return value;
        }
     private double doAction(double userEntry){
         double result = 2.64;
         InventoryControl inventoryControl= new InventoryControl();
         //result=
         try {
         inventoryControl.calcBottlerOfWather(userEntry);
         }
         catch (InventoryControlExeptions me){
             System.out.println(me.getMessage());
         }
         
         return result;
     }
      private void displayNextView(double result){
          System.out.println("\n You are right! " + result + " are the liters of"
                             + "\n water necessary to complete this journey.");
          
          MapView mapView = new MapView();
                
        mapView.display();
      }
      

        }
    