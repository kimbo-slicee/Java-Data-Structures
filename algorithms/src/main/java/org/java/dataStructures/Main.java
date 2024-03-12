package org.java.dataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(List.of(5,15,25,35,45,55,65));
        System.out.println("list : " + list );/*list : [5, 15, 25, 35, 45, 55, 65]*/
        list.remove(5);
        System.out.println("list : " + list );/*list : [5, 15, 25, 35, 45, 65]*/
        /*List Trick */
        Collection<Integer> listOfints=new ArrayList<>(List.of(5,15,25,35,45,55,65));
        System.out.println("list : " + listOfints );/*list : [5, 15, 25, 35, 45, 55, 65]*/
        listOfints.remove(5);/*Remove the object instead of index*/
        System.out.println("list : " + listOfints );/*list: [15, 25, 35, 45, 65]*/
    }

}
