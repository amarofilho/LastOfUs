/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lastOfUs.view;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
import lastofusgame.LastOfUsGame;

/**
 *
 * @author AmaroIdelfonso
 */
public abstract class View implements ViewInterface  {
    
    protected String displayMessage;
    
    protected final BufferedReader keyboard = LastOfUsGame.getInFile();
    protected final PrintWriter console = LastOfUsGame.getOutFile();
    
    public View(){
    }
    
    public View(String message){
        this.displayMessage = message; 
    }
    
    
    @Override
    public void display(){
            
        boolean done = false;
        do{
            String value = this.getInput();
            if (value.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(value);
        } while (!done);
    }
    
    @Override
    public String getInput() {
        Scanner keyboard = new Scanner(System.in);
        
        boolean valid = false;
        String value = null;
        
        while (!valid){
            System.out.println("\n "+ this.displayMessage);
            
            value = keyboard.nextLine();
            value = value.trim();
            
            if(value.length()< 1){
                System.out.println("\n You must enter a value");
                continue;
            }
            break;
    
}
        return value;
}
}