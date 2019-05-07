class Average{
	private int a;
	private int b;
	private int average;
	
	public int getAverage() {
		return average;
	}
	public void setAverage() {
		this.average = (a+b)/2;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getAverage(int a, int b) {
		return average = (a+b)/2;
	}
	public int getAverage(int a, int b, int c) {
		return average = (a+b+c)/3;
	}
	public String toString() {
		return "Æò±Õ °ªÀº : " + average;
	}
}

public class AverageTest {

	public static void main(String[] args) {
		Average myAverage1 = new Average();
		myAverage1.setA(5);
		myAverage1.setB(5);
		myAverage1.setAverage();
		System.out.println(myAverage1.getAverage());
		System.out.println(myAverage1.getAverage(2,4));
		System.out.println(myAverage1.getAverage(2,4,6));
	}

}
