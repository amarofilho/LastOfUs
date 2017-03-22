/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lastOfUs.view;

import java.io.PrintWriter;
import lastofusgame.LastOfUsGame;

/**
 *
 * @author Família Haitmann
 */
public class ErrorView {
    
    private static final PrintWriter errorFile = LastOfUsGame.getOutFile();
    private static final PrintWriter logFile = LastOfUsGame.getLogFile();
    
    public static void display(String className, String errorMessage){
        errorFile.println(
                "---------------------------------------------------------"
               +"\n- ERROR - " + errorMessage
               +"\n-------------------------------------------------------");
        logFile.println(className + " - " + errorMessage);
    }
    
}
