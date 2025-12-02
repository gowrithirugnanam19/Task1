package com.ex;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
//import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.core.io.ClassPathResource;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
public static void main(String[] args) {
	
	//using applicationcontext interface
ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");//Intialize the container
//	 Helloworld h=(Helloworld)ctx.getBean("hw");
//	 System.out.println(h.getMsg());
//	 Helloworld h2=(Helloworld)ctx.getBean(Helloworld.class);
//	 System.out.println(h2.getMsg());
//	Calc c=(Calc)ctx.getBean(Calc.class);
//	c.add();
//	Calc c1=new Calc();
//	c1.setX(5);
//	c1.setY(5);
//	c1.add();
	
	//using bean factory interface
//	org.springframework.beans.factory.BeanFactory ctx=new XmlBeanFactory(new ClassPathResource("beans.xml"));
//	Calc c=(Calc)ctx.getBean("c1");
//	c.add();
	
//XmlBeanFactory ctx=new XmlBeanFactory(new ClassPathResource("beans.xml"));
//	Cat c1=(Cat)ctx.getBean("c1");
//	System.out.println(c1.getLegs());
//	Cat c2=(Cat)ctx.getBean("c2");
//	System.out.println(c2.getName());
//	Cat c3=(Cat)ctx.getBean("c3");
//	System.out.println(c3.getName()+" "+c3.getLegs());

Helloworld h1=(Helloworld)ctx.getBean("hw");
//Helloworld h2=(Helloworld)ctx.getBean(Helloworld.class);
System.out.println(h1.getMsg());
ctx.registerShutdownHook();
//System.out.println(h2);
}
}
