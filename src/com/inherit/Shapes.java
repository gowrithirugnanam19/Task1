package com.inherit;
class Shape {
    public void display() {
        System.out.println("Types of shapes and its area");
    }
}
class Circle extends Shape {
    public void area(double radius) {
        double area = 3.14 * radius * radius;
        System.out.println("Circle area: " + (int)area);
    }
}
class Rectangle extends Shape {
    public void area() {
    	int length=3,width=7;
        int area = length * width;
        System.out.println("Rectangle area: " + area);
    }
}
class Triangle extends Shape {
    public void area() {
    	int height=5,base=8;
        double area = 0.5 * base * height;
        System.out.println("Triangle area: " + (int)area);
    }
}
public class Shapes {
	public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        Triangle t = new Triangle();
        c.display();
        c.area(5);
        r.display();
        r.area();
        t.display();
        t.area();
    }
}

