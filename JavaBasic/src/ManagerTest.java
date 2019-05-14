class Employee1{
	public String name;
	String address;
	protected int salary;
	private int RRN;
	
	public String toString() {
		return name + "," + address + "," + RRN + "," + salary;
	}
}

class Manager extends Employee1{
	private int bonus;
	
	public void printSalary() {
		System.out.println(name + "(" + address + "):" + (salary+bonus));
	}
	public void printRRN() {
		//System.out.println(RRN);
	}
}
public class ManagerTest {

	public static void main(String[] args) {
		Manager m = new Manager();
		m.printRRN();
		m.salary = 100;
		System.out.println(m);

	}

}
