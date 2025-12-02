package com.ex;

import java.util.function.Consumer;

public class ConsumerEx {
    public static void main(String[] args) {
        // Consumer that prints the square of a number
        Consumer<Integer> printSquare = number -> System.out.println("Square: " + (number * number));

        // Call the consumer with the value 5
        printSquare.accept(5);
    }
}

