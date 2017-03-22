/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lastofusgame;

import byui.cit260.lastOfUs.exceptions.MapControlException;
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
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    private static PrintWriter logFile = null;

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

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        LastOfUsGame.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        LastOfUsGame.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        LastOfUsGame.logFile = logFile;
    }
    
    
    
    public static void main(String[] args) throws MapControlException {
        
        StartProgramView startProgramView = new StartProgramView();
        
        try{
            
            LastOfUsGame.inFile = new BufferedReader(new InputStreamReader(System.in));
            LastOfUsGame.outFile = new PrintWriter(System.out, true);
            
            String filePath = "log.txt";
            LastOfUsGame.logFile = new PrintWriter(filePath);
            
            startProgramView.displayStartProgramView();
            
        }catch(MapControlException msg){
            System.out.println(msg.getMessage());
        }catch (Throwable te){
            System.out.println(te.getMessage());
            te.printStackTrace();
        }finally{
            try {
                if(LastOfUsGame.inFile != null)
                    LastOfUsGame.inFile.close();
                if(LastOfUsGame.outFile != null)
                    LastOfUsGame.outFile.close();
                if(LastOfUsGame.logFile != null)
                    LastOfUsGame.logFile.close();
            } catch (IOException ex) {
                System.out.println("Error Closing Files!!");
                return;
            }
            
        }
        startProgramView.displayStartProgramView();
    }
    
    
}

