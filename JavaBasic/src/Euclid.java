import java.util.*;

public class Euclid {

	public static void main(String[] args) {
		int a;
		int b;
		int gcd;
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("a�� b���� �Է��Ͻÿ� : ");
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
		System.out.println("�ִ� ������� " + a + "�Դϴ�.");
		
	}

}
