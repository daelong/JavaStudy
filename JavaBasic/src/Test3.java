import java.util.*;

public class Test3 {

	public static void main(String[] args) {
		
		int n, x, m, y, k;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("n�� �Է��Ͻÿ� : ");
		n = scanner.nextInt();
		System.out.println("x�� �Է��Ͻÿ� : ");
		x = scanner.nextInt(n);
		System.out.println("m�� �Է��Ͻÿ� : ");
		m = scanner.nextInt();
		System.out.println("y�� �Է��Ͻÿ� : ");
		y = scanner.nextInt(m);
		System.out.println("k�� �Է��Ͻÿ� : ");
		k = scanner.nextInt();
		
		String result=Integer.toString(x+y, k);
		System.out.println("x + y : " + result);
		
		
	}
}