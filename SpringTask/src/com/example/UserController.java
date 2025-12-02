package com.example;

public class UserController {
	private MessageService messageService;
	// Default constructor
	public UserController() {}
	// Constructor Injection
	public UserController(MessageService messageService) {
	this.messageService = messageService;
	}
	// Setter Injection
	public void setMessageService(MessageService messageService) {
	this.messageService = messageService;
	}
	// Field Injection
	private MessageService fieldMessageService;
	public void setFieldMessageService(MessageService fieldMessageService) {
	this.fieldMessageService = fieldMessageService;
	}
	// Method to print message
	public String printMessage() {
	return messageService.getMessage();
	}
	// Method for field-based message service
	public String printMessageFromField() {
	return fieldMessageService.getMessage();

	}
}
