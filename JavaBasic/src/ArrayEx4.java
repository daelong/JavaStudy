
public class ArrayEx4 {

	public static void main(String[] args) {
		char [] abc = { 'A', 'B', 'C', 'D'};
		char [] num = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		System.out.println(abc);
		System.out.println(num);
		
		char [] result = new char[abc.length + num.length];
		System.arraycopy(abc, 0, result, 0, abc.length); // 0부터 abc.length까지
		System.arraycopy(num, 0, result, abc.length, num.length); //abc.length부터 num.length까지
		System.out.println(result);
		
		System.arraycopy(abc, 0, num, 0, abc.length);
		System.out.println(num);
		
		System.arraycopy(abc, 0, num, 6, 3);
		System.out.println(num);
	}

}
