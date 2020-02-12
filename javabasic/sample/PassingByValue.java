package sample;

// Passing values between methods.
// In Java there is no passing by reference.

class Person001 {
	private String name;

	public Person001(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
}

public class PassingByValue {

	public void show(Person001 person) {
		
		// Will print Bob because that is the value passed from main().
		// The address of the object from main is passed to the object 
		// created in the show() method.
		
		System.out.println("2: Person name is: " + person);
		
		// Will print John because the value of the main object is set to John.
		// -- To play further, move the below line of code under 
		// object which is newly created (i.e. after line 48).
		
		person.setName("John");
		System.out.println("3: Person name is: " + person);
		
		// New object create with name person. 
		person = new Person001("Mike");
		
		// Will print Mike as value from the new object.
		System.out.println("4: Person name is: " + person);
		
		// Will print James as value of the new object is set to James.
		person.setName("James");
		System.out.println("5: Person name is: " + person);
		
		// Created another object with name person. 
		person = new Person001("Pope");
		System.out.println("6: Person name is: " + person);
	}

	public static void main(String[] args) {
		Person001 person = new Person001("Bob"); 
		PassingByValue app = new PassingByValue();
		
		System.out.println("1: Person name is: " + person);
		
		app.show(person);
		
		// Will print "John" as it was set in the show() method.
		System.out.println("7: Person name is: " + person);
	}

}
