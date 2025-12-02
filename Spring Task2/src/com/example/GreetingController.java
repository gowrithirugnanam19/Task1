package com.example;

public class GreetingController {
	private GreetingService greetingservice;
	public GreetingController(GreetingService greetingservice) {
	this.greetingservice = greetingservice;
	}
	public String showMessage() {
	return greetingservice.getMessage();
	}
}
