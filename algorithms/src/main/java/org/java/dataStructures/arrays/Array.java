package org.java.dataStructures.arrays;

public class Array {
    /**
     * it's a collection (Box) of data elements of a specified type
     * All data holding partition have contiguous memory location
     * Each partition has two neighbors except the first and last one
     * Size of an array is fixed and cannot be modified once it is created.
     * index starts at 0 and for (a one dimensional array) end at length-1
     * Declaration of an Array:
     * one Dimensional Array can be declared via Syntax:dataType[] ArrayName
     * Initialization of an Array
     * it gives memory to array elements.One Dimensional Array Can be initialized via syntax:arrayName=new dataType[size]
     * dataType[] arrayName=new dataType[size]
    * */
    public static void main(String[] args) {
        printArray(new int[] {1,2,3,4,5,6});
    }
    /**/
    public static void printArray(int[] array){
        int n =array.length;
        for (int i=0 ; i<n ; i++ ) System.out.println("Index: "+ i + "Element:" + array[i]);
    }





}
