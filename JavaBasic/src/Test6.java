class NotFoundException extends Exception{
	public NotFoundException() {
		super("���ϴ� ���ڰ� �迭�ȿ� �����ϴ�.");
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
			System.out.println("ã�� ���� �迭�ȿ� �ֽ��ϴ�.");
		else
			throw new NotFoundException();
	}
}