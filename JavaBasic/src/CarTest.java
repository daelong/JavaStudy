class Car{
	String color;
	int speed;
	int gear;
	void print() {
		System.out.println("(" + color + ", " + speed + ", " + ", " + gear + ")"); 
	}
}


public class CarTest {

	public static void main(String[] args) {
		Car yourCar = new Car();
		yourCar.color = "red";
		yourCar.speed = 0;
		yourCar.gear = 1;
		yourCar.print();
		
		Car myCar = new Car();
		myCar.color = "blue";
		myCar.speed = 60;
		myCar.gear = 3;
		myCar.print();
	}

}
