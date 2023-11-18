package week11;


/*
 * Clarence Juanata
 * 4537982
 * Sumithra CHANDRASEKAR
 */
public class MainMethod {
	
	public void car(int price, String model) {
		System.out.println("Car Details");
		System.out.println("==============================");
		System.out.println("Price: " + price);
		System.out.println("Model: " + model);
	}
	
	public void car() {
		System.out.println("Welcome to Toyota");
	}

	public static void main(String[] args) {
		//Overloading
		MainMethod car1 = new MainMethod();
		car1.car();
		car1.car(15000, "Vios");
		
		System.out.println();
		
		//Overriding
		Electronics e1 = new Electronics();
		e1.memory("32gb");
		Electronics mc1 = new MobileClass();
		mc1.memory("64gb");
		
		System.out.println();
		
		//Addition Class
		AdditionClass add1 = new AdditionClass();
		System.out.println("Result of 2 numbers "+add1.addition(59, 55));
		System.out.println("Result of 3 numbers "+add1.addition(15, 85, 66));
		
		System.out.println();
		
		//Pet Class
		Pet p1 = new Pet("Black", 555);
		p1.milk();
		Pet p2 = new CatClass("Yellow", 988);
		p2.milk();
		
	}

}
