class Test{
	void sub1(int... v){
		System.out.println("인수의 개수 : " + v.length);
		for(int x : v) 
			System.out.print(x + " ");
		System.out.println();
	}
}

public class VarArgsTest{
	public static void main(String args[]) {
		Test c = new Test();
		c.sub1(1);
		c.sub1(2, 3, 4, 5, 6);
		c.sub1();
	}
}