package outer;

public class Ex {
	int x=22;
	void disp(int x) {
		//this.x=x;
		System.out.println("Local variable "+this.x);
		System.out.println("Local variable "+x);
	}
	public static void main(String[] args) {
		Ex obj=new Ex();
		obj.disp(77);
		System.out.println("Instance variable "+obj.x);
	}
}
