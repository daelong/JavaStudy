class DeskLamp{
	private boolean isOn;
	public void turnOn() {
		isOn = true;
	}
	public void turnOff() {
		isOn = false;
	}
	public String toString() {
		return "현재 상태는 " + isOn + "입니다.";
	}
	public void print() {
		System.out.println("현재 상태는 " + isOn + "입니다.");
	}
}

public class DeskLampTest{
	public static void main(String args[]) {
		DeskLamp myLamp = new DeskLamp();
		myLamp.turnOn();
		System.out.println(myLamp);
		System.out.println(myLamp.toString());
		myLamp.print();
		myLamp.turnOff();
		System.out.println(myLamp);
		System.out.println(myLamp.toString());
		myLamp.print();
		
	}
}
