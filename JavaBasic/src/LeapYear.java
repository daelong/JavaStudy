import java.util.*;

public class LeapYear {

	public static void main(String[] args) {
		int year;
		boolean leap;
		boolean leap1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("�ظ� �Է��ϼ��� : ");
		year = scanner.nextInt();
		leap = (year%4==0 &&year%400==0)? true : false;
		leap1 = (boolean)(year%100!=100);
		System.out.println("���� �ش� �����ϱ��? " + leap1);
		
		
		
		
//		if( year%4 == 0) {
//			if(year%100 == 0) {
//				if(year%400 == 0)
//					System.out.println("�����Դϴ�.");
//				else
//					System.out.println("����Դϴ�.");
//			}
//			else
//				System.out.println("�����Դϴ�.");
//		}
//		else
//			System.out.println("����Դϴ�.");
	}

}
