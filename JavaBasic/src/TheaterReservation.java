import java.util.*;

class TheaterReservation {

	public static void main(String[] args) {
		boolean[] seats = new boolean[10];
		int retry = 0;
		seats[5] = true;
		seats[6] = true;
		seats[7] = true;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("�¼��� �����Ͻðڽ��ϱ�?(1 �Ǵ� 0)");
		int check = scanner.nextInt();
		while(check != 0) {
			if(check == 1) {
				System.out.println("������ ���� ���´� ������ �����ϴ�.");
				System.out.println("--------------------------------");
				System.out.println("1 2 3 4 5 6 7 8 9 10");
				System.out.println("--------------------------------");
				for(int i = 0; i < seats.length; i++) {
					if(seats[i] == true)
						System.out.print(1 + " ");
					else
						System.out.print(0 + " ");
				}
				System.out.println();
				System.out.println("���° �¼��� �����Ͻðڽ��ϱ�?");
				int check2 = scanner.nextInt();
				if(seats[check2-1] != true )
					seats[check2-1] = true;
				else {
					System.out.println("�̹� �¼��� �ֽ��ϴ�.");
					continue;
				}
				System.out.println("����Ǿ����ϴ�.");
				System.out.print("�¼��� �����Ͻðڽ��ϱ�?(1 �Ǵ� 0)");
				check = scanner.nextInt();
				
			}	

		}
//		if(check == 1) {
//			System.out.println("\n������ ���� ���´� ������ �����ϴ�.");
//			System.out.println("--------------------------------");
//			System.out.println("1 2 3 4 5 6 7 8 9 10");
//			System.out.println("--------------------------------");
//			for(int i = 0; i < seats.length; i++) {
//				if(seats[i] == true)
//					System.out.print(1);
//				else
//					System.out.print(0);
//			}
//			System.out.println();
//			System.out.println("���° �¼��� �����Ͻðڽ��ϱ�?");
//			int check2 = scanner.nextInt();
//			seats[check2] = true;
//			System.out.println("����Ǿ����ϴ�.");
//		}	

	}

}
