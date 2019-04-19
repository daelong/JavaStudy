class DeskLamp{
	private boolean isOn;
	
	public void turnOn() {
		isOn = true;
	}
	public void turnOff() {
		isOn = false;
	}
	
	public String toString() {
		return "현재 상태는 " + (isOn == true ? "켜짐" : "꺼짐");
	}
}
public class DeskLampTest {

	public static void main(String[] args) {
		DeskLamp myLamp = new DeskLamp();
		myLamp.turnOn();
		System.out.println(myLamp); //toString으로 출력되는 이유는 모든 클래스는 Object에 포함되어 있기 때문에 괄호안에 myLamp를 object로 받고 toString에 String형식으로 부여를 함. 그렇기 때문에 출력이 된거 println(Object x)로 작업이 된것임. 큰 것이 작은것이 있을것을 알게된 이유는 상속에서 배울 수 있음 아무튼 알수 있음.
		myLamp.turnOff();
		System.out.println(myLamp.toString()); //이건 위에꺼를 내가 명시적으로 그냥 적어준것 같은 것임 즉, 23번과 25번의 println은 다른것이다. 위에는 println(Object x)인 것이고 이거는 println(String x)인것임 

	}

}
