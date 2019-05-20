abstract class Shape{
	int x, y;
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public abstract void draw();
};

class Rectangle extends Shape{
	int width, height;
	public void draw() { //추상메소드 구현
		System.out.println("사각형 그리기 메소드");
	}
};

public class ShapeTest {

	public static void main(String[] args) {
		Rectangle rec = new Rectangle();
		rec.draw();

	}

}
