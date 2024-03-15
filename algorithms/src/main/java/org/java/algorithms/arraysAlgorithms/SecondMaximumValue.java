package org.java.algorithms.arraysAlgorithms;

public class SecondMaximumValue {
    /*Given ann Array of Integers,
    return second maximum value the second maximum value exists
    Example:
    input:arr={12,34,2,34,33,1}
    output:33
    */
    private static int findSecondMaxValue(int[] numbers){
        int length=numbers.length;
        int maxValue=numbers[0],secondMaxValue=numbers[1];
        for (int i=1 ; i<length ; i++){
            if(maxValue<numbers[i]){
                maxValue=numbers[i];
            }
            if(secondMaxValue<maxValue && secondMaxValue<numbers[i]){
                secondMaxValue=numbers[i];
            }
        }
        return secondMaxValue;
    }

    public static void main(String[] args) {
        System.out.println(findSecondMaxValue(new int[]{12,34,2,34,33,1}));
    }

}
