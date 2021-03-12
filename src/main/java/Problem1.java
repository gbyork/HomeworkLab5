/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Garrett York
 */
public class Problem1 {
    public static void main(String[] args) {
    
int[] array = {1,2,3,4,5,6};
int n=0;
int countabove=Problem1(array,n);
System.out.println("Array is more than n " + countabove + " times");
}
    
public static int Problem1(int[] array, int n) {
    int counter = 0;
    for(int i=0; i<array.length; i++){
        if(n<array[i]) {
        counter++;
    }
        
    
    }
    return counter;
}
}