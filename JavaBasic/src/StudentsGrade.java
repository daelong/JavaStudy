import java.util.*;

class StudentsGrade {
	static double getGrade(int a[]) {
		double total = 0;
		for(double i : a)
			total += i;
		return total/a.length;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�л� ���� �Է��ϼ��� : ");
		int[] students = new int[scanner.nextInt()];
		int grade = 0;
		for(int i = 0; i < students.length; i++) {
			System.out.print("�л� " + (i+1) + "�� ������ �Է��ϼ���  : "  );
			grade = scanner.nextInt();
			if(0 < grade && grade > 100) {
				System.out.println("�߸��� �����Դϴ�. �ٽ� �Է��ϼ���	");
				i--;
				continue;
			}
			else {
				students[i] = grade;
			}
		}
		System.out.println("���� ����� " + getGrade(students) + " �Դϴ�. ");

	}

}
