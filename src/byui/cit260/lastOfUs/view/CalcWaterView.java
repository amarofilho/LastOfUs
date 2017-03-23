/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lastOfUs.view;
import byui.cit260.lastOfUs.control.InventoryControl;
import byui.cit260.lastOfUs.exceptions.InventoryControlExeptions;
import java.io.BufferedReader;
import java.io.PrintWriter;
import static java.lang.Double.isNaN;
import java.util.Scanner;
import lastofusgame.LastOfUsGame;

public class CalcWaterView {
    
    protected String infor;
    
    protected final BufferedReader keyboard = LastOfUsGame.getInFile();
    protected final PrintWriter console = LastOfUsGame.getOutFile();
    
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
                        
            String value = null;
            boolean valid = false;
            double result = 0.0;
        
        try{    
            while (!valid){
                this.console.println("\n"+ this.infor);
                value = this.keyboard.readLine();
                result = Double.parseDouble(value);
                
                if(result != 2.64){
                    ErrorView.display(this.getClass().getName(),"\n Sorry! Calculate again");
                    continue;
                }
                if(isNaN(result)){
                    ErrorView.display(this.getClass().getName(),"\n Please insert only number");
                    continue;
                }
                break;
            }
        }catch(Exception e){
        ErrorView.display(this.getClass().getName(),"Error reading input: "+ e.getMessage());
        }    
            return result;
        }
        
     private double doAction(double userEntry){
         double result = 2.64;
         InventoryControl inventoryControl= new InventoryControl();
         //result=
         try {
         inventoryControl.calcBottlerOfWather(userEntry);
         }
         catch (InventoryControlExeptions me){
             ErrorView.display(this.getClass().getName(),me.getMessage());
         }
         
         return result;
     }
      private void displayNextView(double result){
          this.console.println("\n You are right! " + result + " are the liters of"
                             + "\n water necessary to complete this journey.");
          
          MapView mapView = new MapView();
                
        mapView.display();
      }
      

        }
    