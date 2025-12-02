package com.example;

import org.springframework.context.annotation.Bean;

public class HelloWorldConfig {
@Bean
	public HelloWorld meth1() {
		return new HelloWorld();
	}
}

//beans.xml code for calc class and for thsi class

//<bean id="hw" class="com.ex.Helloworld">
//<property name="msg" value="Welcome to Spring"></property>
//</bean> 
//<bean id="c1" class="com.ex.Calc">
//<property name="x" value="22"></property>
//<property name="y" value="33"></property>
//</bean>