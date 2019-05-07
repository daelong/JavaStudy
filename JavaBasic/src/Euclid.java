import java.util.*;

public class Euclid {

	public static void main(String[] args) {
		int a;
		int b;
		int gcd;
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("a와 b값을 입력하시오 : ");
		a = scanner.nextInt();
		b = scanner.nextInt();
	
		if(a<b) {
			gcd = a;
			a = b;
			b = gcd;
		}
		while(b != 0) {
			n = a%b;
			a = b;
			b = n;
		}
		System.out.println("최대 공약수는 " + a + "입니다.");
		
	}

}
