import java.util.Arrays;

public class Application {

	public static void main(String[] args) {

		System.out.println("*********************************************");
		System.out.println("Location Tests!!!" + "\n");

		Location L = new Location(-3, -3); // tests preferred constructor

		try {
			L.setCoordinates(-1, 0);
		} catch (InvalidCoordinateException e) { // tests the custom exception (X Coordinate)
			System.out.println(e.getMessage());
		}
		try {
			L.setCoordinates(0, -1);
		} catch (InvalidCoordinateException e) { // tests the custom exception (Y Coordinate)
			System.out.println(e.getMessage());
		}
		try {
			L.setCoordinates(0, 0);
		} catch (InvalidCoordinateException e) { // tests the setter
			// no exception is thrown, which means that the setter is doing its job in
			// setting the correct coordinates.
			System.out.println(e.getMessage());
		}
		System.out.print("\n");

		System.out.println(Arrays.toString(L.getCoordinates()) + "\n"); // tests the getter (before the update)

		L.update(3, 3); // tests the update method

		System.out.println(Arrays.toString(L.getCoordinates()) + "\n"); // tests the getter (after the update)

		System.out.println(L.toString()); // tests no-args constructor

		System.out.println("*********************************************");

		System.out.println("BrownBear Tests!!!" + "\n");

		BrownBear BB = new BrownBear(35, L, "Alaskan"); // tests preferred constructor

		try {
			BB.setSubSpecies("Alaska");
		} catch (InvalidSubspeciesException e) { // tests the custom exception
			System.out.println(e.getMessage() + "\n");
		}
		try {
			BB.setSubSpecies("Alaskan");
		} catch (InvalidSubspeciesException e) { // tests the setter
			// no exception is thrown, which means that the setter is doing its job in
			// setting the correct subspecies.
			System.out.println(e.getMessage());
		}

		System.out.println(BB.getSubSpecies() + "\n"); // tests the getter

		System.out.println(BB.toString() + "\n"); // tests the no-args constructor

		System.out.println(BB.location + "\n");
		BB.walk(1);
		System.out.println("The bear walked North" + "\n");
		System.out.println(BB.location + "\n");
		BB.walk(2);
		System.out.println("The bear walked South" + "\n"); // All of these test the walk method
		System.out.println(BB.location + "\n");
		BB.walk(3);
		System.out.println("The bear walked East" + "\n");
		System.out.println(BB.location + "\n");
		BB.walk(4);
		System.out.println("The bear walked West" + "\n");
		System.out.println(BB.location);

		System.out.print("---------------------------------------------" + "\n");

		System.out.println(BB.location + "\n");
		BB.swim(1);
		System.out.println("The bear swam North" + "\n");
		System.out.println(BB.location + "\n");
		BB.swim(2);
		System.out.println("The bear swam South" + "\n"); // All of these test the swim method
		System.out.println(BB.location + "\n");
		BB.swim(3);
		System.out.println("The bear swam East" + "\n");
		System.out.println(BB.location + "\n");
		BB.swim(4);
		System.out.println("The bear swam West" + "\n");
		System.out.println(BB.location);

		System.out.print("---------------------------------------------" + "\n");

		System.out.println("*********************************************");

		System.out.println("Animal Tests!!!" + "\n");

		System.out.println(BB.eat()); // tests the eat method using a different class

		System.out.println(BB.sleep() + "\n"); // tests the sleep method using a different class

		try {
			BB.setSimID(0);
		} catch (InvalidSimIDException e) { // tests the custom exception
			System.out.println(e.getMessage() + "\n");
		}
		try {
			BB.setSimID(35);
		} catch (InvalidSimIDException e) { // tests the setter
			// no exception is thrown, which means that the setter is doing its job in
			// setting the correct SimID.
			System.out.println(e.getMessage());
		}

		System.out.println(BB.getSimID() + "\n"); // tests the getter

		BB.setFull(true); // tests the setter

		System.out.println(BB.getFull() + "\n"); // tests the getter
		
		BB.setLocation(L); // tests the setter

		System.out.println(BB.getLocation() + "\n"); // tests the getter
		
		BB.setRested(false); // tests the setter

		System.out.println(BB.getRested() + "\n"); // tests the getter
		
		System.out.println("*********************************************");

		System.out.println("Goldfinch Tests!!!" + "\n");
		
		Goldfinch GF = new Goldfinch(72, L, 7.3); // tests preferred constructor

		try {
			GF.setWingSpan(4.9);
		} catch (InvalidWingSpanException e) { // tests the custom exception
			System.out.println(e.getMessage() + "\n");
		}
		try {
			GF.setWingSpan(5.0);
		} catch (InvalidWingSpanException e) { // tests the setter
			// no exception is thrown, which means that the setter is doing its job in
			// setting the correct wingspan.
			System.out.println(e.getMessage());
		}

		System.out.println(GF.getWingSpan() + "\n"); // tests the getter

		System.out.println(GF.toString() + "\n"); // tests the no-args constructor

		System.out.println(GF.location + "\n");
		
		GF.walk(1);
		System.out.println("The goldfinch walked North" + "\n");
		System.out.println(GF.location + "\n");
		GF.walk(2);
		System.out.println("The goldfinch walked South" + "\n"); // All of these test the walk method
		System.out.println(GF.location + "\n");
		GF.walk(3);
		System.out.println("The goldfinch walked East" + "\n");
		System.out.println(GF.location + "\n");
		GF.walk(4);
		System.out.println("The goldfinch walked West" + "\n");
		System.out.println(GF.location);
		
		System.out.print("---------------------------------------------" + "\n");
		
		System.out.println(GF.location + "\n");
		GF.fly(L);
		System.out.println("The goldfinch flew to this Location!" + "\n"); // tests the fly method
		System.out.println(GF.location);
		
		System.out.print("*********************************************");
	}
}
