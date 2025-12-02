package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {

	    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	    // Constructor injection
	    UserController controller1 = (UserController) context.getBean("userControllerConstructor");
	    System.out.println("Constructor: " + controller1.printMessage());

	    // Setter injection
	    UserController controller2 = (UserController) context.getBean("userControllerSetter");
	    System.out.println("Setter: " + controller2.printMessage());

	    // Field injection
	    UserController controller3 = (UserController) context.getBean("userControllerField");
	    System.out.println("Field: " + controller3.printMessageFromField());

	  }
}
