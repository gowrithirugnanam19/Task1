package com.ex;

import com.google.gson.Gson;

public class User {
public static void main(String[] args) {
	EmployeeBean eb=new EmployeeBean();
	eb.setEid(101);
	eb.setEname("Ajith");
	eb.setEsal(75000);
	Gson obj=new Gson();
	//obj.toJson(eb);
	String str=obj.toJson(eb);
	System.out.println(str);
}
}
