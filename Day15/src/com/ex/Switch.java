package com.ex;

public class Switch {
//public static String validate(String day) {
//	switch(day) {
//	case"Monday":System.out.println("Day 1");
//	case"Tuesday":System.out.println("Day 2");
//	case"Wednesday":System.out.println("Day 3");
//	}
//	return day;
//}
//public static void main(String[] args) {
//	System.out.println(Switch.validate("Tuesday"));
//}

public static void main(String[] args) {
	String day="Tuesday";
	String result=switch(day) {
	case "Monday": yield result=("Day 1 Meeting");  //yield return a value
	case "Tuesday": yield "Day 2 Meeting";
	case "Wednesday" : yield "Day 3 Meeting";
	default: yield result=("Invalid Day");};
	System.out.println(result);
  }
}

