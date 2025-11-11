package outer;

public class Bank {
	int amount=2000;
	void balance() {
		System.out.println("The amount balance is "+amount);
	}
	void withdrawn(int amount) {
		if(amount>this.amount) {
		 System.out.println("Insuffiect Balance");
         return;
		}
		this.amount-=amount;
	}
    void depoist(int amount) {
    	this.amount+=amount;
    	System.out.println("Deposit successfull");
    }
    public static void main(String[] args) {
		Bank b=new Bank();
		b.balance();
		b.withdrawn(2500);
		b.balance();
		b.depoist(1000);
		b.balance();
	}
}
