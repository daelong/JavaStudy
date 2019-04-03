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
			int n = (int)(Math.random() * 10); //셔플용
			int tmp = numArr[0]; //0~9까지 저장용
			numArr[0] = numArr[n]; // 첫번째 배열에 랜덤한 수 적용 즉, 셔플중
			numArr[n] = tmp; // 이것도 셔플중  ->> 셔플이 가능한 이유 : 이미 배열의 값은 0~9까지 정해졌으므로
		}
		System.out.println(Arrays.toString(numArr));
	}

}
