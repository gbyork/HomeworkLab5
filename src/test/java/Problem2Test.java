/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Garrett York
 */
public class Problem2Test {
    
    public Problem2Test() {
    }

   

    @Test
    public void testGetTotal() {
        System.out.println("GetTotal");
        int[] array = {12,10,20};
        int expResult = 42;
        int result = Problem2.GetTotal(array);
        assertEquals(expResult, result);
        
    }

    @Test
    public void testGetAverage() {
        System.out.println("GetAverage");
        int[] array = {10,30,50};
        int expResult = 30;
        int result = Problem2.GetAverage(array);
        assertEquals(expResult, result);
        
    }

    @Test
    public void testGetHighest() {
        System.out.println("GetHighest");
        int[] array = {100,5,7,8,11,99};
        int expResult = 100;
        int result = Problem2.GetHighest(array);
        assertEquals(expResult, result);
        
    }

    @Test
    public void testGetLowest() {
        System.out.println("GetLowest");
        int[] array = {6,2,5,9,10};
        int expResult = 2;
        int result = Problem2.GetLowest(array);
        assertEquals(expResult, result);
        
    }
    
}
