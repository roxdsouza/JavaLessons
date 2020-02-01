package sample;

//This program will test the basics of methods, setters, getters and "this" keyword.

class Person {

	// Need to use the set methods to set the values for the variables.
	// Else, you can provide the values while creating the variables.
	// There cannot be ny code inside the class.

	// The following are called "Instance variable".
	String name = "Dwyane Johnson";
	int age;
	double weight;
	double height;
	String address;

	// Setters: Using the set method to set the value of the variable.

	public void setAge(int age) {
		// this.age refers to the age variable which is set at the class level.
		// "this" keyword is used when two variables have the same name.
		this.age = age;
	}

	public void setWeight(double weight) {
		// weight is a local variable.
		// Local variable is providing value to instance variable.
		this.weight = weight;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	// Getters: Using the get method to give out value of the variable.

	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		// this.age refers to the age variable which is set at the class level.
		// "this" keyword is used when two variables have the same name.
		return this.age;
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	public double getHeight() {
		return height;		// Ignoring this keyword as it is referring to the variable within the class.
	}

	public String getAddress() {
		return address;
	}
}

public class MethodTest01 {

	public static void main(String[] args) {

		Person p1 = new Person();
		p1.name = "Thomas Edison";

		Person p2 = new Person();

		p1.setAge(32);
		p1.setWeight(65);
		p1.setHeight(5.5);
		p1.setAddress("Lokhandwala Complex, Mumbai, India");

		p2.setAge(45);
		p2.setWeight(86.3);
		p2.setHeight(6.3);
		p2.setAddress("Block 415, Bedok North, Singapore - 460415");

		System.out.printf("Name: %s \n", p1.getName());
		System.out.printf("Age: %d (years) \n", p1.getAge());
		System.out.printf("Weight : %.2f (Kgs) \n", p1.getWeight());
		System.out.printf("Height : %.2f (Feet) \n", p1.getHeight());
		System.out.printf("Address: %s \n", p1.getAddress());
		System.out.println("-----------------------");

		// This will print "Dwyane Johnson".
		System.out.printf("Name: %s \n", p2.getName());
		System.out.printf("Age: %d (years) \n", p2.getAge());
		System.out.printf("Weight : %.2f (Kgs) \n", p2.getWeight());
		System.out.printf("Height : %.2f (Feet) \n", p2.getHeight());
		System.out.printf("Address: %s \n", p2.getAddress());
		System.out.println("-----------------------");
	}
}
