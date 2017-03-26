/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lastOfUs.control;

import byui.cit260.lastOfUs.exceptions.GameControlException;
import byui.cit260.lastOfUs.exceptions.MapControlException;
import byui.cit260.lastOfUs.model.Game;
import byui.cit260.lastOfUs.model.Inventory;
import byui.cit260.lastOfUs.model.Inventory.Item;
import byui.cit260.lastOfUs.model.Resources;
import byui.cit260.lastOfUs.model.Resources.Choices;
import byui.cit260.lastOfUs.model.Location;
import byui.cit260.lastOfUs.model.Map;
import byui.cit260.lastOfUs.model.Player;
import byui.cit260.lastOfUs.model.Scene;
import byui.cit260.lastOfUs.model.Scene.SceneType;
import byui.cit260.lastOfUs.view.ErrorView;
import byui.cit260.lastOfUs.view.GameMenuView;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import lastofusgame.LastOfUsGame;

/**
 *
 * @author Família Haitmann
 */
public class GameControl {

    public static void saveGame(Game currentGame, String filePath)
                        throws GameControlException{
        
        try( FileOutputStream fops = new FileOutputStream(filePath)){
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(currentGame);
        }catch (Exception e){
            throw new GameControlException(e.getMessage());
        }
        
    }

    public static void getSavedGame(String filePath)
                        throws GameControlException{
        
        Game game = null;
        
        try(FileInputStream fips = new FileInputStream(filePath)){
            ObjectInputStream input = new ObjectInputStream(fips);
            
            game = (Game) input.readObject();
        }
        catch(Exception ex){
            throw new GameControlException(ex.getMessage());
        }
        LastOfUsGame.setCurrentGame(game);
    }

    public static void printInventory(Inventory[] inventoryItem, String filePath) 
                            throws GameControlException{
        try( FileOutputStream fops = new FileOutputStream(filePath)){
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(inventoryItem);
        }catch (Exception e){
            throw new GameControlException(e.getMessage());
        }
        System.out.println("\n###############################################"
                         + "\n##Please check the file with your inventory!!##"
                         + "\n###############################################");
    }
    //my code start here!
    public static void resourcesPrint(Resources[] resourcesItem, String filePath) 
                            throws GameControlException{
        try( FileOutputStream fops = new FileOutputStream(filePath)){
            ObjectOutputStream output = new ObjectOutputStream(fops);
        
            output.writeObject(resourcesItem);
        }catch (Exception e){
            throw new GameControlException(e.getMessage());
        }
        System.out.println("\n------------------------------------------------"
                         + "\n-Your Report has been printed!-"
                         + "\n------------------------------------------------");
    }
    
    //My code finish here!
    
    private Player player;
    private Map map;
    private Location location;
    private Scene scene;
    
    public static Player createPlayer(String playersName)throws MapControlException {

        Player player = new Player();
        player.setName(playersName);
        
        if (playersName == null){
            throw new MapControlException("The Name of the Player can't be blank!!Press 'Q' to return...");
        
        }

                    
        LastOfUsGame.setPlayer(player);
        return player;
    }

    public static void createNewGame(Player player) throws MapControlException{
        
        Game game = new Game();
        LastOfUsGame.setCurrentGame(game);
        game.setPlayer(player);
        
        Inventory[] inventoryList = GameControl.createInventoryList();
        game.setInventory(inventoryList);
        
        Resources[] resourcesList = GameControl.createResourceList();
        game.setResources(resourcesList);
        
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
    
    private static Resources[] createResourceList() {
               
        Resources[] resourcesItem = new Resources[3];
        //resourceOption
        Resources useList = new Resources();
        useList.setName("Take an Inventory list");
        useList.setType(0);
        resourcesItem[Choices.useList.ordinal()] = useList;
        
        Resources takeMap = new Resources();
        takeMap.setName("Take a Map");
        takeMap.setType(0);
        resourcesItem[Choices.takeMap.ordinal()] = takeMap;
        
        Resources backscene = new Resources();
        takeMap.setName("Back to Last scene");
        takeMap.setType(0);
        resourcesItem[Choices.backscene.ordinal()] = backscene;
        
        
        
        return resourcesItem;
    }

    static void assignScenesToLocations(Map map, Scene[] scenes) {
            Location[][] locations = map.getLocations();
            
            locations[0][0].setScene(scenes[SceneType.OutOfHospital.ordinal()]);
            locations[0][1].setScene(scenes[SceneType.wallmart.ordinal()]);
            
    }
    
     private void startNewGame() {
        
        player = new Player();
        map = new Map();
        location = new Location();
        try{
            GameControl.createNewGame(LastOfUsGame.getPlayer());
        }catch(MapControlException mce){
            ErrorView.display(this.getClass().getName(),mce.getMessage());
            return;
        }catch(Throwable te){
            ErrorView.display(this.getClass().getName(),te.getMessage());
            te.printStackTrace();
            return;
        }    
            GameMenuView gameMenu = new GameMenuView();
            gameMenu.display();
                
    }
}
