package org.java.algorithms.arraysAlgorithms;

import java.util.Scanner;

public class ResizeArray {
    /**
     * How to resize an Array in Java
     * */
    public static int[] resize(int[] arr , int capacity){
        int[] temp =new int[capacity];
        System.out.println("size of insial Array is " + arr.length);
        for(int i=0 ; i<arr.length ;i++){
            temp[i]=arr[i];
        }

        return temp;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of the new Array ");
        int capacity= scanner.nextInt();
        System.out.println("size of the New Array is " + resize(new int[]{1,2,3,4,5},capacity).length);

    }
}
