package com.ex;

public class Helloworld {
	private String msg;
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public void init() {
		System.out.println("Bean is intialized");
	}
	public void destroy() {
		System.out.println("Bean is destroyed");
	}
}
