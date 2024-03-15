package org.java.algorithms.arraysAlgorithms;

import java.util.Arrays;

public class ReversedArray {
    /**
     * Given an Array or String, the task is to reverse the array or string
     * Example: Given array of integers {2,11,5,10,7,8}
     * Solution: return reversed of an array {8,7,10,5,11,2}
     *  */
    /* Methode One 1️⃣*/
    public static int [] reversedArray(int[] array ){
        int n=array.length;
        int[] reversedArray=new int[n];
        for (int i=0 ,j=n-1;i< array.length ; i++ , j--){
            reversedArray[i]=array[j];
        }
        return reversedArray;
    }
    /*Methode Two 2️⃣*/
    public static int[] revers(int[] number ,int start, int end ){
        while (start<end){
            int temp =number[start];
            number[start]=number[end];
            number[end]=temp;
            start++;
            end--;
        }
        
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(reversedArray(new int[]{2,11,5,10,7,8})));


    }
}
