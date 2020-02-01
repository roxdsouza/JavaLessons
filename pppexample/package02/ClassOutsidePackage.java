package package02;

import package01.ClassInsidePackage;

// This file will test if we are able to access variables defined
// inside package01. We should be able to access all "public" variables
// from inside package01.

// Press Ctrl = Shift + O to include / import missing packages within
// the program.

import package01.Planets;

public class ClassOutsidePackage {
	
	public static void printGalaxyOutput(Planets p1) {
		System.out.println("******* Planet data: *******");
		// Will not print the following line. Remove comment to check.
		// Undeclared variable and will be accessible only within package01.
		// System.out.println("Galaxy ID: " + p1.gid);
		
		System.out.println("Galaxy Name: " + p1.gname);
		
		// Will not print the following line. Remove comment to check.
		// protected variable and will be accessible only within package01.
		// System.out.println("Galaxy Location: " + p1.glocation);
		
		// Will not print the following line. Remove comment to check.
		// protected method and will be accessible only within package01.
		//System.out.println("Galaxy Area: " + p1.printGalaxyArea());
		System.out.println("Star ID: " + p1.printStarID());
		
		// Will not print the following line. Remove comment to check.
		// protected variable and will be accessible only within package01.
		// System.out.println("Star Name: " + p1.sname);
		
		System.out.println("Planet ID: " + p1.printPlanetID());
		
		// Will not print the following line. Remove comment to check.
		// protected variable and will be accessible only within package01.
		// System.out.println("Planet Name: " + p1.pname);
	}

	public static void main(String[] args) {
		int i = 0;
		System.out.printf("%-2d +++++++++++++++++++\n", ++i);
		Planets p1 = new Planets("Milky Way", "Honduras", "Sun", "Earth", 456.915);
		System.out.printf("%-2d +++++++++++++++++++\n", ++i);
		Planets p2 = new Planets("Andromeda", "Chonduras", "XY20192", "XY20192_101", 32981.915);
		System.out.printf("%-2d +++++++++++++++++++\n", ++i);
		// Can use the following to access printGalaxyOutput 
		// and print successfully. Uncomment the below line to check.
		
		// ClassInsidePackage.printGalaxyOutput(p1);
		
		// The following local method can only be used to print 
		// variables declared as 'public' in package01.
		System.out.println("USING LOCAL METHOD");
		printGalaxyOutput(p1);
		// Galaxy g1 = new Galaxy();
		System.out.printf("%-2d +++++++++++++++++++\n", ++i);
		
		// Following refers to method from package01 
		// and it displays all the values.
		System.out.println("USING METHOD FROM PACKAGE01");
		ClassInsidePackage.printGalaxyOutput(p2);
		// This will not call any constructor as it is not initialized.
		System.out.printf("%-2d +++++++++++++++++++\n", ++i);
		System.gc();
	}
}
