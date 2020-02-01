package sample;

// "extends" keyword makes Car class the child of Machine class.

public class Car01 extends Machine {
	public void startWiper() {
		System.out.println("Starting the wiper.");
	}
	
	// To override the restart method from Machine class,
	// Use the same definition as in Machine class in Car01 class.
	
	// Another way to create an override method is:
	// By clicking on "Source" menu and selecting "Override/Implement Methods..."
	// Choose the desired method and click on "OK".
	public void restart() {
		System.out.println("Car is stopping and starting.");
	}
	
}
