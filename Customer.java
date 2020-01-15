package car_dealership;

public class Customer {
	
	String name;
	String address;
	double cash;
	String favColour;
	String driveTrain;
	int likelynessToBuy;
	
	public Customer(String name, String address, double cash, String favColour, String driveTrain,
			int likelynessToBuy) {
		super();
		this.name = name;
		this.address = address;
		this.cash = cash;
		this.favColour = favColour;
		this.driveTrain = driveTrain;
		this.likelynessToBuy = likelynessToBuy;
	}

	public int firstResponse(String a) {
		if(a.contains("A")) {
			System.out.println("\nCustomer responds: Hi, I'm good. Thanks for asking.");
			return 0;
		}
		else {
			System.out.println("\nCustomer responds: She sure is isn't she.");
			return 1;
		}
	}

	public void purchaseCar(Vehicle car, Employee staff, Boolean finance) {
		
	}
	
	public void speak() {
		System.out.println("Hi, my name is "+name);
	}
	public void favcolour() {
		System.out.println("My favorite colour is "+favColour);
	}

	public void greet() {
		System.out.println("Hello, my name is "+name+" I'm interested in buying a car but only have R"+cash+" what can you show me in that price range?");
		
	}
}
