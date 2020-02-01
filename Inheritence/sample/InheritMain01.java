package sample;

// Example to test inheritance in Java

public class InheritMain01 {

	public static void main(String[] args) {
		System.out.println("Printing values of Machine class.");
		Machine mac1 = new Machine();
		mac1.start();
		mac1.stop();
		mac1.restart();

		Car01 c1 = new Car01();
		System.out.println("Printing values of Car class.");

		// Object c1 inherits the start methods of Machine class.
		c1.start();
		// Object c1 directly runs the startWiper in Car01 class.
		c1.startWiper();
		c1.stop();
		// Method restart exists in Machine and Car01 class.
		// Method restart is overridden in Car01 class.
		c1.restart();

	}

}
