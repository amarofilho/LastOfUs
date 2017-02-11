/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lastOfUs.control;

import byui.cit260.lastOfUs.model.Spot;

/**
 *
 * @author Survivors of Brazil
 */
public class MapControl {
    
    public int movePlayerToSpot( int option){
        
        if(option < 1){
            return -1;
        }
        if(option > 2){
            return -1;
        }
        int result = 3 - option;
        
        return result;
    }    
    
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
    
    
    public double calcTrainSpeed(int distance, int speedUser, int time, int acceleration){
        
        if(distance != 1500){
            return -1;
        }
        if(time != 30){
            return -1;
		
        }
        if(acceleration != 7){
            return - 1;
        }
	if(speedUser != -55){
	    return -1;
        }
		
        double initialSpeed = (distance/time) - ((acceleration * time) / 2);
        
        return initialSpeed;
    }
}
