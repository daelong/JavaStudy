import java.util.*;

public class NumeralSystem {

	public static void main(String[] args) {
		int n, x, m, y, k;
		int remainder = 0; //나머지
		int i = 1; //10진수에서 n진수로 바꿔주기 위한 장치(한자리수씩 올려주어야하기때문에)
		int sum = 0; //x+y
		int quotient = 0; // 몫
		int result =0; // 최종 결과
		String character = "0123456789abcdef"; //11진수부터 16진수를 위한 문자
		char cha1 ='a'; //
		char cha2 = 'b';
		char [] cha = new char [10];
		int j = 0;
		
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
			while(sum>=k){
				quotient = sum/k; // 2110/14 = 150, 150/14 = 10
				remainder = sum%k; // 2110%14 = 10, 150%14 = 10  
				if( k < 17 && k > 9) {
					if(remainder>9 && remainder<k) {
						while(quotient>=10) {
							cha[j] = character.charAt(remainder); // cha[0] = 'a'
							j++;
							sum = quotient; // sum = 10
							break;
						}
						if(quotient>k) {
							continue;
						}
						else break;
					}else{
						sum = quotient;
						if(sum>k)continue;
						else break;
					}
					
				}
				else{
					sum = remainder;
					remainder = sum*i; // 7*i = 1, 6*10 = 60
					i = i*10; // i = 10, i = 100
					result = result + remainder; //result = 7 , 67
					sum = quotient; // remainder = 15 , 1 = sum
				}
			}
			if( k < 17 && k > 9) {
				if(quotient>9 && quotient<k) {
					cha[j] = character.charAt(quotient); 
					System.out.print(cha[j]);
					for(i = 0; i < j; i++) {
						System.out.print(cha[i]);
					}
					if(remainder<10) System.out.println(remainder);
					/*
					cha2 = character.charAt(quotient);
					System.out.print(cha2);
					if(remainder<10) {
						System.out.println(remainder);
					}
					else if(remainder>9 && remainder <17) {
						System.out.println(cha1);
					}
					*/
				}
			}
			else{
				quotient = quotient*i; // 1 * 100
				result = result + quotient; // 67 + 100
				System.out.println("x + y : " +result); // 167
			}
		}
		else {
			System.out.println("진수를 잘못 선택하였습니다.");
		}
	}
}