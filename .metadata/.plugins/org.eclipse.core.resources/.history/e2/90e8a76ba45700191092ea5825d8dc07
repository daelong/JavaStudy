class Tv { //클래스
	String color; //멤버변수, 속성들
	boolean power;
	int channel;
	
	void power() { power = !power; } //메소드들, 동작하는거
	void channelUp() { channel++; }
	void channelDown() { channel--; }
}

/*
class TvTest2{ //구현하기위한 클래스
	public static void main(String args[]) {
		Tv t1 = new Tv(); //인스턴스
		Tv t2 = new Tv();
		System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
		
		t1.channel = 7; //참조변수.멤버변수로 값 설정
		System.out.println("t1의 channel값이 변경되었습니다.");
		
		System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
	}
}
*/

class TvTest4{
	public static void main(String args[]) {
		Tv [] tvArr = new Tv[3];
		
		for(int i = 0; i < tvArr.length; i++) {
			tvArr[i] = new Tv();
			tvArr[i].channel = i + 10;
		}
		
		for(int i = 0; i < tvArr.length; i++ ) {
			tvArr[i].channelUp();
			System.out.printf("tvArr[%d].channel = %d \n", i, tvArr[i].channel);
		}
	}
}