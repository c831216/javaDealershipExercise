package car_dealership;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Customer {
	
	String name;
	int budget;
	String favColour;
	String driveTrain;
	int likelinessToBuy;
	String favCarMake;
	
	public Customer(String name, int budget, String favColour, String driveTrain, int likelinessToBuy, String favCarMake) {
		super();
		this.name = name;
		this.budget = budget;
		this.favColour = favColour;
		this.driveTrain = driveTrain;
		this.likelinessToBuy = likelinessToBuy;
		this.favCarMake = favCarMake;
		
	}

	public int firstResponse(int a) {
		if(a == 0) {
			System.out.println("\nCustomer: Hi, I'm good. Thanks for asking.");
			return 0;
		}
		else if(a==1) {
			System.out.println("\nCustomer: She sure is isn't she.");
			return 1;
		}
		return 2;
	}
	
	public int cash() {
		// confirming budget
		int[] cash = {10000,12000,45000,15000,70000,5000};
		
		List<Integer> givenList = Arrays.asList(0, 1, 2, 3, 4, 5);
	    Random rand = new Random();
	    int randomElement = givenList.get(rand.nextInt(givenList.size()));
		
		return cash[randomElement];
	}
	
	public String name() {
		// selecting name
		String[] name = {"Alfonzo", "Bronwyn", "Calvin", "John", "Mike", "Amanda"};
		
		List<Integer> givenList = Arrays.asList(0, 1, 2, 3, 4, 5);
	    Random rand = new Random();
	    int randomElement = givenList.get(rand.nextInt(givenList.size()));
		
		return name[randomElement];
	}
	
	public String favCarMake() {
		// selecting favCarMake
		String[] carMake = {"BMW", "Merc", "VW", "Toyota", "Nissan", "Jeep"};
		
		List<Integer> givenList = Arrays.asList(0, 1, 2, 3, 4, 5);
	    Random rand = new Random();
	    int randomElement = givenList.get(rand.nextInt(givenList.size()));
		
		return carMake[randomElement];
	}
	
	public void myName() {
		System.out.println("My name is "+name);
	}
	
	public String favColour() {
		// selecting favCarMake
		String[] carColour = {"Pink", "Brown", "Orange", "Purple", "Green", "Yellow"};
		
		List<Integer> givenList = Arrays.asList(0, 1, 2, 3, 4, 5);
	    Random rand = new Random();
	    int randomElement = givenList.get(rand.nextInt(givenList.size()));
		
		return carColour[randomElement];
	}
	public String drivetrain() {
		// selecting favCarMake
		String[] drivetrain = {"Automatic", "Manual"};
		
		List<Integer> givenList = Arrays.asList(0, 1);
	    Random rand = new Random();
	    int randomElement = givenList.get(rand.nextInt(givenList.size()));
		
		return drivetrain[randomElement];
	}
	
}
