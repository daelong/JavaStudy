class Care{
	private int speed;
	
	public void setSpeed(int s) {
		speed = s;
		System.out.println("정수 버전 호출");
	}
	public void setSpeed(double s) {
		speed = (int)s;
		System.out.println("실수 버전 호출");
	}
}

public class CarTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short s = 10; //short는 정수보다 작음
		Care myCar = new Care();
		myCar.setSpeed(s); //이거하면 형변환을 해줘서 인트로 바꿔줌 
		myCar.setSpeed(100);
		myCar.setSpeed(79.2f); //이건 double보다 정확하지 않으니 double로 형변환을 해줘서 출력하게됨
		myCar.setSpeed(79.2);
		myCar.setSpeed('a'); // 정수로 형변환해서 나옴 씬기
	}

}
