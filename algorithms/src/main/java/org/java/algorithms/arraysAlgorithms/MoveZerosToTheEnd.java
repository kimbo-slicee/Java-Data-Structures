package org.java.algorithms.arraysAlgorithms;

import org.java.dataStructures.arrays.Array;

import java.util.Arrays;

public class MoveZerosToTheEnd {
    /*Given an array fo Integers Wirte a function to move all Zero's
    * to end of it while maintaining the relative order of the none-zero elements.
    * Example:Given array of integers {0,1,0,4,12}
    * Solution:{1,4,12,0,0}
    * */
    public static int[] moveZerosToTheEnd(int[] arr){
        /*That's what I try */
        int start=0,end=arr.length-1,temp=0,tempTwo=0;
        while (start<end){
            if(arr[start]==0){
                temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
            end--;
                }
            start++;
            }
        return arr;
    }
    /*That's solution In FreeCodeCamp */
    public void moveZeros(int[] arr){
        int n=arr.length ,j=0;
        for (int i=0 ; i<n;i++){
            if(arr[i]!=0 && arr[j]==0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }if(arr[j]!=0){
                j++;
            }
        }
    }
    /*create the sorting method for the array of zeros */
    public static int[] customSort(int[] arr){
        int j=0;
        for(int i=1; i< arr.length ; i++){
            int temp=arr[j];
            if(arr[j]>arr[i] && arr[i]!=0){
                arr[j]=arr[i];
                arr[i]=temp;
                j++;
            }
        }
        return arr;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(moveZerosToTheEnd(new int[] {0,1,0,4,12})));
        System.out.println(Arrays.toString(customSort(moveZerosToTheEnd(new int[]{0,1,0,4,12}))));
    }
}
