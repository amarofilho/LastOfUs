/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lastOfUs.control;

import byui.cit260.lastOfUs.exceptions.MapControlException;
import byui.cit260.lastOfUs.model.Map;
import byui.cit260.lastOfUs.model.Scene;
import byui.cit260.lastOfUs.model.Scene.SceneType;
import byui.cit260.lastOfUs.view.ErrorView;
import java.io.BufferedReader;
import java.io.PrintWriter;
import lastofusgame.LastOfUsGame;


/**
 *
 * @author Survivors of Brazil
 */
public class MapControl {
    
    protected final BufferedReader keyboard = LastOfUsGame.getInFile();
    protected final PrintWriter console = LastOfUsGame.getOutFile();
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

    public double displaycalcBuildingHeigh(int totalTime) throws MapControlException  {
        
        int initialSpeed = 0;
        double gravitySpeed = 9.8;
        double height = 0;
        try{
            height = (initialSpeed * totalTime) + (gravitySpeed * (Math.pow(totalTime, 2))) / 2;
        }catch(ArithmeticException ae){
            ErrorView.display(this.getClass().getName(),"The number you've entered cannot be zero!!");
        }
        return height;
    }

}
