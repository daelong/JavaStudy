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
			System.out.println("정답입니다.");
		else
			System.out.println("틀렸습니다.");
	}
	public void startPlaying() {
		userGuess = getUserGuess("예상값을 입력해주십시오 : ");
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