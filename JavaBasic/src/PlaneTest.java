class Plane{
	private String company;
	private String model;
	private int maxCustomer;
	private static int planes = 0;
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getMaxCustomer() {
		return maxCustomer;
	}
	public void setMaxCustomer(int maxCustomer) {
		this.maxCustomer = maxCustomer;
	}
	public Plane() {planes++;}
	public Plane(String company, String model, int maxCustomer) {
		this.company = company;
		this.model = model;
		this.maxCustomer = maxCustomer;
	}
	public static int getPlanes() {
		return planes;
	}
	
}
class PlaneTest {
	public static void main(String[] args) {
		Plane a = new Plane();
		a.setCompany("대한항공");
		a.setModel("이대현호");
		a.setMaxCustomer(500);
		System.out.printf("%s, %s, %d\n", a.getCompany(), a.getModel(), a.getMaxCustomer());

		System.out.println(a.getPlanes());

	}

}
