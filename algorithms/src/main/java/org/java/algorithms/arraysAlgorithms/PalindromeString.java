package org.java.algorithms.arraysAlgorithms;

/**
A string is said to be palindrome if it remains the
same on reading from both ends
 */
public class PalindromeString {
/**
 * Given a string, the task is checked whether given string
 * is a palindrome or not
 * Example-Given string - "Madam"
 * solution - it should return - ture
 * Example - Given string - "That"
 * solution _ it should return - false
 * */
static boolean checkPalindromeString(String s){
    char[] charArray=s.toCharArray();
    int start=charArray[0],end=charArray.length-1;
       while (start<end){
        if(charArray[start]!=charArray[end])return false;
        start ++ ;
        end ++;
       }
        return true;
   }

    public static void main(String[] args) {
        System.out.println(checkPalindromeString("userName "));
    }


}
