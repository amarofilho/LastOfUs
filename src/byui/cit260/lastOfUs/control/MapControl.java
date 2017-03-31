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
        
        Map map = new Map(10, 10);
        
        Scene[] scenes = createScenes();
        
        GameControl.assignScenesToLocations(map, scenes);
        return map;        
    }

    public static Scene[] createScenes() {
        Scene[] scenes = new Scene[SceneType.values().length];
        
        Scene outOfHospital = new Scene();
        outOfHospital.setDescription("\n Good job!! you are now out of the Hospital,"
                + "\n you have to watch your back because there are a lot of dangers"
                + "\n outside. Choose your next move carefully so you don't get in trouble."
                + "\n                                                                      "
                + "\n                                                                      "
                + "\n W - Go to Wallmart search for supplies                               "
                + "\n M - Move to another City                                             "
                + "\n                                                                      ");
        outOfHospital.setMapSymbol("HP");
        outOfHospital.setBlocked(false);
        scenes[SceneType.OutOfHospital.ordinal()] = outOfHospital;
        
        Scene wallmart = new Scene();
        wallmart.setDescription("\n Of course you are not the first one to think in go to"
                + "\n wallmart and find some supplies, so there is not much things left,"
                + "\n but for sure you can find find something usefull for your journey."
                + "\n                                                                      "
                + "\n                                                                      ");
        wallmart.setMapSymbol("WM");
        wallmart.setBlocked(false);
        scenes[SceneType.wallmart.ordinal()] = wallmart;
        
        Scene cedarCity = new Scene();
        cedarCity.setDescription("\n Now you have reached Cedar City, remember to be aways alert."
                + "\n looks like you can see a red mark in a drugstore, it means that John has been there,"
                + "\n Choose your next move."
                + "\n                                                                      "
                + "\n                                                                      "
                + "\n L - Check the Drugstore and look for supplies                        "
                + "\n F - Move to Fillmore City                                            "
                + "\n E - Move to Ely City                                                 "
                + "\n N - Move to Nephi City                                               "
                + "\n T - Move to Twin Falls City                                          "
                + "\n                                                                      ");
        cedarCity.setMapSymbol("CC");
        cedarCity.setBlocked(false);
        scenes[SceneType.cedarCity.ordinal()] = cedarCity;
        
        Scene fillmore = new Scene();
        fillmore.setDescription("\n In Fillmore you sudenly come across the Governor Boggs..."
                + "\n He is an evil man an may represent a threat for you, but he didn't see you"
                + "\n yet, so what do you do?                                                   "
                + "\n                                                                           "
                + "\n                                                                           "
                + "\n K - Try to Kill Governor Bogg                                             "
                + "\n N - Move to Nephi City without being seen                                 "
                + "\n                                                                           ");
        
        fillmore.setMapSymbol("FM");
        fillmore.setBlocked(false);
        scenes[SceneType.fillmore.ordinal()] = fillmore;
        
        Scene nephi = new Scene();
        nephi.setDescription("\n Here in Nephi is a good place for you to search for supplies..."
                + "\n The problem is that many people may have thought the same, so be carefull"
                + "\n as you scavenge, there are a lot of undead people on the streets very close "
                + "\n to the best places to search, so what do you do?                            "
                + "\n                                                                           "
                + "\n                                                                           "
                + "\n T - Take chances and scavenge anyway                                      "
                + "\n P - Move to Payson City without being seen                                "
                + "\n V - Move to Provo City without being seen                                 "
                + "\n                                                                           ");
        
        nephi.setMapSymbol("NF");
        nephi.setBlocked(false);
        scenes[SceneType.nephi.ordinal()] = nephi;
        
        Scene twinFalls = new Scene();
        twinFalls.setDescription("\n It was a long journey untill you arrive here in Twin Falls..."
                + "\n Now you are running out of resources, you must find some food and water, and"
                + "\n a secure place to spend the night. what of below places do you choose?    "
                + "\n                                                                           "
                + "\n                                                                           "
                + "\n M - A Moseum                                                              "
                + "\n C - A LDS Church                                                       "
                + "\n S - A Mall                                                                "
                + "\n                                                                           ");
        
        twinFalls.setMapSymbol("TF");
        twinFalls.setBlocked(false);
        scenes[SceneType.twinFalls.ordinal()] = twinFalls;
        
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
