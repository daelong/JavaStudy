import java.util.Scanner;

class Employee{
	String name;
	String address;
	int salary;
	String phone;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}
public class EmployeeTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Employee[] employees = new Employee[3];
		for(int i = 0; i < employees.length; i++)
			employees[i] = new Employee();
		for(int i = 0; i < employees.length; i++) {
			System.out.println("捞抚 : ");
			employees[i].name = scanner.next();
			System.out.println("林家 : ");
			employees[i].address = scanner.next();
		}
		for(int i = 0; i < employees.length; i++) {
			System.out.println("捞抚 : " + employees[i].name);
			System.out.println("林家 : " + employees[i].address);
		}
	}

}
