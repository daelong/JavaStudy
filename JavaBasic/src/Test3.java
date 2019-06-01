import java.util.*;

public class Test3 {
	public static String Test3(String a) {
		int d = Integer.parseInt(a.substring(a.length()-1, a.length())) - 1;   
		String c = a.substring(0, a.length()-1) + a.toString(); 
		int[] b = new int [a.length()];
		String result ="";
		for(int i = b.length-1; i > 0; i--) {
			if(Integer.parseInt(a.substring(i-1, i))+Integer.parseInt(c.substring(i-1, i)) > 10) {
				result += Integer.parseInt(a.substring(i-1, i))+Integer.parseInt(c.substring(i-1, i)) - 10;
				result += Integer.parseInt(a.substring(i-2,i-1)) + Integer.parseInt(c.substring(i-2,i-1))+1;
				i--;
				continue;
			}else {
				result += Integer.parseInt(a.substring(i-1,i)) + Integer.parseInt(c.substring(i-1,i));
			}
		}
		Test3(c);
		return result;
	}
	public static void main(String[] args) {
		String a = "12379";
//		Test3(a);
		int d = Integer.parseInt(a.substring(a.length()-1, a.length())) - 1;   
		String c = a.substring(0, a.length()-1) + (Integer.parseInt(a.substring(a.length()-1, a.length()))-1); 
		int[] b = new int [a.length()];
		int i = a.length();
		String result ="";
		System.out.println(c);
		System.out.println(Integer.parseInt(a.substring(a.length()-1, a.length())));
		System.out.println(Integer.parseInt(c.substring(c.length()-1, c.length())));
//		System.out.println(Integer.parseInt(a.substring(, i+1)));
//		for(int i = a.length(); i > 1; i--) 
		while(a.length()>0){
//			System.out.println(Integer.parseInt(a.substring(i, i+1)));
//			System.out.println(Integer.parseInt(c.substring(i, i+1)));
			if(Integer.parseInt(a.substring(i-1, i))+Integer.parseInt(c.substring(i-1, i)) > 10) {
				result += Integer.parseInt(a.substring(i-1, i))+Integer.parseInt(c.substring(i-1, i)) - 10;
				a = a.substring(0, a.length()-1)+1;
//result에 넣는게 아니라 a,b의 두번째가 그냥 더할 때 1을 더해줘야함				result += Integer.parseInt(a.substring(i-2,i-1)) + Integer.parseInt(c.substring(i-2,i-1))+1;
				System.out.println(result);
				continue;
			}else {
				result += Integer.parseInt(a.substring(i-1,i)) + Integer.parseInt(c.substring(i-1,i));
			}
		}
		System.out.println(result);
		
//		long a = 100;
//		long b = 0;
//		for(long i = 0; i <= a; i++) {
//			b += i;
//		}
//		System.out.println(b);

		
	}
}