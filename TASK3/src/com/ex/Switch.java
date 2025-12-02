package com.ex;

public class Switch{
    public static void main(String[] args) {
        String day = "Monday"; 
        String dayType = switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> "Weekday";
            case "Saturday", "Sunday" -> "Weekend";
            default -> "Invalid day"; 
        };
        
        System.out.println(day + " -> " + dayType);
    }
}
