import java.util.*;

class Histogram {

	public static void main(String[] args) {
		int[] h = {0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		String[] result = new String[h.length];
		for(int i = 0; i < result.length; i++) {
			result[i] += "";
		}
		Scanner scanner = new Scanner(System.in);
		System.out.println("입력하실 정수의 갯수를 입력하세요 : ");
		int[] a = new int[scanner.nextInt()];
		
		System.out.println("정수를 입력하세요 : ");
		for(int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
		}

		for(int i = 0; i < h.length-1; i++) {
			for(int j =0; j < a.length; j++) {
				if(h[i] < a[j] && a[j] <= h[i+1])
					result[i] += "*";	
				else 
					continue;
			}
		}
		for(int i = 0; i < result.length-1; i++) {
			System.out.println(h[i]+1 + "-" + h[i+1] + " : " + result[i].substring(4, result[i].length()));
		}
	}

}
