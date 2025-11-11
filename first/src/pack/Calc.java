package pack;

public class Calc {
	public static void add(int x,int y) {
		System.out.println("The addition of "+x+" and "+y+" is "+(x+y));
	}
	public void sub(int x,int y) {
		System.out.println("The subtraction of "+x+" and "+y+" is "+(x-y));
	}
	public int mul(int x,int y) {
		return(x*y);
	}
public static void main(String[] args) {
	Calc.add(30,20);
	Calc c=new Calc();
	c.sub(30,20);
	System.out.println(c.mul(5, 5));
}
}
