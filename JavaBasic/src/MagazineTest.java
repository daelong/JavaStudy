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
		System.out.println("제목 : " + title + " 작성자 : " + writer + " 전체 페이지 수 : " + pageNum);
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
		System.out.println("제목 : " + super.getTitle() + " 작성자 : " + super.getWriter() + " 전체 페이지 수 : " + super.getPageNum() + " 발매일 : " + initDay);
	}

}
class MagazineTest{

	public static void main(String[] args) {
		Book a = new Book();
		a.setTitle("민지와 대현이의 사랑여행");
		a.setPageNum(99999);
		a.setWriter("대현민지");
		a.toString(a);
		System.out.println();

		Magazine b = new Magazine();
		b.setTitle("민지쓰 사랑");
		b.setPageNum(99999);
		b.setWriter("대현");
		b.setInitDay("2019/02/27");
		b.toString(b);

	}

}
