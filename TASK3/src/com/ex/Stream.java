package com.ex;

import java.util.*;
import java.util.stream.*;

public class Stream {
    public static void main(String[] args) {
        // List of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Stream to filter even numbers, multiply by 10, and collect results
        List<Integer> result = numbers.stream()
                                      .filter(n -> n % 2 == 0)     // Filter even numbers
                                      .map(n -> n * 10)            // Multiply each by 10
                                      .collect(Collectors.toList()); // Collect results into a list

        // Print the final list
        System.out.println(result);
    }
}

