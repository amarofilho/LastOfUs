/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lastOfUs.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author AmaroIdelfonso
 */
public class InventoryControlTest {
    
    public InventoryControlTest() {
    }

    /**
     * Test of calcBottlerOfWather method, of class InventoryControl.
     */
    @Test
    public void testCalcBottlerOfWather() {
        System.out.println("calcBottlerOfWather");
        int distance = 48;
        double consume = 0.055;
        InventoryControl instance = new InventoryControl();
        double expResult = -1;
        double result = instance.calcBottlerOfWather(distance, consume);
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
