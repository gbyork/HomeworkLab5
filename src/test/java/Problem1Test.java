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
public class Problem1Test {
    
    public Problem1Test() {
    }

 
    @Test
    public void testProblem1() {
        System.out.println("Problem1");
        int[] array = {10,20,30,40,50,60};
        int n = 37;
        int expResult = 3;
        int result = Problem1.Problem1(array, n);
        assertEquals(expResult, result);
       
    }
    
}
