class Car{
	private int speed;
	
	public void setSpeed(int s) {
		speed = s;
		System.out.println("���� ���� ȣ��");
	}
	public void setSpeed(double s) {
		speed = (int)s;
		System.out.println("�Ǽ� ���� ȣ��");
	}
}

public class CarTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short s = 10; //short�� �������� ����
		Car myCar = new Car();
		myCar.setSpeed(s); //�̰��ϸ� ����ȯ�� ���༭ ��Ʈ�� �ٲ��� 
		myCar.setSpeed(100);
		myCar.setSpeed(79.2f); //�̰� double���� ��Ȯ���� ������ double�� ����ȯ�� ���༭ ����ϰԵ�
		myCar.setSpeed(79.2);
		myCar.setSpeed('a'); // ������ ����ȯ�ؼ� ���� ����
	}

}
