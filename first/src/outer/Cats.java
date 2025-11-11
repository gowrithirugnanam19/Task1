package outer;

public class Cats {
	Cats(){
		//this.Cats(6);
		System.out.println("Cat constructor");
	}
	Cats(int x){
		System.out.println("Cat eats "+x+" fish per day");
	}
	void eat() {
		System.out.println("Eats Rats");
	}
	void eat(String name) {
		System.out.println(name+" eats legs");
	}
  public static void main(String[] args) {
	new Cats();
}
}
