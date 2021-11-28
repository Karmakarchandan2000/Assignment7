package com.EdyodaAssignment.Assignment7;

import java.util.*;
import java.util.stream.*;
import java.util.function.Function;

public class NonRepeatedChar {
    public static void main(String args[]) {
            String input = "Good Night , Have a nice dream";

            Character result = input.chars()    
                                    .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s)))        
                                    .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))  
                                    .entrySet()
                                    .stream()
                                    .filter(entry -> entry.getValue() == 1L)
                                    .map(entry -> entry.getKey())
                                    .findFirst()
                                    .get();
            System.out.println(result);                    
    }
}