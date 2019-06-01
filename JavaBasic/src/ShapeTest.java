class Shape{
	public int x, y;
	public void draw() {
		System.out.println("Shape Draw");
	}
}

class Rectangle extends Shape{
	public int width, height;
	public void draw() {
		System.out.println("Rectangle Draw");
	}
}

class Triangle extends Shape{
	private int base, height;
	public void draw() {
		System.out.println("Triangle Draw");
	}
}

class Circle1 extends Shape{
	private int radius;
	public void draw() {
		System.out.println("Circle Draw");
	}
}

public class ShapeTest{
//	private static Shape arrayOfShape[];
	public static void main(String[] args) {
		Shape s;
		Rectangle r = new Rectangle(); //rec��ü 
		s = r;
		s.draw();
		System.out.println(r.width);
		f(s);
	}
	public static void f(Shape s) {
		Rectangle r2;
		r2 = (Rectangle)s;
		System.out.println(r2.width);
	}
}