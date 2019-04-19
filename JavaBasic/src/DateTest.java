import java.util.Scanner;

class Date{
	private int year;
	private String month;
	private int day;
	
	public Date() {
		this(2009, "1월", 1); //콜 - Date(String, int, int)있는거 호출 후 Date(String, int, int)있는게 setDate()를 호출함.
//		month = "1월";
//		day = 1;
//		year = 2009;
	}
	public Date(int year, String month, int day) { //설정해놓은 값들을 갈 수 있는 길을 만들어 놓고 다른것들은 다 콜하기
		setDate(year, month, day);
	}
	public Date(int year) { 
		//setDate(year, "1월", 1);
		this(year, "1월", 1); // 콜, 이번 this는 생성자를 콜하는 의미이고
	}
	public void setDate(int year, String month, int day) { //값들 설정해놓고
		this.month = month; //이 this는 객체가 가지고있는  month이다. 이렇게 해주는 이유는 참조변수랑 이름이 겹치니까 this를 해주는것임.
		this.day = day;
		this.year = year;
	}
}
public class DateTest {

	public static void main(String[] args) {
		Date date1 = new Date(2009, "3월", 2);
		Date date2 = new Date(2010);
		Date date3 = new Date();

	}

}
