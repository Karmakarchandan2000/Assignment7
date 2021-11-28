package com.EdyodaAssignment.Assignment7;
import java.util.*;
import java.util.stream.*;
public class MaxElement {
    public static void main(String args[]) {
            List<Integer> myList = Arrays.asList(25,55,14,12,19,34,58,46,54);
            int max =  myList.stream()
                             .max(Integer::compare)
                             .get();
            System.out.println(max);                    
    }
}