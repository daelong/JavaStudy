class BankAccount{
	private int accountNumber;
	private String owner;
	private int balance;
	
	public void deposit(int amount) { //private도 아니고 public도 아니면 패키지라는 중간정도임 밖에서 볼수 있긴한데 한정된 공간에서 볼 수 있음
		balance += amount;
	}
	public void withdraw(int amount) {
		balance -= amount;
	}
	public String toString() {
		return "현재 잔액은 " + balance + "입니다.";
	}
}
public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount myAccount = new BankAccount();
		myAccount.deposit(10000);
		System.out.println(myAccount);
		myAccount.withdraw(8000);
		System.out.println(myAccount);

	}

}
