package example;

// "implements" keyword is used to implement the interface with the class.
// A class can have multiple interfaces separated by commas.
// A class can only have one inheritance.

public class Car01 implements InfoInterface {

	private String name;

	public Car01(String name) {
		this.name = name;
	}

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

	public void showInfo() {
		System.out.println("Car name is : " + name);
	}
}
