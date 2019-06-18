import java.util.*;

class VectorTest {

	public static void main(String[] args) {
		Vector a = new Vector();
		
		a.add("Hello");
		a.add(100);
		a.add('c');
		
		for(int i = 0; i < a.size(); i ++)
			System.out.println(a.get(i));
		String s = (String)a.get(0);
		System.out.println(s);

	}

}
