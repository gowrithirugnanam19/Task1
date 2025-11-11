package outer;
import pack.Calc;
public class Demo {
 public static void main(String[] args) {
	Calc c=new Calc();
	c.sub(10, 5);
	System.out.println(c.mul(5, 5));
}
}
