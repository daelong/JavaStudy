import java.util.*;

class Person1 implements Comparable{
	private String name;
	private int height;
	public Person1(String n, int h) {
		name = n;
		height = h;
	}
	public String getName() {return name;}
	public int getHeight() {return height;}
	
	public String getMaximum(Person1[] array) {
		int check = 0;
		int max = 0;
		int i = 0;
		for(Person1 value : array) {
			max = compareTo(max, value.height);
			
		}
//		for(int i = 0; i < array.length; i++) {
//			if(max < array[i].height) {
//				max = array[i].height;
//			}
//		}
			for(int j = 0; j < array.length; j++) {
				if(array[j].height == max) {
					check = j;
				}
			}
		return array[check].name;
	}
	
	public int compareTo(int a, int b) {
		if(a < b)
			return b;
		else if(a > b)
			return a;
		else 
			return a;
	}
	
//	public int compareTo(Object obj) {
//		Person1 other = (Person1)obj;
//		if(height < other.height)
//			return other.height;
//		else if( height > other.height)
//			return height;
//		else 
//			return height;
//	}
}
public class PersonTest {

	public static void main(String[] args) {
		Person1[] p = new Person1[7];
		p[0] = new Person1("mike", 167);
		p[1] = new Person1("jane", 183);
		p[2] = new Person1("kane", 157);
		p[3] = new Person1("kae", 197);
		p[4] = new Person1("ane", 147);
		p[5] = new Person1("kan", 187);
		p[6] = new Person1("kne", 198);

		System.out.println(p[0].getMaximum(p));
	}

}
