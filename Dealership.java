package car_dealership;

import java.util.Scanner;

public class Dealership {

	public static void main(String[] args) {
		System.out.println("Welcome to your first day at Mikes Automobiles Dealership\n");
		System.out.println("First thing's first, please fill in the following details so that we can create you profile on our database so that we can make sure you get the commission that you deserve.\n");
		
		Employee employee = new Employee(null, 0, null, 0);
		System.out.print("First name: ");
		employee.name = input();
		System.out.print("How many years experience do you have in selling cars: ");
		employee.experienceYears = inputInt();
		System.out.print("What's your favourite Car Make: ");
		employee.favCarMake = input();
		employee.comm = 0;
		if (employee.experienceYears < 1) {
			employee.comm = 0.10;
		}
		else if(employee.experienceYears < 3) {
			employee.comm = 0.15;
		}
		else if(employee.experienceYears < 5) {
			employee.comm = .20;
		}
		else {
			employee.comm = .30;
		}
		
		System.out.println("\nWelcome onboard "+employee.name+" based on your "+employee.experienceYears+" years experience you will receive "+Math.round(employee.comm*100)+" percent of the value of any car you sell. I'm also glad to hear that your favourite car make is "+employee.favCarMake+" because it could help you seal the deal when your potential customer also likes the same car make.");
		
		System.out.println("\nSo we don't like wasting any time around here because time is money. I need you to get out on the lot and pick any customer out there and simply greet them and get to know them a bit.");
		
		System.out.print("\nYou go out and approach the first potential customer. What do you do?\n\nA) Greet \nB) Pass a Compliment\n\nYour answer then enter: ");
		String a = input();
		if (a.contains("A")) {
			System.out.println("\nYou greet the customer saying: Hi, my name's "+employee.name+". How you doing today?");
		}
		else {
			System.out.println("\nYou pass a compliment while starring at the same car the customer is checking out: Isn't she a beauty?");
		}
		
		Customer cust1 = new Customer(null, null, 0, null, null, 0);
		cust1.likelynessToBuy = cust1.likelynessToBuy + cust1.firstResponse(a);
		
		System.out.print("\nCustomer likelyness to buy at: "+cust1.likelynessToBuy+"0%");
		
/* Ask a series of questions to get customer interests, decide on car to show and get the sale :) remember to try and find out how much they looking to spend and get as much as possible your pocket depends on it. */
	}
	
	public static String input(){ 
		Scanner sc = new Scanner(System.in);
 		String s = sc.nextLine();
		return s;
 	} 
	public static int inputInt(){ 
		Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        return num;
 	} 

}
