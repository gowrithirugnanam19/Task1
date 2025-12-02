package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
	    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	  GreetingController controller=context.getBean(GreetingController.class);
	  System.out.println(controller.showMessage());
	  ((ClassPathXmlApplicationContext) context).close();
	}	
}
