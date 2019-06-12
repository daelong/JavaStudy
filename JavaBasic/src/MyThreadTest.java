class MyRunnable implements Runnable{
	String myName;
	public MyRunnable(String name) { myName = name;}
	public void run() {
		for(int i = 10; i >= 0; i--) {
			System.out.print(myName + i +  " ");
		}
	}
}

//class MyThread extends Thread{
//	public void run() {
//		for(int i = 10; i >= 0; i--) {
//			System.out.print(i + " ");
//		}
//	}
//}

public class MyThreadTest {

	public static void main(String[] args) {
//		Thread t = new MyThread();
//		t.start();
//		for(int i = 10; i >= 0; i--) {
//			System.out.print(i + " ");
//		}
		Thread t = new Thread(new MyRunnable("A"));
		Thread t1 = new Thread(new MyRunnable("B"));
		t.start();
		t1.start();
		
	}

}
