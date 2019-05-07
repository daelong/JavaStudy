import java.util.*;

class DiceGame{
	private int diceFace;
	private int userGuess;
	
	public void RollDice() {
		diceFace = (int)(Math.random()*6 + 1);
	}
	public int getUserGuess(String prompt) {
		System.out.println(prompt);
		Scanner s = new Scanner(System.in);
		return s.nextInt();
		
	}
	public void checkUserGuess() {
		if( userGuess == diceFace)
			System.out.println("�����Դϴ�.");
		else
			System.out.println("Ʋ�Ƚ��ϴ�.");
	}
	public void startPlaying() {
		userGuess = getUserGuess("������ �Է����ֽʽÿ� : ");
		RollDice();
		checkUserGuess();
	}
}

public class DiceGameTest{
	public static void main(String args[]) {
		DiceGame game = new DiceGame();
		game.startPlaying();
	}
}