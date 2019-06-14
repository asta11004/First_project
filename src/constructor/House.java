package constructor;

public class House {

	private double price;
	private int bedrooms;
	private int sqft;
	private String type;
	
	public House() {
		System.out.println("No arguments constructor!!!");
	}
	public House (double price, int bedrooms, int sqft, String type) {
		this();
		this.price=price;
		this.bedrooms=bedrooms;
		this.sqft=sqft;
		this.type=type;
		System.out.println("All arguments constructor!");
	}
	
	public House(double price, String type) {
		this.price=price;
		this.type=type;
		
		System.out.println("Two args constructor");
	}
	
	
	
	@Override
	public String toString() {
		return "House [price=" + price + ", bedrooms=" + bedrooms + ", sqft=" + sqft + ", type=" + type + "]";
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getBedrooms() {
		return bedrooms;
	}
	public void setBedrooms(int bedrooms) {
		this.bedrooms = bedrooms;
	}
	public int getSqft() {
		return sqft;
	}
	public void setSqft(int sqft) {
		this.sqft = sqft;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
