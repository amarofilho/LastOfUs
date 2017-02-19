/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lastOfUs.control;

import byui.cit260.lastOfUs.model.Map;
import byui.cit260.lastOfUs.model.Player;
import byui.cit260.lastOfUs.model.Scene;
import byui.cit260.lastOfUs.model.Spot;
import lastofusgame.LastOfUsGame;

/**
 *
 * @author Família Haitmann
 */
public class GameControl {

    public static Player createPlayer(String playersName) {
        if (playersName == null){
            return null;
        }
        Player player = new Player();
        player.setName(playersName);
        
        LastOfUsGame.setPlayer(player);
        return player;
    }

    public static void createNewGame(Player player) {
        System.out.println("\n*** CreateNewGame stub function called ***");
    }
    
    private Player player;
    private Map map;
    private Spot spot;
    private Scene scene;
    
    private void startNewGame(){
        
        player = new Player();
        map = new Map();
        spot = new Spot();
        
        map.setCityLocation("Saint George");
        spot.setName("Hospital");
                
    }
}
