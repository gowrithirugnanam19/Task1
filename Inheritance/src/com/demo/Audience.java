package com.demo;
class Hotel implements Veg,Nonveg{
    int totalprice=0;
	@Override
	public void meals() {
		int price=100;
		totalprice+=price;
		System.out.println("The bill of meals is "+price);
	}
	@Override
	public void dosa() {
		int price=50;
		totalprice+=price;
		System.out.println("The bill of dosa is "+price);
	}
	@Override
	public void chickenbriyani() {
		int price=150;
		totalprice+=price;
		System.out.println("The bill of chickenbriyani is "+price);
	}
	@Override
	public void friedrice() {
		int price=120;
		totalprice+=price;
		System.out.println("The bill of friedrice is "+price);
	}
	public void total() {
		System.out.println("The total bill is "+totalprice);
}
}
public class Audience extends Hotel{
	public void display() {
		System.out.println("Thank you");
	}
	public static void main(String[] args) {
		Hotel h=new Hotel();
		h.meals();
		h.dosa();
		h.chickenbriyani();
		h.friedrice();
		h.total();
		System.out.println();
		Audience a=new Audience();
		a.meals();
		a.dosa();
		a.chickenbriyani();
		a.friedrice();
		a.total();
		a.display();
		System.out.println();
		Hotel ah=new Audience();
		ah.chickenbriyani();
		ah.dosa();
		ah.friedrice();
		ah.meals();
		ah.total();
		a.display();
	}

}
