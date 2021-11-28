package com.EdyodaAssignment.Assignment7;

import java.util.*;
import java.util.stream.*;
import java.util.function.Function;

public class DescendingOrder {
    public static void main(String args[]) {
            List<Integer> myList = Arrays.asList(25,55,14,12,19,34,58,46,54);

             myList.stream()
                   .sorted(Collections.reverseOrder())
                   .forEach(System.out::println);
    }
}