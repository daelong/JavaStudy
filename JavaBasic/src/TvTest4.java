class Tv { //Ŭ����
	String color; //�������, �Ӽ���
	boolean power;
	int channel;
	
	void power() { power = !power; } //�޼ҵ��, �����ϴ°�
	void channelUp() { channel++; }
	void channelDown() { channel--; }
}

/*
class TvTest2{ //�����ϱ����� Ŭ����
	public static void main(String args[]) {
		Tv t1 = new Tv(); //�ν��Ͻ�
		Tv t2 = new Tv();
		System.out.println("t1�� channel���� " + t1.channel + "�Դϴ�.");
		System.out.println("t2�� channel���� " + t2.channel + "�Դϴ�.");
		
		t1.channel = 7; //��������.��������� �� ����
		System.out.println("t1�� channel���� ����Ǿ����ϴ�.");
		
		System.out.println("t1�� channel���� " + t1.channel + "�Դϴ�.");
		System.out.println("t2�� channel���� " + t2.channel + "�Դϴ�.");
	}
}
*/

class TvTest4{
	public static void main(String args[]) {
		Tv [] tvArr = new Tv[3];
		
		for(int i = 0; i < tvArr.length; i++) {
			tvArr[i] = new Tv();
			tvArr[i].channel = i + 10;
		}
		
		for(int i = 0; i < tvArr.length; i++ ) {
			tvArr[i].channelUp();
			System.out.printf("tvArr[%d].channel = %d \n", i, tvArr[i].channel);
		}
	}
}