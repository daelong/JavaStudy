import java.util.Scanner;

public class ArrayTest5 {
	final static int STUDENTS = 5; //�л��� 5
	
	public static void main(String[] args) {
		int[] scores = new int[STUDENTS]; //scores�� �迭 ũ��� 5
		getValues(scores); //�޼ҵ� getValues�� score�� ũ�� 5��ŭ �־���
		getAverage(scores);

	}
	private static void getValues(int[] array) { //array�� ũ��� 5
		Scanner scanner = new Scanner(System.in); 
		for(int i = 0; i < array.length; i++) { //5�� �ݺ�
			System.out.print("������ �Է��Ͻÿ� : "); //5�� ����Ʈ��
			array[i] = scanner.nextInt(); //������ �־���
		}
	}
	
	private static void getAverage(int[] array) { //array�� ũ��� 5
		int total = 0;
		for(int i = 0; i < array.length; i++)  
			total += array[i];
		System.out.println("��� ������ " + total/array.length + "�Դϴ�.");
	}

}
