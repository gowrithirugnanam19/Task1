package com.demo;
class tri implements Shape{
	public void draw() {
		System.out.println("Draw a triangle");
	}
    public void side() {
    	System.out.println("Has 3 sides");
    }
}
    public class Triangle extends tri{
    public static void main(String[] args) {
	tri t=new Triangle();
	t.draw();
	t.side();
}
}
