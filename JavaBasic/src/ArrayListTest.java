import java.util.*;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		
		a.add("BREAD");
		a.add("MILK");
		a.add("GRAPE");
		a.set(1, "CONG");
		a.add(1, "CONG2");
		a.remove(3);
		for(String value : a)
			System.out.println(value);

	}

}
