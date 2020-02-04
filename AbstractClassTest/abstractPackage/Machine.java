package abstractPackage;
 
// Machine is an abstract (parent) class.
// It can have abstract as well as non-abstract methods. 

// DIFFERENCE BETWEEN ABSTRACT CLASS AND AN INTERFACE

// 1. An abstract class can have code inside it but an interface cannot 
// have code inside it. 
// 2. A class can have only one parent class whereas 
// a class can implement multiple interfaces.


public abstract class Machine {

	private int id = 7;

	public void start() {
		System.out.println("Machine started.");
	}

	public void stop() {
		System.out.println("Machine stopped.");
	}

	// Abstract methods can only be defined in an abstract class.
	// Abstract methods cannot have a body.
	// But have to be implemented in ALL the child classes (Car01 and TableFan01).
	
	public abstract void restart();
	public abstract void showInfo();
	
	public void getInfo(int value) {
		id = id + value;
		System.out.println("The value of ID: " + id);
	}
	
	public void run() {
		System.out.println("Inside run method");
		
		// Calls the start method inside Machine class.
		start();
		
		// The following statement will go into an infinite loop.
		//showInfo();
		
		// Will call the restart method of the child class (Car01 and TableFan01).
		restart();
		this.restart();
		Machine.this.restart();
	}
}
