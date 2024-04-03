package org.java.algorithms.arraysAlgorithms;


/**
 * Given an array of n-1 distinct numbers in the range of 1 to n .
 * find the missing number in it
 * arr[]: {2,4,1,8,6,3,7}
 * output: 5
 * Explanation :the missing number from range 1 to 8 is 5
 */
public class FindMissingNumber {
    /** Algorithm to solve the problem
     * [1]:we will use this mathematics from to help us the find solution
     * ⨊ 1+2+3+4+5...+n=n* (n+1)/2
     * [2]:and end the second step we will subtract the value of sum from element of the array until the last value and the rest is the missing number in the array
     * */

    public static int searchForMissingNumbers(int[] arr) {
        int n = arr.length+1;
        int sum=n * (n+1)/2;
        for(int num :arr)
            sum-=num;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(searchForMissingNumbers(new int[]{2,4,1,8,6,3,7}));
    }
}
