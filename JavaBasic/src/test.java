import java.util.*;

public class test {

	public static void main(String[] args) {
		
		int n, x, m, y, k;
		int remainder = 0; //������
		int sum = 0; //x+y
		int quotient = 0; // ��
		char [] cha = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};// ���� ����
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
		
		char [] cha1 = new char [k]; // k���� �����
		char [] cha2 = new char [k]; // ����� ���ڸ����
		for(int i = 0; i<k; i++ ) {
			cha1[i] = cha[i]; //k������ ���� �����
		}
		if(n<17 && n>1 && m<17 && m>1 && k<17 && k>1 ) {
			sum = x+y;
			while(sum>=k) { // 
				quotient = sum/k; //���� ���ϱ� ���� ���� 
				remainder = sum%k; //�������� ���ϱ� ���� ����
				cha2[j] = cha1[remainder]; // ����� ���ڸ� ���ϱ� ���� ����
				j++; //���� �ڸ����� ���� ����
				sum = quotient;
			}
		}
		else {
			System.out.println("������ �߸� �Է��Ͽ����ϴ�.");
		}
		cha2[j] = cha1[quotient]; //���� ���� �ޱ�����
		System.out.print("x + y : ");
		for(int i = j; i >= 0 ; i--) {
			System.out.print(cha2[i]);
		}
		
	}
}