/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lastOfUs.control;

/**
 *
 * @author Survivors of Brazil
 */
public class MapControl {
    
    public double calcBuildingHeight(int initialSpeed,double gravitySpeed,int totalTime){
        
        if(initialSpeed != 0){
            return -1;
        }
        if(gravitySpeed != 9.8){
            return -1;
        }
        double height = (initialSpeed * totalTime) + (9.8 * (Math.pow(totalTime, 2))) / 2;
        
        return height;
    }
}
