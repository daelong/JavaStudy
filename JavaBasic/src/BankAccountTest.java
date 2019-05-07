class BankAccount{
	private String owner;
	private int accountNumber;
	private int balance;
	
	public void deposit(int amount){
		balance += amount;
	}
	public void withdraw(int amount) {
		balance -= amount;
	}
	public String toString() {
		return "현재 잔액은 " + balance + "입니다.";
	}
}

public class BankAccountTest{
	public static void main(String args[]) {
		BankAccount myAccount = new BankAccount();
		myAccount.deposit(10000);
		System.out.println(myAccount);
		myAccount.withdraw(8000);
		System.out.println(myAccount);
		
	}
}
