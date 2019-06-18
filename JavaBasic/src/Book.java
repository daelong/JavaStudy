class Novel extends Book{
	public int getLateFees(int days) {
		return days*300;
	}
}

class Poet extends Book{
	public int getLateFees(int days) {
		return days*200;
	}
}

class ScienceFiction extends Book{
	public int getLateFees(int days) {
		return days*600;
	}
}

class Book {
	private int number;
	private String title;
	private String author;
	
	public int getNumber() {
		return number;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	public boolean equals(int a) {
		if(number == a) 
			return true;
		else
			return false;
	}
	
	public int getLateFees(int days) {
		return days*100;
	}

	public static void main(String[] args) {
		Novel n = new Novel();
		ScienceFiction s = new ScienceFiction();
		n.setAuthor("����");
		n.setNumber(10001);
		n.setTitle("���ΰ���");
		System.out.print(n.getAuthor() + " " + n.getNumber() + " " + n.getTitle());
		System.out.println();
		System.out.println(n.getTitle() + "�� ��ü��� " + s.getLateFees(5) + "���Դϴ�.");

	}

}
