import java.util.Scanner;

public class Sigma {
	public static String Sigma(String a) {
		int d = Integer.parseInt(a.substring(a.length()-1, a.length())) - 1;   
		String c = a.substring(0, a.length()-1) + a.toString(); 
		int[] b = new int [a.length()];
		String result ="";
		for(int i = b.length-1; i >= 0; i--) {
			if(Integer.parseInt(a.substring(i-1, i))+Integer.parseInt(c.substring(i-1, i)) > 10) {
				result += Integer.parseInt(a.substring(i-1, i))+Integer.parseInt(c.substring(i-1, i)) - 10;
				result += Integer.parseInt(a.substring(i-2,i-1)) + Integer.parseInt(c.substring(i-2,i-1))+1;
				i--;
				continue;
			}else {
				result += Integer.parseInt(a.substring(i-1,i)) + Integer.parseInt(c.substring(i-1,i));
			}
		}
		Sigma(c);
		return result;
	}
		
//		result += Integer.parseInt(a.substring(i-3, i))+Integer.parseInt(b.substring(i-3, i)) - 10;
//		result += Integer.parseInt(a.substring(i-4,i-3)) + Integer.parseInt(b.substring(i-4,i-3))+1;
//		i--;
//		continue;
//	}
//	else {
//		result += Integer.parseInt(a.substring(i-1,i)) + Integer.parseInt(b.substring(i-1,i));
//	}
		
	
	public static void main(String[] args) {
		String a = "15243259782395174258506242832691020828424257626";
		System.out.println(Sigma(a));
		
//		int[] b = new int [a.length()/3 + a.length()%3];
//		int[] c = new int [b.length];
//		int[] add = new int[a.length()*2];
//		int j = 0;
//		int q = 0;
//		String result = "";
//		
//		for(int i = a.length()-1; i >= 0 ; i-=3) {
//			if(i<2) {
//				b[j] = Integer.parseInt(a.substring(i-1,i+1));
//				j++;
//			}
//			else {	
//				b[j] = Integer.parseInt(a.substring(i-2,i+1));
//				j++;
//			}
//		}
//		
//		for(int i = 0; i < b.length; i++) {
//				System.out.println(b[i]);
//		}
//		
//		//1+2+3...+n까지 더하기
//		for(int i = 0; i < b.length; i++) {
//			for(int k = b.length-1; k > 0; k-- ) {
//				for(int z = b[i]; z > 0; z--) {
//					if(b[i]<1000) {
//						for(int w = 0; w< 1000; w++)
//							add[k-1] += w;
//					}else {
//						for(int w = 0; w < b[i]; w++) {
//							add[k-1] += w;
//						}
//					}
//					System.out.println(add[k-1]);
//				}
//				for(int m = 0; m < add.length; m++) {
//					if(add[k] >= 1000) {
//						add[k] += add[k-1]/1000;
//						add[k-1] = add[k-1]%1000; 
//					}
//				}
//			System.out.println(add[k]);
//			}
//			System.out.println(add[i]);
//		}
//		
//		for(int i = 0; i < add.length; i++) {
//			if(add[i] >= 1000) {
//				add[i+1] += add[i]/1000;
//				add[i] = add[i]%1000; 
//			}
//			System.out.println(add[i]);
//		}
//		System.out.println("마지막 배열" + "0" +add[0]);
		//출력
//		for(int i = add.length-1; i>=0; i--) {
//			if(i == add.length-1  add[i] !=0) {
//				System.out.print(add[i] + "fkdshfldfh,");
//			}
//			if(add[i] != 0 && add[i]>100 && i != 00)
//				result += add[i] + ",";
//				System.out.print(add[i] + ",");
//			else if(i != add.length-1 && 0 < add[i] && add[i]<100 && i != 0){
//				result += "0" + add[i] + ",";
//				System.out.print("0"+ add[i]);
			}
//			else if( i == 0 && add[i] > 100)
//				result += add[i];
//			else if(i == 0 && add[i] < 100)
//				result += "0" +add[i];
//		}
//		if(Integer.parseInt(result.substring(0, 1)) != 0)
//			System.out.println(result);
//		else
//			System.out.println(result.substring(1, result.length()));
//		
		//result에 값들 정렬시키셔 출력하는 부분
//		for(int i = b.length-1; i >= 0; i--) {
//			if(i == b.length-1) {
//				result += b[i];
//			}
//			else if(i != b.length-1 && b[i] < 100) {
//				result += ",0" + b[i];
//			}else {
//				result += "," + b[i];
//			}
//		}
//		System.out.println(result);
//	}
}
//		for(int i = 0; i < c[i]; i++ ) { 
//			for(int k = 0; k < b.length; k++) {
//				c[i] += b[k]; 
//			}
//		}
//		for(int i = 0; i < c.length; i++) {
//			System.out.println(c[i]);	
//		}
//	}
//}
//					
					
//				result += Integer.parseInt(a.substring(i-3, i))+Integer.parseInt(b.substring(i-3, i)) - 10;
//				result += Integer.parseInt(a.substring(i-4,i-3)) + Integer.parseInt(b.substring(i-4,i-3))+1;
//				i--;
//				continue;
//			}
//			else {
//				result += Integer.parseInt(a.substring(i-1,i)) + Integer.parseInt(b.substring(i-1,i));
//			}
			
//		}
//		for(int i = result.length()-1; i >= 0; i--) {
//			System.out.print(result.charAt(i));
//		}
		//System.out.println(result);
//	}
//}
