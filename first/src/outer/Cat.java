package outer;

public class Cat {

	@Override
	public String toString() {
		return "Cat Object";
	}
public static void main(String[] args) {
	Cat c=new Cat();
	System.out.println(c);
}
}
