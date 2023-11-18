package week11;

public class Pet {
	private String color;
	private double price;
	
	public Pet(String color, double price) {
		this.color = color;
		this.price = price;
	}
	
	public void milk() {
		System.out.println("Pet Color is "+getColor());
	}
	
	public String getColor() {
		return color;
	}
	
	public double getPrice() {
		return price;
	}

}
