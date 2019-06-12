import java.io.*; 
public class CheckedExceptionDemo {

	public static void main(String[] args) {
		try{ //g()�� ����ϴ� throws�Ѱ��� ó���ؾ���. �׷��� try{} catch�� ���� �ΰ� �� ���ذ���.
			g();
		}
		catch(FileNotFoundException e) {
			System.err.println("FileNotFoundException!");
		}
		catch(IOException e) {
			System.err.println("IOException!");
		}
	}
	public static void g() throws FileNotFoundException, IOException{ // throws�� ���⼭ exceptionó���� ���ϴ� �̰� �޴� �� FileNoFoundException, IOException���� �ѱ�ٴ� ���̴�.
			BufferedReader bReader = new BufferedReader(new FileReader("out.txt"));
			String input = bReader.readLine();
			System.out.println(input);
		

	}

}