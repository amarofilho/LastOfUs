/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lastOfUs.control;

import byui.cit260.lastOfUs.model.Map;
import byui.cit260.lastOfUs.model.Scene;
import byui.cit260.lastOfUs.model.Scene.SceneType;


/**
 *
 * @author Survivors of Brazil
 */
public class MapControl {

    public static Map createMap() {
        
        Map map = new Map(20, 20);
        

        Scene[] scenes = createScenes();
        
        GameControl.assignScenesToLocations(map, scenes);
        return map;        
    }

    static void moveActorsToStartingLocation(Map map) {
        System.out.println("moveActorsToStartingLocation function called!!!");
    }

    private static Scene[] createScenes() {
        Scene[] scenes = new Scene[SceneType.values().length];
        
        Scene outOfHospital = new Scene();
        outOfHospital.setDescription("\n Good job!! you are now out of the Hospital,"
                + "\n you have to watch your back because there are a lot of dangers"
                + "\n outside. Choose your next move carefully so you don't get in trouble.");
        outOfHospital.setMapSymbol("HP");
        outOfHospital.setBlocked(false);
        scenes[SceneType.OutOfHospital.ordinal()] = outOfHospital;
        
        Scene wallmart = new Scene();
        wallmart.setDescription("\n Of course you are not the first one to think in go to"
                + "\n wallmart and find some supplies, so there is not much things left,"
                + "\n much for sure you can find find something usefull for your journey.");
        wallmart.setMapSymbol("HP");
        wallmart.setBlocked(false);
        scenes[SceneType.wallmart.ordinal()] = wallmart;
        
        return scenes;
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

    public double displaycalcBuildingHeigh(int totalTime) {
        
        int initialSpeed = 0;
        double gravitySpeed = 9.8;
        
        double height = (initialSpeed * totalTime) + (gravitySpeed * (Math.pow(totalTime, 2))) / 2;
        
        return height;
    }

}
