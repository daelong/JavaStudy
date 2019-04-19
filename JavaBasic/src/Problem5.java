import java.util.*;

class ReverseCharacter{
	String userInput;
	
	public void reverse(String a) {
		for(int i = a.length()-1; i >=0; i--)	
			System.out.print(a.charAt(i));
		System.out.println();
	}
	
	public String getUserInput(String prompt) {
		System.out.println(prompt);
		Scanner s = new Scanner(System.in);
		return s.next();	
	}
	
	public void startReverse() {
		userInput = getUserInput("문자를 입력하세요 : ");
		reverse(userInput);
	}
}

public class Problem5 {

	public static void main(String[] args) {
		ReverseCharacter ch = new ReverseCharacter();
		ch.startReverse();
	}
}
