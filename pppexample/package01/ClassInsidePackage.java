package package01;

// This is the main program.
// This example is to test public, protected and private 
// declaration of variables and how these can be accessed.

// Public - Can be accessed from anywhere.
// Protected - Can be accessed anywhere within the package.
// Private - Can be access only within  the class.

public class ClassInsidePackage {

	public static void printGalaxyOutput(Planets p1) {
		System.out.println("******* Galaxy data: *******");
		System.out.println("Galaxy ID: " + p1.gid);
		System.out.println("Galaxy Name: " + p1.gname);
		System.out.println("Galaxy Location: " + p1.glocation);

		// Getting information of the "private" variable
		// in the class using a protected method.

		System.out.println("Galaxy Area: " + p1.printGalaxyArea());
		System.out.println("Star ID: " + p1.printStarID());
		System.out.println("Star Name: " + p1.sname);
		System.out.println("Planet ID: " + p1.printPlanetID());
		System.out.println("Planet Name: " + p1.pname);
	}
	
	public static void printCommetsOutput (Commets c1) {
		System.out.println("******* Commet data: *******");
		System.out.println("Commet ID: " + c1.printCommetsID());
		System.out.println("Commet Name: " + c1.cname);
		System.out.println("Commet Speed: " + c1.printCommetsSpeed());
	}

	public static void main(String[] args) {
		int i = 0;
		System.out.printf("%-2d +++++++++++++++++++\n", ++i);
		Planets p1 = new Planets("Milky Way", "Honduras", "Sun", "Earth", 456.915);
		System.out.printf("%-2d +++++++++++++++++++\n", ++i);
		Planets p2 = new Planets("Andromeda", "Chonduras", "XY20192", "XY20192_101", 32981.915);
		System.out.printf("%-2d +++++++++++++++++++\n", ++i);
		printGalaxyOutput(p1);
		// Galaxy g1 = new Galaxy();
		System.out.printf("%-2d +++++++++++++++++++\n", ++i);
		printGalaxyOutput(p2);
		// This will not call any constructor as it is not initialized.
		System.out.printf("%-2d +++++++++++++++++++\n", ++i);
		Commets c1 = new Commets("Haleys", 450.32);
		printCommetsOutput(c1);
		Commets c2 = new Commets("Baileys", 8215.32);
		printCommetsOutput(c2);
		System.gc();
	}

}
