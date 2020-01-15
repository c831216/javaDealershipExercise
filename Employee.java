package car_dealership;

public class Employee {
	String name;
	int experienceYears;
	String favCarMake;
	double comm;

	public Employee(String name, int experienceYears, String favCarMake, double comm) {
		super();
		this.name = name;
		this.experienceYears = experienceYears;
		this.favCarMake = favCarMake;
		this.comm = comm;
	}
	public void greet() {
		System.out.println("Hi, how you doing? My name's "+name);
	}
	public void askName() {
		System.out.println("Can I ask what your name is? ");
	}
}
