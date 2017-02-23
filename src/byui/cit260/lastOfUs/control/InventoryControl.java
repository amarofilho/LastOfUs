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
    
    public double calcBottlerOfWather(int distance, double consume){
        if (distance >= 48){
            return -1;
        }
        if (consume != 0.055){
            return -1;
        }
        
    double liters = (consume * distance);
    return liters;
    }
}

          

