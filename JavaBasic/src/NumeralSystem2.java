import java.util.*;

public class NumeralSystem2 {

	public static void main(String[] args) {
		int n, x, m, y, k;
		int remainder = 0; //������
		int sum = 0; //x+y
		int quotient = 0; // ��
		String cha = "0123456789abcdef";
		String cha1 = " ";
		int j = 0; //�迭 ������ ���� ��
		
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
		
		if(n<17 && n>1 && m<17 && m>1 && k<17 && k>1 ) {
			sum = x+y;
			while(sum>=k) { // 
				quotient = sum/k; //���� ���ϱ� ���� ���� 
				remainder = sum%k; //�������� ���ϱ� ���� ����
				cha1 += cha.charAt(remainder); // ����� ���ڸ� ���ϱ� ���� ����
				sum = quotient;
			}
			cha1 += cha.charAt(quotient); //ó������ ����� ���ڸ� ����
			System.out.print("x + y : ");
			for(int i = cha1.length()-1; i >=1; i--)	
				System.out.print(cha1.charAt(i)); //������ ���ڸ� �Ųٷ� ���
			
		}
		else {
			System.out.println("������ �߸� �Է��Ͽ����ϴ�.");
		}
	}

}