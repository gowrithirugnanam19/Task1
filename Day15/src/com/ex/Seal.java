package com.ex;

sealed class Human permits Anu,Ammu,Aju{
	public void printName() {
		System.out.println("Human");
	}
}
non-sealed class Anu extends Human{
	public void printName() {
		System.out.println("Name is Anu");
	}
}
non-sealed class Ammu extends Human{
	public void printName() {
		System.out.println("Name is Ammu");
	}
}
final class Aju extends Human{
	public void printName() {
		System.out.println("Name is Aju");
	}
}
public class Seal
{
    public static void main(String[] args)
    {   
        Human h1 = new Aju();
        Human h2 = new Ammu();
        Human h3 = new Anu();
        h1.printName();
        h2.printName();
        h3.printName();
    }
}