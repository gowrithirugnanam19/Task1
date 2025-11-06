package com.poly;

class Product{
    public void multiply(int a, int b){        
        int prod = a * b;
        System.out.println(prod);
    }
    public void multiply(int a, int b, int c){        
        int prod = a * b * c;
        System.out.println(prod);
    }
}

public class Multiply extends Product{  
	public void display() {
		System.out.println("The multiplication of numbers");
	}
    public static void main(String[] args)
    {       
        Multiply ob = new Multiply();
        ob.display();
        ob.multiply(5,5);
        System.out.println();
        ob.display();
        ob.multiply(3,4,5);
    }
}


