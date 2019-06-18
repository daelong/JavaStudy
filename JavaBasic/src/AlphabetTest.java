import java.util.*;

class CheckAlphabet{
	public CheckAlphabet(String a) {
		int vowelCount = 0;
		int consonantCount = 0;
		for(int i = 0; i < a.length(); i++) {
			if(a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'o' || a.charAt(i) == 'u')
				vowelCount++;
			else
				consonantCount++;
		}
		System.out.println("ÀÚÀ½ÀÇ °¹¼ö : " + consonantCount + "¸ðÀ½ÀÇ °¹¼ö : " + vowelCount );
	}
}
class AlphabetTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a = scanner.next();
		new CheckAlphabet(a);
	}

}
