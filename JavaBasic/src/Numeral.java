import java.util.*;

public class Numeral {

	public static void main(String[] args) {
		int n = 14;
		int x = 154;
		int y = 0;
		int i = 1;
		int result = 0;
		int add = 0;
		String character = "0123456789abcdef";
		char cha = 'a';
		
		while(x>=n) {
			y = x/n; // 몫
			x = x%n; // 나머지
			if( x>10 && x<n) {
				cha = character.charAt(n);
			}
			else{
				x = x*i; // 나머지 곱하기 자릿수
			}
			i = i*10;// 자릿수
			result += x; //result = 7, 67
			x = y; //몫을 다시한번 n으로 나누어주어야하니 x에 y값 대입
		}
		y = y*i;//최종 몫*i = 100
		result = result + y; //100*67
		if( cha == 'a' || cha == 'b' || cha == 'c' || cha == 'd' || cha == 'e' || cha == 'f') {
			System.out.println(result + cha);
		}
		else System.out.println(result);
	}

}
