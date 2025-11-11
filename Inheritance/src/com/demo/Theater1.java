package com.demo;

public class Theater1 implements Malayalammovies{
	int totalprice=0;
	@Override
	public void home() {
		int ticketprice=150;
		totalprice+=ticketprice;
		System.out.println("Home movie price is "+totalprice);
	}
	@Override
	public void aavesham() {
		int ticketprice=200;
		totalprice+=ticketprice;
		System.out.println("Aavesham movie price is "+totalprice);
		}
	public void total() {
		System.out.println("The Totalprice is "+totalprice);
	}
 }
class Theater2 implements Tamilmovies{
	@Override
	public void meiyazhagan() {
		System.out.println("The ticket price is 200");
	}
	@Override
	public void v1000() {
		System.out.println("The ticket price is 190");
	}
}
class Theater3 implements Malayalammovies,Tamilmovies{
	@Override
	public void meiyazhagan() {
		System.out.println("Price is 250");
	}
	@Override
	public void v1000() {
		System.out.println("Price is 200");	
	}
	@Override
	public void home() {
		System.out.println("Price is 230");	
	}
	@Override
	public void aavesham() {
		System.out.println("Price is 180");	
	}
} 

