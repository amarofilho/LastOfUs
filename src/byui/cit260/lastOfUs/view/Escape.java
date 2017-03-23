/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lastOfUs.view;

import byui.cit260.lastOfUs.control.MapControl;
import byui.cit260.lastOfUs.exceptions.MapControlException;
import byui.cit260.lastOfUs.model.Player;
import java.io.BufferedReader;
import java.io.PrintWriter;
import static java.lang.Double.isNaN;
import java.util.Scanner;
import lastofusgame.LastOfUsGame;

/**
 *
 * @author Família Haitmann
 */
public class Escape {
   
    protected String banner;
    
    protected final BufferedReader keyboard = LastOfUsGame.getInFile();
    protected final PrintWriter console = LastOfUsGame.getOutFile();
    
    public void displayEscape() throws MapControlException{
        
        double done = 0.0;
        do{
            int userEntry = this.getUserInput();
                        
            done = this.doAction(userEntry);
        } while (done == 0.0);
        
        this.displayNextView(done);
    }    
    public Escape() {
        this.banner = "\n As the door is blocked, you will not be able to escape through the door, "
                  + "\n so you look out the window and notice you are at the 3rd floor, and it's"
                  + "\n too high, it would probably kill you. to escape through the window, you decide "
                  + "\n to make some rope with the available linen, but to know the size of the rope, "
                  + "\n you need to calculate the height from your window to the ground. To do so "
                  + "\n you have to drop an object similiar to a stone that you can find from the "
                  + "\n botton of you window, and count how many seconds it takes until hit the ground, "
                  + "\n then you apply the formula  (initialSpeed * totalTime) + (9,8*(totalTime)2) / 2"
                  + "\n where initial speed is zero, totalTime is the time you've counted, and "
                  + "\n 9.8 is the gravity velocity. "
                  + "\n"
                  + "\n"
                  + "\n Please enter the counted time:";  
        
    }
        private int getUserInput() throws MapControlException{
        
        int result = 0;    
        boolean valid = false;
        String value = null;
    try{    
        while (!valid){
            
                this.console.println("\n "+ this.banner); 
            
                value = this.keyboard.readLine();
                result = Integer.parseInt(value);
                        
            if(result <= 0 || isNaN(result)){
                ErrorView.display(this.getClass().getName(),"Number cannot be <= zero or you have not entered a number");
                continue;
            }
            break;
        }
    }catch(Exception e){
        ErrorView.display(this.getClass().getName(),"Error reading input: "+ e.getMessage());
    }       
        return result;
    }
    private double doAction(int userEntry) throws MapControlException {
        
        double result = 0; 
        try{
            MapControl mapControl = new MapControl();
            result = mapControl.displaycalcBuildingHeigh(userEntry);
        }catch(MapControlException me){
            ErrorView.display(this.getClass().getName(),me.getMessage());
        }    
        
        return result;
    }    
        
    private void displayNextView(double result) {
        this.console.println("\n=================================================="
                          +"\n The Height of the building is " + result +" meters!!"
                          +"\n This must be the size of your rope!"
                          +"\n=================================================="
                          );
        MapView mapView = new MapView();
                
        mapView.display(); 
          
    }    
    
}
