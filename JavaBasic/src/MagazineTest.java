class Book{
	private String title;
	private int pageNum;
	private String writer;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	public String getWriter() {
		return writer;
	}public void setWriter(String writer) {
		this.writer = writer;
	}
	public void toString(Object obj) {
		System.out.println("���� : " + title + " �ۼ��� : " + writer + " ��ü ������ �� : " + pageNum);
	}
}
class Magazine extends Book{
	private String initDay;
	public String getInitDay() {
		return initDay;
	}
	public void setInitDay(String initDay) {
		this.initDay = initDay;
	}
	public void toString(Object obj) {
		System.out.println("���� : " + super.getTitle() + " �ۼ��� : " + super.getWriter() + " ��ü ������ �� : " + super.getPageNum() + " �߸��� : " + initDay);
	}

}
class MagazineTest{

	public static void main(String[] args) {
		Book a = new Book();
		a.setTitle("������ �������� �������");
		a.setPageNum(99999);
		a.setWriter("��������");
		a.toString(a);
		System.out.println();

		Magazine b = new Magazine();
		b.setTitle("������ ���");
		b.setPageNum(99999);
		b.setWriter("����");
		b.setInitDay("2019/02/27");
		b.toString(b);

	}

}
