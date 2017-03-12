/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lastOfUs.control;

import byui.cit260.lastOfUs.model.Game;
import byui.cit260.lastOfUs.model.Inventory;
import byui.cit260.lastOfUs.model.Inventory.Item;
import byui.cit260.lastOfUs.model.Location;
import byui.cit260.lastOfUs.model.Map;
import byui.cit260.lastOfUs.model.Player;
import byui.cit260.lastOfUs.model.Scene;
import byui.cit260.lastOfUs.model.Scene.SceneType;
import lastofusgame.LastOfUsGame;

/**
 *
 * @author Família Haitmann
 */
public class GameControl {
    
    private Player player;
    private Map map;
    private Location location;
    private Scene scene;

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
        
        Game game = new Game();
        LastOfUsGame.setCurrentGame(game);
        game.setPlayer(player);
        
        Inventory[] inventoryList = GameControl.createInventoryList();
        game.setInventory(inventoryList);
        
        Map map = MapControl.createMap();
        game.setMap(map);
        
        MapControl.moveActorsToStartingLocation(map);
    }

    private static Inventory[] createInventoryList() {
        
        Inventory[] inventoryItem = new Inventory[14];
        
        Inventory waterBottle = new Inventory();
        waterBottle.setDescription("Bottle of Water");
        waterBottle.setQuantityInStock(0);
        inventoryItem[Item.waterBottle.ordinal()] = waterBottle;
        
        Inventory scalpel = new Inventory();
        scalpel.setDescription("Scalpel");
        scalpel.setQuantityInStock(0);
        inventoryItem[Item.scalpel.ordinal()] = scalpel;
        
        Inventory linen = new Inventory();
        scalpel.setDescription("Linen");
        scalpel.setQuantityInStock(0);
        inventoryItem[Item.linen.ordinal()] = linen;
        
        Inventory blanket = new Inventory();
        scalpel.setDescription("Blanket");
        scalpel.setQuantityInStock(0);
        inventoryItem[Item.blanket.ordinal()] = blanket;

        Inventory mStick = new Inventory();
        scalpel.setDescription("Serum Metal Stick");
        scalpel.setQuantityInStock(0);
        inventoryItem[Item.metalStick.ordinal()] = mStick;
        
        return inventoryItem;
    }

    static void assignScenesToLocations(Map map, Scene[] scenes) {
            Location[][] locations = map.getLocations();
            
            locations[0][0].setScene(scenes[SceneType.OutOfHospital.ordinal()]);
            locations[0][1].setScene(scenes[SceneType.wallmart.ordinal()]);
            
    }
    
     private void startNewGame(){
        
        player = new Player();
        map = new Map();
        location = new Location();
        
                
    }
}
