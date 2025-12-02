package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
public static void main(String[] args) {
	ApplicationContext ctx=new AnnotationConfigApplicationContext(HelloWorldConfig.class);
	HelloWorld h1=ctx.getBean(HelloWorld.class);
	h1.setMsg("Welcome to Spring");
	System.out.println(h1.getMsg());
	
}
}

//dependency can be done by using annotation config or xml files
//dependency means injecting values to the files