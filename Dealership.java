package car_dealership;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Dealership {

	public static void main(String[] args) {
		Employee employee = welcome();
		while(true) {
			if(startToFinish(employee)==1) {
				employee.salary = employee.salary + employee.comm;
				continue;
			}
			else {
				System.out.println("That's it I'm out of here, see ya");
				System.out.println("Salary R"+Math.round(employee.salary));
				System.exit(0);
			}
		}
	}
	
	private static int startToFinish(Employee employee) {
//		Employee employee = welcome();
		Customer cust1 = goMeetCustomer();
		greetOrCompliment(employee, cust1);
		likeliness(cust1);
		greetNameBudget(employee,cust1);
		askQuestionsOrShowCar(cust1);
		likeliness(cust1);
		
//		offer to take a test drive this increases likeliness
		cust1.likelinessToBuy += testDrive(cust1.favCarMake);
		likeliness(cust1);
		
//		build some rapport, lil chit chat increases likeliness
		cust1.likelinessToBuy += buildRapport();
		likeliness(cust1);
		
//		if likeliness is higher than 60 then we can close the deal
		employee.salary = employee.salary + goForClose(cust1.likelinessToBuy, employee.comm, cust1.budget);
		System.out.println("\n\n\n\n\n\n\n***SALARY***"+employee.salary);
		if(keepSellingOrGoHome()==1) {
			return 1;
		}
		else {
			return 0;
		}
//		show the money you made and 
		
		
//		give option of selling to another customer or ending the day then we create new cust where you ask for the name and that's used to create the new customer :)
		
	}
	private static double goForClose(int likelinessToBuy, double comm, int budget) {
		System.out.println("You: So, are you ready to take her home?");
		if(likelinessToBuy < 6) {
			System.out.println("Customer: You know what, it was a great drive but I'm not quite sure that this is exactly what I'm looking for. Thanks for your time.");
//			keepSellingOrGoHome();
			return 0;
		}
		else if(likelinessToBuy >= 6) {
			System.out.println("Customer: I'd love to take her home. Lets get all the paperwork signed");
			System.out.println(comm);
			comm = budget * comm;
			double a = comm;
			System.out.println("Welldone!! You currently have: R"+a);
//			keepSellingOrGoHome();
			return a;
		}
		return 0;
	}
	private static int keepSellingOrGoHome() {
		System.out.println("\n***What would you like to do?***\n");
		System.out.println("\n***Choose an action***\n");
		System.out.println("A) Try selling to another customer");
		System.out.println("B) Go home");
		int a = abc();	
		if(a==0) {
			return 1;
		}
		else {
			return 0;
		}
	}
	public static String input(){ 
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
 		String s = sc.nextLine();
		return s;
 	} 
	public static int inputInt(){ 
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        return num;
 	} 
	public static String[] createCar(String cusfav) {
		// selecting cars
//		System.out.println(cusfav);
		String[] make = {"BMW", "Merc", "VW", "Toyota", "Nissan", "Jeep"};
		
		List<Integer> givenList = Arrays.asList(0, 1, 2, 3, 4, 5);
	    Random rand = new Random();
	    int randomElement = givenList.get(rand.nextInt(givenList.size()));

		String a = cusfav;
		
		randomElement = givenList.get(rand.nextInt(givenList.size()));
		String b = make[randomElement];
		randomElement = givenList.get(rand.nextInt(givenList.size()));
//		String tmp = make[randomElement];
		
		
		while (true) {
			if (a.contains(b)) {
				randomElement = givenList.get(rand.nextInt(givenList.size()));
				b = make[randomElement];
			}
			else {
				break;
			}
		}
//		System.out.println("here");
		
		
		randomElement = givenList.get(rand.nextInt(givenList.size()));
		String c = make[randomElement];
		
		
		while (true) {
			if(a.contains(c)||b.contains(c)) {
				randomElement = givenList.get(rand.nextInt(givenList.size()));
				c = make[randomElement];
			}
			else {
				break;
			}
		}
		
		String[] listReturn = {a,b,c};
		return listReturn;
}
	public static int abc() {
		int r;
		while(true) {
			String option = input();
			if(option.contains("A")||option.contains("a")) {
				r = 0;
				break;
			}
			else if(option.contains("B")||option.contains("b")) {
				r = 1;
				break;
			}
			else if(option.contains("C")||option.contains("c")) {
				r = 2;
				break;
			}
			else {
				System.out.print("please try again: ");
			}
		}
		return r;
	}
	public static void likeliness(Customer x) {
	System.out.print("\n*** Customer likeliness to buy at: "+x.likelinessToBuy+"0% ***\n\n");
	}
	public static void askQuestionsOrShowCar(Customer x) {
		int a = abc();
		if(a == 0) {
			System.out.println("You: What's your favourite car make?");
			System.out.println("Customer: "+x.favCarMake);
			System.out.println("You: Favourite colour?");
			System.out.println("Customer: "+x.favColour);
			System.out.println("You: Do you prefer manual or automatic?");
			System.out.println("Customer: "+x.driveTrain);
			x.likelinessToBuy = x.likelinessToBuy + 1;
			
			System.out.println("\nI can show you the following:");
			String[] carList = createCar(x.favCarMake);
			String[] abcList = {"A","B","C"};
			for(int i = 0; i < 3; i++) {System.out.println(abcList[i]+") "+carList[i]);}
			
			System.out.print("\nFrom the list above. Which car would you like to show the customer: ");

/* INCREASE likeliness */
			a = abc();
			if(a==0) {
				x.likelinessToBuy = x.likelinessToBuy + 1;
				System.out.println(carList[a]);
			}
			else{System.out.println(carList[a]);
//			cust1.likelinessToBuy = cust1.likelinessToBuy + 1;
			}
		}
		
		else if(a == 1) {
			System.out.println("\nI can show you the following:");
			String[] carList = createCar(x.favCarMake);
			String[] abcList = {"A","B","C"};
			for(int i = 0; i < 3; i++) {System.out.println(abcList[i]+") "+carList[i]);}
			System.out.print("\nFrom the list above. Which car would you like to show the customer: ");
//			a = abc();
			if(a==0) {
				x.likelinessToBuy = x.likelinessToBuy + 1;
				System.out.println(carList[a]);
			}
			else{System.out.println(carList[a]);
//			cust1.likelinessToBuy = cust1.likelinessToBuy + 1;
			}
		}
	}
	public static void greetNameBudget(Employee x, Customer y) {
		System.out.print("You: ");
//		employee.greet(); 
		x.askName();
		System.out.print("Customer: ");
		
//		cust1.budget = cust1.cash();
		String cash = NumberFormat.getNumberInstance(Locale.US).format(y.budget);
//		System.out.println("My name is "+cust.name+" and I have R"+cash+" cash.");
		
		y.myName();
		System.out.print("You: So "+y.name+", what's your budget?\nCustomer: I have R"+cash+" cash what can you show me in that range?");
		
		System.out.println("\n\nHere's your opportunity now :) Choose wisely:\n");
		System.out.println("A) Ask a few questions \nB) Show a car in price range and get the sale\n");
	}
	public static void greetOrCompliment(Employee x, Customer y) {
		System.out.print("\nYou go out and approach the first potential customer. What do you do?\n\nA) Greet \nB) Pass a Compliment\n\nYour answer then enter: ");
		int a = abc();
		
		if (a == 0) {
			System.out.println("\nYou: Hi, my name's "+x.name+". How you doing today?");
		}
		else if(a == 1) {
			System.out.println("\nYou: Isn't she a beauty?");
			y.likelinessToBuy = y.likelinessToBuy + y.firstResponse(a);
		}

		if(y.favCarMake.contains(x.favCarMake)) {
/* INCREASE likeliness */			
			y.likelinessToBuy = y.likelinessToBuy + 1;
			System.out.println("\n*** Looks like you two have something in common :) ***\n");
		}
	}
	public static Customer goMeetCustomer() {
System.out.println("\nSo we don't like wasting any time around here because time is money. I need you to get out on the lot and pick any customer out there and simply greet them and get to know them a bit.");
		
		Customer cust1 = new Customer(null, 0, null, null, 0, null);
		cust1.favCarMake = cust1.favCarMake();
		cust1.name = cust1.name();
		cust1.budget = cust1.cash();
		cust1.favColour = cust1.favColour();
		cust1.driveTrain = cust1.drivetrain();
		return cust1;
	}
	public static Employee welcome() {
		System.out.println("Welcome to your first day at Mikes Automobiles Dealership\n");
		System.out.println("First thing's first, please fill in the following details so that we can create you profile on our database so that we can make sure you get the commission that you deserve.\n");
		
		Employee employee = new Employee(null, 0, null, 0,0);
		System.out.print("First name: ");
		employee.name = input();
		System.out.print("How many years experience do you have in selling cars: ");
		employee.experienceYears = inputInt();
		System.out.print("What's your favourite Car Make: ");
		employee.favCarMake = input();
		employee.comm = 0.0;
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
		System.out.println("\n\n\n\n\n\n****"+employee.comm);
			
		System.out.println("\nWelcome onboard "+employee.name+" based on your "+employee.experienceYears+" years experience you will receive "+Math.round(employee.comm*100)+" percent of the value of any car you sell. I'm also glad to hear that your favourite car make is "+employee.favCarMake+" because it could help you seal the deal when your potential customer also likes the same car make.");
		return employee;
	}
	public static int testDrive(String a) {
		System.out.println("You: So would you like to take the "+a+" for a test drive?");
		System.out.println("Customer: Sure lets get a feel for how she drives :)");
		System.out.println("\n***Choose an action***\n");
		System.out.println("A) Ask if the customer is happy with the drive?");
		System.out.println("B) Ask the customer if they married and have kids?");
		System.out.println("C) Do nothing and allow the customer to enjoy the drive");
		int x = abc();
		if(x==0) {
			System.out.println("Customer: I just started driving, can you give me some time?");
			return -1;
		}
		else if(x==1) {
			System.out.println("Customer: I'm very happily married with three beautiful daughters. They actually the reason why I'm out here looking for a new car.");
			return 2;
		}
		else if(x==2) {
			return 1;
		}
		return 0;
	}
	public static int buildRapport() {
		System.out.println("\n***Choose an action***\n");
		System.out.println("A) Ask what kind of work the customer does?");
		System.out.println("B) Ask what they like to do for fun?");
		System.out.println("C) Do nothing");
		int x = abc();
		if(x==0) {
			System.out.println("Customer: I have the most stressful job on the planet. Really don't want to ruin the ride by thinking of that now.");
			return -1;
		}
		else if(x==1) {
			System.out.println("Customer: I absolutely love coding. So I'll work on coding projects in my spare time. Thanks for asking :)");
			return 2;
		}
		else if(x==2) {
			return 1;
		}
		return 0;
	}
}
