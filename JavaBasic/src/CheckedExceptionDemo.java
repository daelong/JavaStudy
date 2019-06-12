import java.io.*; 
public class CheckedExceptionDemo {

	public static void main(String[] args) {
		try{ //g()를 써야하니 throws한것을 처리해야함. 그래서 try{} catch로 예외 두개 다 해준것임.
			g();
		}
		catch(FileNotFoundException e) {
			System.err.println("FileNotFoundException!");
		}
		catch(IOException e) {
			System.err.println("IOException!");
		}
	}
	public static void g() throws FileNotFoundException, IOException{ // throws는 여기서 exception처리를 못하니 이걸 받는 곳 FileNoFoundException, IOException으로 넘긴다는 뜻이다.
			BufferedReader bReader = new BufferedReader(new FileReader("out.txt"));
			String input = bReader.readLine();
			System.out.println(input);
		

	}

}
