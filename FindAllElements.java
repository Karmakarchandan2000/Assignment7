package com.EdyodaAssignment.Assignment7;
import java.util.*;
import java.util.stream.*;
public class FindAllElements {
    public static void main(String args[]) {
            List<Integer> myList = Arrays.asList(25,55,14,12,19,34,58,46,54);
            long count =  myList.stream()
                                .count();
            System.out.println(count);                    
    }
}