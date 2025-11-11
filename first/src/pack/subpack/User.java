package pack.subpack;
import pack.Calc;
public class User {
public static void main(String[] args) {
	Calc.add(10, 5);
	Calc a=new Calc();
	a.sub(10, 5);
	System.out.println(a.mul(10,5));
}
}
