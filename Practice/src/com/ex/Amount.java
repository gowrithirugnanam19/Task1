package com.ex;
import java.util.*;

public class Amount {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose an option");
		System.out.println("1.Calculate preminum interest");
		System.out.println("2.Calculate simple interest");
		System.out.println("3.convert to uppercase");
		System.out.println("4.convert to lowercase");
		
		int option = sc.nextInt();
		switch(option) {
		case 1:
			System.out.println("Enter the age: ");
			int age=sc.nextInt();
			System.out.println("Enter the amount: ");
			double amount=sc.nextDouble();
			calculateinterest(age,amount);
			break;
		case 2:
			System.out.print("Enter principal amount: ");
            double principal = sc.nextDouble();
            System.out.print("Enter rate of interest: ");
            double rate = sc.nextDouble();
            System.out.print("Enter time in years: ");
            double time = sc.nextDouble();
            calculateSimpleInterest(principal, rate, time); // Method to calculate simple interest
            break;
		case 3:
			 sc.nextLine(); // Consume newline character left over from previous input
             System.out.print("Enter a string to convert to uppercase: ");
             String strUpper = sc.nextLine();
             convertToUpperCase(strUpper); // Method to convert string to uppercase
             break;
		case 4:
			sc.nextLine(); // Consume newline character left over from previous input
            System.out.print("Enter a string to convert to uppercase: ");
            String strLower = sc.nextLine();
            convertToLowerCase(strLower); // Method to convert string to uppercase
            break;
        default:
        	System.out.println("Invalid choice");
	}
    
}

	private static void convertToLowerCase(String strLower) {
		String s=strLower.toLowerCase();
		System.out.println(s);
	}

	private static void convertToUpperCase(String strUpper) {
		System.out.println(strUpper.toUpperCase());
	}

	private static void calculateSimpleInterest(double principal, double rate, double time) {
		double si=(principal*rate*time)/100;
		System.out.println(si);
	}

	private static void calculateinterest(int age, double amount) {
		double interest=0;
		if(age <20) {
			interest=amount+(amount*0.05);
		}
		else if(age>20 && age<40) {
			interest=amount+(amount*0.10);
		}
		else {
			interest=amount+(amount*0.20);
		}
		System.out.println(interest);
	}
}
