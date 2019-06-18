class NotFoundException extends Exception{
	public NotFoundException() {
		super("원하는 숫자가 배열안에 없습니다.");
	}
}
class Test6 {

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		try{
			searchArray(array, 10);
		}
		catch(NotFoundException e) {
			System.out.println(e.getMessage());
		}

	}

	public static void searchArray(int[] a, int b) throws NotFoundException{
		int check= 0;
		for(int value : a) {
			if(value == b) {
				check = b;
				break;
			}
			else
				check = b-1;
		}
		if(check == b)
			System.out.println("찾는 값이 배열안에 있습니다.");
		else
			throw new NotFoundException();
	}
}
