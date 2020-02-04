package abstractPackage;

public class Car01 extends Machine {

	private String name;
	
	// Cannot make an object of an abstract class.
	// The following will not work.
	
	// Machine m1 = new Machine();

	public Car01(String name) {
		this.name = name;
	}

	public void startWiper() {
		System.out.println("Starting the wiper.");
	}

	public void restart() {
		System.out.println("Car is stopping and starting.");
	}

	public void showInfo() {
		System.out.println("Car name is : " + name);
		
		// Calls the run method within machine class.
		run();
		getInfo(15);
	}

}
