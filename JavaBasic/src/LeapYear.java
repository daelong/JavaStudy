import java.util.*;

public class LeapYear {

	public static void main(String[] args) {
		int year;
		boolean leap;
		boolean leap1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("해를 입력하세요 : ");
		year = scanner.nextInt();
		leap = (year%4==0 &&year%400==0)? true : false;
		leap1 = (boolean)(year%100!=100);
		System.out.println("지금 해는 윤년일까요? " + leap1);
		
		
		
		
//		if( year%4 == 0) {
//			if(year%100 == 0) {
//				if(year%400 == 0)
//					System.out.println("윤년입니다.");
//				else
//					System.out.println("평년입니다.");
//			}
//			else
//				System.out.println("윤년입니다.");
//		}
//		else
//			System.out.println("평년입니다.");
	}

}
