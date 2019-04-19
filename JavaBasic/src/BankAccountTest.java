class BankAccount{
	private int accountNumber;
	private String owner;
	private int balance;
	
	public void deposit(int amount) { //private�� �ƴϰ� public�� �ƴϸ� ��Ű����� �߰������� �ۿ��� ���� �ֱ��ѵ� ������ �������� �� �� ����
		balance += amount;
	}
	public void withdraw(int amount) {
		balance -= amount;
	}
	public String toString() {
		return "���� �ܾ��� " + balance + "�Դϴ�.";
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
