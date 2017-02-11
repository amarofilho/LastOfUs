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
 * @author Família Haitmann
 */
public class MapControlTest {
    
    public MapControlTest() {
    }

    /**
     * Test of calcBuildingHeight method, of class MapControl.
     */
    @Test
    public void testCalcBuildingHeight() {
        System.out.println("calcBuildingHeight");
        int initialSpeed = 0;
        double gravitySpeed = 9.8;
        int totalTime = 2;
        MapControl instance = new MapControl();
        double expResult = 19.6;
        double result = instance.calcBuildingHeight(initialSpeed, gravitySpeed, totalTime);
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of movePlayerToSpot method, of class MapControl.
     */
    @Test
    public void testMovePlayerToSpot() {
        System.out.println("movePlayerToSpot");
        int option = 1;
        MapControl instance = new MapControl();
        int expResult = 2;
        int result = instance.movePlayerToSpot(option);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
