import java.util.Scanner;

class BigInteger{
	private String n;
	private String result = "";
	public String getN() {
		return n;
	}
	public void setN(String n) {
		this.n = n;
	}
	public String fact(String n) {
		for(int i = n.length(); i >0; i-- ) {
			String a = "n.charAt(i)";
		}
		String a += a;
		return b;
	}
	public void addSigma(String n, String b) {
		for(int i = n.length(); i > 0 ; i--) {
			if(Integer.parseInt(n.substring(i-1,i)) + Integer.parseInt(b.substring(i-1,i)) >= 10) {
				result += Integer.parseInt(n.substring(i-1, i))+Integer.parseInt(b.substring(i-1, i)) - 10;
				result += Integer.parseInt(n.substring(i-2,i-1)) + Integer.parseInt(b.substring(i-2,i-1))+1;
				break;
			}else {
				result += Integer.parseInt(a.substring(i-1,i)) + Integer.parseInt(b.substring(i-1,i));
			}
			addSigma();
	}
}
public class BigIntegerTest {

	public static void main(String[] args) {
		String a = "10005";
		String b = "10004";
		String result = "";
		for(int i = a.length(); i > 0 ; i--) {
			if(Integer.parseInt(a.substring(i-1,i)) + Integer.parseInt(b.substring(i-1,i)) >= 10) {
				result += Integer.parseInt(a.substring(i-1, i))+Integer.parseInt(b.substring(i-1, i)) - 10;
				result += Integer.parseInt(a.substring(i-2,i-1)) + Integer.parseInt(b.substring(i-2,i-1))+1;
				break;
			}else {
				result += Integer.parseInt(a.substring(i-1,i)) + Integer.parseInt(b.substring(i-1,i));
			}
			
		}
		for(int i = result.length()-1; i >= 0; i--) {
			System.out.print(result.charAt(i));
		}
		//System.out.println(result);
	}
}
