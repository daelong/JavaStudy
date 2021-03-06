class Phone{
	private String company;
	private int price;
	private String type;
	
	public Phone() {
	}
	public Phone(String company, int price, String type) {
		this.company = company;
		this.price = price;
		this.type = type;
	}
	public String getCompany() {
		return company;
	}
	public int getPrice() {
		return price;
	}
	public String getType() {
		return type;
	}
	public void setCompany(String company){
		this.company = company;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void toString(Object obj) {
		System.out.println(company + price + type);
	}
}

class SmartPhone extends Phone{
	String osType;
	String osVersion;
	int innerMemorySize;
	boolean camera;
	boolean bluetooth;
	
	public SmartPhone() {
	}
	public SmartPhone(String company, int price, String type, String osType, String osVersion, int innerMemorySize, boolean camera, boolean bluetooth) {
		super.setCompany(company);
		super.setPrice(price);
		super.setType(type);
		this.osType = osType;
		this.osVersion = osVersion;
		this.innerMemorySize = innerMemorySize;
		this.camera = camera;
		this.bluetooth = bluetooth;
	}
	public String getOsType() {
		return osType;
	}
	public String getOsVersion() {
		return osVersion;
	}
	public int getInnerMemorySize() {
		return innerMemorySize;
	}
	public boolean getCamera() {
		return camera;
	}
	public boolean getBluetooth() {
		return bluetooth;
	}
	public void setOsType(String osType) {
		this.osType = osType;
	}
	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}
	public void setInnerMemorySize(int innerMemorySize) {
		this.innerMemorySize = innerMemorySize;
	}
	public void setCamera(boolean camera) {
		this.camera = camera;
	}
	public void setBluetooth(boolean bluetooth) {
		this.bluetooth = bluetooth;
	}
	public void toString(Object obj) {
		System.out.println(super.getCompany() + super.getPrice() + super.getType() + osType + osVersion + innerMemorySize + camera + bluetooth);
	}
}

class SmartPhoneTest {

	public static void main(String[] args) {
		SmartPhone a = new SmartPhone("apple", 160, "5g", "daehyun", "7.1", 150, true, true);
		a.toString(a);

	}

}
