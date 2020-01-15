package car_dealership;
import java.util.Scanner; 
class Demo { 
	public static void input(){ 
		String s; 
		Scanner sc = new Scanner(System.in);
 		System.out.println("Enter a string"); 
 		s = sc.nextLine();  
		System.out.println("You entered String "+s);
		sc.close();
 	} 
}