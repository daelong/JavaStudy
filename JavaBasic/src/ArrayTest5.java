import java.util.Scanner;

public class ArrayTest5 {
	final static int STUDENTS = 5; //학생수 5
	
	public static void main(String[] args) {
		int[] scores = new int[STUDENTS]; //scores의 배열 크기는 5
		getValues(scores); //메소드 getValues에 score의 크기 5만큼 넣어줌
		getAverage(scores);

	}
	private static void getValues(int[] array) { //array의 크기는 5
		Scanner scanner = new Scanner(System.in); 
		for(int i = 0; i < array.length; i++) { //5번 반복
			System.out.print("성적을 입력하시오 : "); //5번 프린트됨
			array[i] = scanner.nextInt(); //성적을 넣어줌
		}
	}
	
	private static void getAverage(int[] array) { //array의 크기는 5
		int total = 0;
		for(int i = 0; i < array.length; i++)  
			total += array[i];
		System.out.println("평균 성적은 " + total/array.length + "입니다.");
	}

}
