import java.util.Scanner;

class Sigma{
	String n;
	int total = 0;
	public String getN() {
		return n;
	}
	public void setIn(String n) {
		this.n = n;
	}
	public String sumSigma(String[] num) {
		for(int i = 0; i < num.length; i++ ) {
			num[i] += i;
		}
		for(int i = 0; i < num.length; i++) {
			total += Integer.valueOf(num[i]);
		}
		return String.valueOf(total);
	}
//	public void startSigma() {
//		n = sumSigma("������ �Է��ϼ��� : ");
//		
//	}
}
public class SigmaTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ �Է��ϼ��� : ");
		String n = scanner.next();
		int j = Integer.parseInt(n);
		String[] array = new String[j];
		Sigma s = new Sigma();
		s.sumSigma(array);
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("������ �Է��ϼ��� : ");
//		String n = scanner.next();
//		int total = 0;
//		String[] array = new String[Integer.valueOf(n)];
//		for(int i = 0; i < n.length(); i++) {
//			array[i] += i;
//		}
//		for(int i = 0; i <n.length(); i++) {
//			total += Integer.valueOf(array[i]);
//		}
//		System.out.println(String.valueOf(total));
	}

}
