import java.util.*;

class findCharacter{
	private String userInput;
	private int z = 0;
	private int j = 0;

	public void findVowel(String a) {
		for(int i = 0; i < a.length(); i++) {
			switch(a.charAt(i)) {
			case 'a':  case 'e': case 'i': case 'o': case 'u':
				z++;
				break;
			default:
				j++;
				break;
			}
		}
		System.out.println("������ ������ " + z + "�Դϴ�.");
		System.out.println("������ ������ " + j + "�Դϴ�.");
		
	}
	
	public String getUserInput(String prompt) {
		System.out.println(prompt);
		Scanner sc = new Scanner(System.in);
		return sc.next();
	}
	
	public void startFind(){
		userInput = getUserInput("���ڸ� �Է��ϼ��� : ");
		findVowel(userInput);
		
	}
}

public class Problem6 {

	public static void main(String[] args) {
		findCharacter fc = new findCharacter();
		fc.startFind();

	}

}