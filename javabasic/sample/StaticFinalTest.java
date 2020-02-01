package sample;

//This program is to understand the "static" and "final" keyword.

class Thing {
	
	// Using "final" keyword to define a variable as constant.
	public final static double PI_VALUE = 3.14;
	public String name;
	
	// Static variabled are also known as class variables as it is associated with the class.
	// The variables belong to the class and not the objects.
	
	public static String description;
	public int value;
	public static int svalue;
	public static int count = 0;
	public int id;
	
	// Contructor to count the number of Thing objects created.
	public Thing() {
		id = count; // Adding object count to id variable.
		count++;
	}

	public void setDescription() {
		description = "Description set inside a method.";
	}
	
	public void setSvalue() {
		svalue = 200;
		value = 1000;
	}
	
	// Creating a static method.
	// Cannot include non-static variables in a static method.
	
	public static void showInfo() {
		System.out.println("+++++++++++++++");
		System.out.println(description);
		System.out.println(svalue);
		// Will not work: System.out.println(name);
		// Cannot make reference to non static variables in a static method.
	}
	
	public void showValue() {
		System.out.println(value);
		System.out.println(svalue);
	}
}

public class StaticFinalTest {

	public static void main(String[] args) {
		
		System.out.println("Count before creating objects :" + Thing.count);
		
		Thing.description = "I am the default description";
		System.out.println(Thing.description);
		Thing t1 = new Thing();
		Thing t2 = new Thing();
		t1.setDescription();

		// Value of description variable has changed for class and object t1.

		System.out.println(Thing.description);
		System.out.println(t1.description);
		t1.description = "Setting another value";

		// Value of description variable has changed for class and object t1 and t2.
		System.out.println(Thing.description);
		System.out.println(t1.description);
		System.out.println(t2.description);
		
		System.out.println(Thing.svalue);
		t1.setSvalue();
		System.out.println(Thing.svalue);
		System.out.println(t1.svalue);
		System.out.println(t2.value);
		
		Thing.showInfo();
		t1.showInfo();
		
		System.out.println("------------------");
		t2.value = 1010;
		t1.showValue();
		t2.showValue();
		
		System.out.println("------------------");
		System.out.println(Thing.PI_VALUE);
		
		// Cannot change the value of PI_VALUE variable.
		// Will not work: Thing.PI_VALUE = 1.1;
		
		System.out.println("ID of t1 class --> " + t1.id);
		System.out.println("ID of t2 class --> " + t2.id);
		
		System.out.println("Count after creating objects :" + Thing.count);
		System.gc();
		System.out.println("Count after GC:" + Thing.count);
	}
}
