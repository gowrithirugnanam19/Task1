package com.inherit;
class car{
	void brand(String name) {
		System.out.println("The brand name is "+name);
	}
	void seat() {
		System.out.println("This car has 5 seats");
	}
}
class bike extends car{
	void model(String name) {
		System.out.println("The bike name "+name+" and color is blue");
	}
	void price(int x) {
		System.out.println("The bike price is "+x);
	}
}
public class Vehicle extends bike{
	void shopname(String name) {
		System.out.println("The Shopname is "+name);
	}
public static void main(String[] args) {
	Vehicle v=new Vehicle();
	v.brand("Kia");
	v.seat();
	v.model("FZ5");
	v.price(95000);
	v.shopname("AK showroom");
  }
}
