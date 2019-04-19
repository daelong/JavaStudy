class DeskLamp{
	private boolean isOn;
	
	public void turnOn() {
		isOn = true;
	}
	public void turnOff() {
		isOn = false;
	}
	
	public String toString() {
		return "���� ���´� " + (isOn == true ? "����" : "����");
	}
}
public class DeskLampTest {

	public static void main(String[] args) {
		DeskLamp myLamp = new DeskLamp();
		myLamp.turnOn();
		System.out.println(myLamp); //toString���� ��µǴ� ������ ��� Ŭ������ Object�� ���ԵǾ� �ֱ� ������ ��ȣ�ȿ� myLamp�� object�� �ް� toString�� String�������� �ο��� ��. �׷��� ������ ����� �Ȱ� println(Object x)�� �۾��� �Ȱ���. ū ���� �������� �������� �˰Ե� ������ ��ӿ��� ��� �� ���� �ƹ�ư �˼� ����.
		myLamp.turnOff();
		System.out.println(myLamp.toString()); //�̰� �������� ���� ��������� �׳� �����ذ� ���� ���� ��, 23���� 25���� println�� �ٸ����̴�. ������ println(Object x)�� ���̰� �̰Ŵ� println(String x)�ΰ��� 

	}

}
