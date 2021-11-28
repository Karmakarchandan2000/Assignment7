package com.EdyodaAssignment.Assignment7;
import java.util.*;
import java.util.stream.*;

public class FindEvenNumber {
    public static void main(String args[]) {
            List<Integer> myList = Arrays.asList(56,45,68,24,67,90,48);
            myList.stream()
                  .filter(n -> n%2 == 0)
                  .forEach(System.out::println);
    }
}