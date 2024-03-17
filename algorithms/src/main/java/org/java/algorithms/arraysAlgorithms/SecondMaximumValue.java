package org.java.algorithms.arraysAlgorithms;

public class SecondMaximumValue {
    /*Given ann Array of Integers,
    return second maximum value the second maximum value exists
    Example:
    input:arr={12,34,2,34,33,1}
    output:33
    */
    private static int findSecondMaxValue(int[] numbers){
       int secondMax=Integer.MIN_VALUE;
       int max =Integer.MIN_VALUE;
       for(int i=0 ;i<numbers.length ; i++ ){
           if(numbers[i]>max){
               secondMax=max;
               max=numbers[i];
           }else if (numbers[i]>secondMax && numbers[i]!= max ) {
               secondMax=numbers[i];
           }
       }
       return secondMax;
    }

    public static void main(String[] args) {
        System.out.println(findSecondMaxValue(new int[]{12,34,2,34,33,1}));
    }

}
