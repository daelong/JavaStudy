class Date{
	private int year;
	private String month;
	private int day;
	
	public Date() {
		month = "1월";
		day = 1;
		year = 2009;
	}
	public Date(int year, String month, int day) {
		setDate(year, month, day);
	}
	public Date(int year) {
		setDate(year, "1월", 1);
	}
	public void setDate(int year, String month, int day) {
		this.month = month;
		this.day = day;
		this.year = year;
	}
	public void print() {
		System.out.println(year + "년" + month + " " + day + "일");
	}
}

public class DateTest{
	public static void main(String args[]) {
		Date date1 = new Date(2019, "3월", 25);
		Date date2 = new Date(2019);
		Date date3 = new Date();
		date1.print();
		date2.print();
		date3.print();
	}
}