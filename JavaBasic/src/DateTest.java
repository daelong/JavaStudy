import java.util.Scanner;

class Date{
	private int year;
	private String month;
	private int day;
	
	public Date() {
		this(2009, "1��", 1); //�� - Date(String, int, int)�ִ°� ȣ�� �� Date(String, int, int)�ִ°� setDate()�� ȣ����.
//		month = "1��";
//		day = 1;
//		year = 2009;
	}
	public Date(int year, String month, int day) { //�����س��� ������ �� �� �ִ� ���� ����� ���� �ٸ��͵��� �� ���ϱ�
		setDate(year, month, day);
	}
	public Date(int year) { 
		//setDate(year, "1��", 1);
		this(year, "1��", 1); // ��, �̹� this�� �����ڸ� ���ϴ� �ǹ��̰�
	}
	public void setDate(int year, String month, int day) { //���� �����س���
		this.month = month; //�� this�� ��ü�� �������ִ�  month�̴�. �̷��� ���ִ� ������ ���������� �̸��� ��ġ�ϱ� this�� ���ִ°���.
		this.day = day;
		this.year = year;
	}
}
public class DateTest {

	public static void main(String[] args) {
		Date date1 = new Date(2009, "3��", 2);
		Date date2 = new Date(2010);
		Date date3 = new Date();

	}

}
