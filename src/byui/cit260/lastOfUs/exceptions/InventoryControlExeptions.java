/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lastOfUs.exceptions;

/**
 *
 * @author AmaroIdelfonso
 */
public class InventoryControlExeptions extends Exception{

    public InventoryControlExeptions() {
    }

    public InventoryControlExeptions(String string) {
        super(string);
    }

    public InventoryControlExeptions(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public InventoryControlExeptions(Throwable thrwbl) {
        super(thrwbl);
    }

    public InventoryControlExeptions(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
    
}
