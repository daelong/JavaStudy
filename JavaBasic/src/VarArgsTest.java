class Test{
	void sub(int... v) {
		System.out.println("인수의 개수  : " + v.length);
		for(int x : v) //x가 v를 하나씩 방문한다.
			System.out.print(x + " ");
		System.out.println();
	}
	
}

public class VarArgsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test3 c = new Test3();
		c.sub(1);
		c.sub(2, 3, 4, 5, 6);
		c.sub();
	}

}
