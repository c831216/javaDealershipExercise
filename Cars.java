package car_dealership;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Cars {
	public void create() {
			// selecting cars
			String[] make = {"BMW", "Merc", "VW", "Toyota", "Nissan", "Jeep"};
			
			List<Integer> givenList = Arrays.asList(0, 1, 2, 3, 4, 5);
		    Random rand = new Random();
		    int randomElement = givenList.get(rand.nextInt(givenList.size()));
			
			String a = make[randomElement];
			String tmp = make[randomElement];
			
			while (true) {
				if (a.contains(tmp)) {
					tmp = make[randomElement];
				}
				else {
					break;
				}
			}
			System.out.println("here");
			
			String b = tmp;
			tmp = make[randomElement];
			
			while (true) {
				if(a.contains(tmp)||b.contains(tmp)) {
					tmp = make[randomElement];
				}
				else {
					break;
				}
			}
			String c = tmp;
			
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
	}
}
