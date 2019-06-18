class NegativeBalanceException extends Exception{
	public NegativeBalanceException() {
		super("���� �ݾ��� �ܾ׺��� Ů�ϴ�");
	}
}

class BankAccount1{
	private int balance;
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void deposit(int money) {
		balance += money;
	}
	public void withdraw(int money) throws NegativeBalanceException{
		balance -= money ;
		if( balance >= 0)
			System.out.println("��ݿ� �����Ͽ����ϴ�.");
		else
			throw new NegativeBalanceException();
	}
}
class Test7 {

	public static void main(String[] args) {
		BankAccount1 a = new BankAccount1();
		a.setBalance(30000);
		try {
			a.withdraw(30000);
		}
		catch(NegativeBalanceException e) {
			System.out.println(e.getMessage());
		}

	}

}