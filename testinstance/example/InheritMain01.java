package example;

// Example to test inheritance in Java

public class InheritMain01 {

	public static void main(String[] args) {
		Machine mac1 = new Machine();
		mac1.start();
		
		// Calls the constructor in Car01 class
		Car01 c1 = new Car01("Maruti");
		c1.startWiper();

		InfoInterface info1 = new Machine();
		// info1 can access only showInfo() and restart() methods from Machine class - showInfo()
		info1.showInfo();
		info1.restart();
		System.out.println(info1.getClass());	// getClass method gets the class name
		
		InfoInterface info2 = c1;
		info2.showInfo();
		info2.restart();
		
		outputInfo(mac1);
		outputInfo(c1);
		
		Person p1 = new Person("Bobby");
		p1.greet();

		// Will not work >> outputInfo(p1);
		// This is because Person class has not implemented InfoInterface interface.
	}
	
	private static void outputInfo(InfoInterface info3) {
		info3.showInfo();
		info3.restart();
	}
}
