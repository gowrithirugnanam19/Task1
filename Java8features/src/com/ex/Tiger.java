package com.ex;

public class Tiger {
//public void tigerEat() {
//	System.out.println("Eats only Non Veg");
//}
//public static void main(String[] args) {
//	Tiger t=new Tiger();
//	Animal a=t::tigerEat; //refer tiger method to the animal class/reference/object
//	a.eat(); // so if i call animal method it will print tiger method values 
//}

	
//reference to constructor 	//done using with or without using arguments.
//Tiger(int x){
//	System.out.println("Tiger object");
//}
//public static void main(String[] args) {
//	Animal a=Tiger::new;
//	a.eat(5);
//}

//refernce to static 	
public static void tigerEat() {
	System.out.println("Eats Non veg");
}
public static void main(String[] args) {
	Animal a=Tiger::tigerEat;
	a.eat();
}
}
