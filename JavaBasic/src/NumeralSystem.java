import java.util.*;

public class NumeralSystem {

	public static void main(String[] args) {
		int n, x, m, y, k;
		int remainder = 0; //������
		int i = 1; //10�������� n������ �ٲ��ֱ� ���� ��ġ(���ڸ����� �÷��־���ϱ⶧����)
		int sum = 0; //x+y
		int quotient = 0; // ��
		int result =0; // ���� ���
		
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
		
		sum = x+y;
		while(sum>k){
			quotient = sum/k; // 142/9 = 15, 15/9 =
			remainder = sum%k; // 142%9 = 7, 15%9 = 6
			sum = remainder;
			remainder = sum*i; // 7*i = 1, 6*10 = 60
			i = i*10; // i = 10, i = 100
			result = result + remainder; //result = 7 , 67
			sum = quotient; // remainder = 15 , 1 = sum
		}
		quotient = quotient*i; // 1 * 100
		result = result + quotient; // 67 + 100
		System.out.println("x + y : " +result); // 167
	}

}