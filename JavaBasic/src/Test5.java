
public class Test5 {

	public static void main(String[] args) {
		try{
			sub();
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("배열 범위를 넘어섰습니다.");
		}

	}
	public static void sub() throws ArrayIndexOutOfBoundsException{
		int[] array = new int[10];
		int i = array[10];
		
	}

}
