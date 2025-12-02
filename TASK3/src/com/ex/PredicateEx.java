package com.ex;

import java.util.function.Predicate;

public class PredicateEx {
    public static void main(String[] args) {

        Predicate<String> isValidUsername = username -> username.length() > 5;

        String username = "john123";

        boolean isValid = isValidUsername.test(username);
        System.out.println("Valid " + isValid);
    }
}
