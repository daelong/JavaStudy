import java.util.*;

public class ArrayEx7 {

	public static void main(String[] args) {
		int [] numArr = new int [10];
		
		for(int i = 0; i < numArr.length; i++) {
			numArr[i] = i;
			System.out.print(numArr[i]);
		}
		System.out.println();
		
		for(int i = 0; i < numArr.length; i++) {
			int n = (int)(Math.random() * 10); //���ÿ�
			int tmp = numArr[0]; //0~9���� �����
			numArr[0] = numArr[n]; // ù��° �迭�� ������ �� ���� ��, ������
			numArr[n] = tmp; // �̰͵� ������  ->> ������ ������ ���� : �̹� �迭�� ���� 0~9���� ���������Ƿ�
		}
		System.out.println(Arrays.toString(numArr));
	}

}