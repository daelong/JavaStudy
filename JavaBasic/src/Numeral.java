import java.util.*;

public class Numeral {

	public static void main(String[] args) {
		int n = 8;
		int x = 816;
		int y = 0;
		int i = 1;
		int result = 0;
		/*System.out.println(y);
		x = x/n;
		y = x%n;
		x = x/n;
		System.out.println(y);
		System.out.println(x);
		x = x*100;
		*/
		while(x>n) {
			y = x/n; // 142/9=15
			x = x%n; //142%9=7
			x = x*i; //7*1
			i = i*10;// i = 10
			System.out.println(x);
			result += x; //result = 7, 67
			x = y; //���� �ٽ��ѹ� n���� �������־���ϴ� x�� y�� ����
		}
		y = y*i;//���� ��*i = 100
		System.out.println(y);
		result = result + y; //100*67
		System.out.println(result);
	}

}