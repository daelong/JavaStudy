import java.util.*;

public class NumeralSystem {

	public static void main(String[] args) {
		
		int n, x, m, y, k;
		int remainder = 0; //나머지
		int sum = 0; //x+y
		int quotient = 0; // 몫
		char [] cha = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};// 숫자 지정
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
		
		char [] cha1 = new char [k]; // k진수 만들기
		char [] cha2 = new char [1000000]; // 출력할 숫자만들기
		for(int i = 0; i<k; i++ ) {
			cha1[i] = cha[i]; //k진수의 숫자 만들기
		}
		if(n<17 && n>1 && m<17 && m>1 && k<17 && k>1 ) {
			sum = x+y;
			while(sum>=k) { // 
				quotient = sum/k; //몫을 구하기 위한 연산 
				remainder = sum%k; //나머지를 구하기 위한 연산
				cha2[j] = cha1[remainder]; // 출력할 숫자를 구하기 위한 연산
				j++; //다음 자리수를 위한 증가
				sum = quotient;
			}
		}
		else {
			System.out.println("진수를 잘못 입력하였습니다.");
		}
		cha2[j] = cha1[quotient]; //최종 몫을 받기위해
		System.out.print("x + y : ");
		for(int i = j; i >= 0 ; i--) {
			System.out.print(cha2[i]);
		}
	}
}