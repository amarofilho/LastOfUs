/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lastofusgame;

import byui.cit260.lastOfUs.model.Actor;
import byui.cit260.lastOfUs.model.Ally;
import byui.cit260.lastOfUs.model.Enemy;
import byui.cit260.lastOfUs.model.Game;
import byui.cit260.lastOfUs.model.Inventory;
import byui.cit260.lastOfUs.model.Map;
import byui.cit260.lastOfUs.model.Player;
import byui.cit260.lastOfUs.model.Resources;
import byui.cit260.lastOfUs.model.Scene;
import byui.cit260.lastOfUs.view.StartProgramView;

/**
 *
 * @author Survivors of Brazil
 */
public class LastOfUsGame {

    /**
     * @param args the command line arguments
     */
    private static Game currentGame = null;
    private static Player player = null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        LastOfUsGame.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        LastOfUsGame.player = player;
    }
    
    public static void main(String[] args) {
        
        StartProgramView startProgramView = new StartProgramView();
        try{
            startProgramView.displayStartProgramView();
        }catch (Throwable te){
            System.out.println(te.getMessage());
            te.printStackTrace();
            startProgramView.displayStartProgramView();
        }
    }
    
    
}

