
package com.EdyodaAssignment.Assignment7;
import java.util.*;
import java.util.stream.*;
public class FindDuplicateElements  {
    public static void main(String args[]) {
            List<Integer> myList = Arrays.asList(58,64,64,25,98,75,98);
            Set<Integer> set = new HashSet();
            myList.stream()
                  .filter(n -> !set.add(n))
                  .forEach(System.out::println);
    }
}