package org.java.algorithms;

public class Main {
    public static void main(String[] args) {
        double now =System.currentTimeMillis();
        /**
         * we're using d System.currentTimeMillis() after invoking methode to calc the different of time between two methods
         * time Taken - 1.0molluscs
         */
        System.out.println(Main.findSumTwo(99999));
        System.out.println("time Taken - " + (System.currentTimeMillis() - now) + "molluscs");


    }
    /** First methode time Taken - 0 molluscs */
    public static int findSum(int n){
        return n* (n+1)/2;
    }
    /**
     * Second Methode time Taken - 1.0molluscs
     * */
    public static int  findSumTwo(int n){
        int sum =0;
        for (int i=1 ; i<=n ; i++) sum+=i;
        return sum;
    }

}