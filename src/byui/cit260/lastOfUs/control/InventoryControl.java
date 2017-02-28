/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lastOfUs.control;

/**
 *
 * @author Survivors of Brazil
 */
public class InventoryControl {
    
    public double calcBottlerOfWather(double consume){
        
         
        int distance;
        distance = 1;
        double teste;
        teste = 2.64;
        if (consume == teste){
            double liters = (teste * distance);
            return liters;
        }
        if (consume != 2.64){
            return -1;
        }
        
     return -1;
    }

    
}

          

