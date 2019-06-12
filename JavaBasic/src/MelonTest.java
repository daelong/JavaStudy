class Food{
	private int kcal;
	private int price;
	private int weight;
	public Food() {	}
	public Food(int kcal, int price, int weight) {
		this.kcal = kcal;
		this.price = price;
		this.weight = weight;
	}
	public int getKcal() {
		return kcal;
	}
	public void setKcal(int kcal) {
		this.kcal = kcal;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public void toString(Object obj) {
		System.out.println(kcal + ", " + price + ", " + weight);
	}
}
class Melon extends Food{
	private String farm;
	public Melon(int kcal, int price, int weight, String farm) {
		super.setKcal(kcal);
		super.setPrice(price);
		super.setWeight(weight);
		this.farm = farm;
	}
	public String getFarm() {
		return farm;
	}
	public void setFarm(String farm) {
		this.farm = farm;
	}
	public void toString(Object obj) {
		System.out.println(super.getKcal() + ", " + super.getPrice() + ", " + super.getWeight() + ", " + farm);
	}
}
class MelonTest{
	public static void main(String[] args) {
		Food a = new Food(50, 50000, 600);
		Melon b = new Melon(60, 6000, 500, "daelong's farm");
		
		a.toString(a);
		b.toString(b);

	}

}
