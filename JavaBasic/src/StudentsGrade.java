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
		System.out.println("학생 수를 입력하세요 : ");
		int[] students = new int[scanner.nextInt()];
		int grade = 0;
		for(int i = 0; i < students.length; i++) {
			System.out.print("학생 " + (i+1) + "의 성적을 입력하세요  : "  );
			grade = scanner.nextInt();
			if(0 < grade && grade > 100) {
				System.out.println("잘못된 성적입니다. 다시 입력하세요	");
				i--;
				continue;
			}
			else {
				students[i] = grade;
			}
		}
		System.out.println("성적 평균은 " + getGrade(students) + " 입니다. ");

	}

}
