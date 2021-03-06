import java.util.*;

public class NumeralSystem2 {

	public static void main(String[] args) {
		int n, x, m, y, k;
		int remainder = 0; //나머지
		int sum = 0; //x+y
		int quotient = 0; // 몫
		String cha = "0123456789abcdef";
		String cha1 = " ";
		int j = 0; //배열 증가를 위한 수
		
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
		
		if(n<17 && n>1 && m<17 && m>1 && k<17 && k>1 ) {
			sum = x+y;
			while(sum>=k) { // 
				quotient = sum/k; //몫을 구하기 위한 연산 
				remainder = sum%k; //나머지를 구하기 위한 연산
				cha1 += cha.charAt(remainder); // 출력할 숫자를 구하기 위한 연산
				sum = quotient;
			}
			cha1 += cha.charAt(quotient); //처음으로 출력할 문자를 저장
			System.out.print("x + y : ");
			for(int i = cha1.length()-1; i >=1; i--)	
				System.out.print(cha1.charAt(i)); //저장한 문자를 거꾸로 출력
			
		}
		else {
			System.out.println("진수를 잘못 입력하였습니다.");
		}
	}

}
