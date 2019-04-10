import java.util.*;

public class NumeralSystem {

	public static void main(String[] args) {
		int n, x, m, y, k;
		int remainder = 0; //나머지
		int i = 1; //10진수에서 n진수로 바꿔주기 위한 장치(한자리수씩 올려주어야하기때문에)
		int sum = 0; //x+y
		int quotient = 0; // 몫
		int result =0; // 최종 결과
		
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