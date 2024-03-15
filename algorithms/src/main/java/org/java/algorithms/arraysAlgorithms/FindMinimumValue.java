package org.java.algorithms.arraysAlgorithms;

public class FindMinimumValue {
    /*Find the minimum of in array
    * example:{5,9,3,15,1,2.1}
    * the minimum number is 1
    * Okay let s write an algorithm how solve this problem
    * we consider that the first value of an array element it s the minimum, and we compare it we the next value if the
    * current is bigger we assign the current value to the variable
    */
    public static int minimumValue(int[] numbers){
        int minValue=numbers[0],len=numbers.length;
        for (int i=1 ; i<len; i+=1 ){
            if(minValue>numbers[i]){
                minValue=numbers[i];
            }
        }
        return minValue;
    }

    public static void main(String[] args) {
        System.out.println(minimumValue(new int[]{5,9,3,15,1,2,1}));
    }

}
