package car_dealership;

public class Employee {
	String name;
	int experienceYears;
	String favCarMake;
	double comm;
	double salary;

	public Employee(String name, int experienceYears, String favCarMake, double comm, double salary) {
		super();
		this.name = name;
		this.experienceYears = experienceYears;
		this.favCarMake = favCarMake;
		this.comm = comm;
		this.salary = salary;
	}
	public void greet() {
		System.out.println("My name's "+name);
	}
	public void askName() {
		System.out.println("Can I ask what your name is? ");
	}
	public void askFavColour() {
		System.out.println("Can I ask what colour you like? ");
	}
	public void askFavCarMake() {
		System.out.println("Can I ask what your favourite car make is? ");
	}
}
