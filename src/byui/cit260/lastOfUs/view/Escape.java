/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lastOfUs.view;

import byui.cit260.lastOfUs.control.MapControl;
import byui.cit260.lastOfUs.model.Player;
import static java.lang.Double.isNaN;
import java.util.Scanner;

/**
 *
 * @author Família Haitmann
 */
public class Escape {
   
    private String banner;
    
    public void displayEscape(){
        
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
        private int getUserInput() {
        Scanner keyboard = new Scanner(System.in);
        
        int value = 0;
        boolean valid = false;
        
        while (!valid){
            
            System.out.println("\n "+ this.banner); 
            
            value = keyboard.nextInt();
                        
            if(value == 0){
                System.out.println("\n Invalid value: value can not be blank");
                continue;
            }
            if(isNaN(value)){
                System.out.println("\n Invalid value: Is not a Number");
                continue;
            }
            break;
        }
        
        return value;
    }
    private double doAction(int userEntry) {
        
        double result; 
        MapControl mapControl = new MapControl();
        result = mapControl.displaycalcBuildingHeigh(userEntry);
        
        return result;
    }    
        
    private void displayNextView(double result) {
        System.out.println("\n=================================================="
                          +"\n The Height of the building is " + result
                          +"\n This must be the size of your rope!"
                          +"\n=================================================="
                          );
        MapView mapView = new MapView();
                
        mapView.displayMapMenuView(); 
          
    }    
    
}
