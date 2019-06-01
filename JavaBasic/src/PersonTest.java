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
	public int compareTo(Object obj) {
		Person1 other = (Person1)obj;
		if(height < other.height)
			return -1;
		else if( height > other.height)
			return 1;
		else 
			return 0;
	}
}
public class PersonTest {

	public static void main(String[] args) {
		Person1[] p = new Person1[3];
		p[0] = new Person1("mike", 167);
		p[1] = new Person1("jane", 183);
		p[2] = new Person1("kane", 157);

		System.out.println(p[0].compareTo(p[1]));
	}

}
