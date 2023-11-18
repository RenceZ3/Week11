package week11;

public class CatClass extends Pet {
	private String color;
	private double price;

	public CatClass(String color, double price) {
		super(color, price);
		this.color = color;
		this.price = price;
	}
	
	public void milk() {
		System.out.println("Cat Color is "+ getColor());
	}
	
	public String getColor() {
		return color;
	}
	
	public double price() {
		return price;
	}
	
}
