package com.poly;

class Cat {    
    void move(){
        System.out.println("Cat is walking"); 
    }
    void eat() {        
        System.out.println("Cat is drinking milk");       
    }
}

class Dog extends Cat{
    @Override 
    void move(){ 
        super.move();
        System.out.println("Dog is running");
    }
    void bark(){
        System.out.println("Dog is barking");        
    }
}

public class Animal {
    public static void main(String[] args)
    {
        Dog d = new Dog();
        d.move(); 
        d.eat(); 
        d.bark();
    }
}

