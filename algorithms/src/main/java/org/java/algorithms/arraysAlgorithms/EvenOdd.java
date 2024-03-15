package org.java.algorithms.arraysAlgorithms;

import org.java.algorithms.Main;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class EvenOdd {
     /*
    Given an array of integers,
    return an array with even integers removed
    Example:
    input: arr={3,2,4,7,10,6,5}
    Output:arr={3,7,5}
    */
    public int[] removeEven(int @NotNull [] arr){
        int oddCounter=0;
        for (int i=0 ; i< arr.length;i++){
            if(arr[i]%2!=0) oddCounter++;
        }
        int[] result=new int[oddCounter];
        int index =0;
        for(int i=0 ; i< arr.length ; i++ ){
            if(arr[i]% 2!=0) {
                result[index] = arr[i];
                index++;
            }
        }
        return result;

    }


    public static void main(String[] args) {
        EvenOdd evenOdd=new EvenOdd();
        System.out.println(Arrays.toString(evenOdd.removeEven(new int[]{3, 2, 4, 7, 10, 6, 5})));
    }

}
