class Product1{
	int price;
	int bonusPoint;
	
	Product1(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class Tv2 extends Product1{
	Tv2(){
		//���� Ŭ������ ������ Product(int price)�� ȣ��
		super(100);
	}
	//ObjectŬ������ toString()�� �������̵�
	public String toString() {return "Tv";}
}

class Computer1 extends Product1{
	Computer1(){ super(200); }
	
	public String toString() { return "Computer";}
}

class Buyer{
	int money = 1000;
	int bonusPoint = 0;
	
	void buy1(Product1 p) {
		if(money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "��/�� �����ϼ̽��ϴ�.");
	}
}
public class PolyArgumentTest {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		b.buy1(new Tv2());
		b.buy1(new Computer1());
		
		System.out.println("���� ���� ���� " + b.money + "�����Դϴ�.");
		System.out.println("���� ���ʽ� ������ " + b.bonusPoint + "���Դϴ�.");

	}

}
