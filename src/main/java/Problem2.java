/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Garrett York
 */
public class Problem2 {
    public static void main(String[] args) {
    int[] array = {1,2,3,4,5};
    
    
    int total=GetTotal(array);
    System.out.println("The total of all contents in the array is " + total);
    
    
    int[] array1 = {5,10,15};
    int average=GetAverage(array1);
    System.out.println("Average of the array is " + average);
    
    
    int[] array2 = {10,20,30};
    int max=GetHighest(array2);
    System.out.println("Highest number in the array is " + max);
    
    int[] array3 = {10,2,80};
    int low=GetLowest(array3);
    System.out.println("Lowest number in the array is " + low);
    
    
    
    
    }



public static int GetTotal(int[] array) {
    int total=0;
    for(int i=0; i<array.length; i++){
    total+=array[i];
    }
        
    return total;
    }

public static int GetAverage(int[] array) {
    
    int total=0;
    int counter=0;
    
    for(int i=0; i<array.length; i++){
    total+=array[i];
    counter++;
    }
    int average=total/counter;
    return average;
    }
    

public static int GetHighest(int[] array) {
    
    int max=0;
    
    
    for(int i=0; i<array.length; i++){
    if (max<array[i]){
    max=array[i];
    }
    }
    
    return max;
    }

public static int GetLowest(int[] array) {
    
    int min=0;
    
    
    for(int i=0; i<array.length; i++){
    if (array[i]<min|| min == 0){
    min=array[i];
    }
    }
    
    return min;
    }
}
