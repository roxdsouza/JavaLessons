package abstractPackage;

// Data abstraction is the process of hiding certain details and showing only
// essential information to the user. Abstraction can be achieved 
// with either abstract classes or interfaces.

// Abstract class: is a restricted class that cannot be used to create objects 
// (to access it, it must be inherited from another class).

// Abstract method: can only be used in an abstract class, and it does not have 
// a body. The body is provided by the subclass (inherited from). An abstract 
// class can have both abstract and regular methods.

public class AbstractMain01 {

	public static void main(String[] args) {		
		// The following will not work.
		// Machine m1 = new Machine();
		
		Car01 c1 = new Car01("BMW");
		c1.showInfo();
		
		System.out.println("+++++++++++++++++++++++");
		
		TableFan01 tf1 = new TableFan01();
		tf1.showInfo();
		
		System.out.println("+++++++++++++++++++++++");
	}

}
