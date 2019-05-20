import java.util.Scanner;

class Human{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + "]";
	}
	public String getProfession() {
		return "unknown";
	}
	public Human(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
}

class Student extends Human{
	@Override
	public String toString() {
		return super.toString() + "Student [major= " + major + "]";
	}
	public String getProfession() {
		return "student";
	}
	String major;
	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
}

public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student("명진", 21, "컴퓨터");
		Student s2 = new Student("미현", 22, "경영");
		Student s3 = new Student("용준", 24, "경제");
				

	}

}
