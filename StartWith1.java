package com.EdyodaAssignment.Assignment7;

import java.util.*;
import java.util.stream.*;
public class StartWith1 {
    public static void main(String args[]) {
            List<Integer> myList = Arrays.asList(25,55,14,12,19,34,58,46,54);
            myList.stream()
                  .map(s -> s + "") 
                  .filter(s -> s.startsWith("1"))
                  .forEach(System.out::println);
    }
}