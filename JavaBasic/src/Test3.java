import java.util.*;

public class Test3 {

	public static void main(String[] args) {
		
		int n, x, m, y, k;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("n을 입력하시오 : ");
		n = scanner.nextInt();
		System.out.println("x를 입력하시오 : ");
		x = scanner.nextInt(n);
		System.out.println("m을 입력하시오 : ");
		m = scanner.nextInt();
		System.out.println("y를 입력하시오 : ");
		y = scanner.nextInt(m);
		System.out.println("k를 입력하시오 : ");
		k = scanner.nextInt();
		
		String result=Integer.toString(x+y, k);
		System.out.println("x + y : " + result);
		
		
	}
}