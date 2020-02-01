package sample;

//This program will test the constructor method and "this" keyword.

class People {

	// Need to use the set methods to set the values for the variables.
	// Else, you can provide the values while creating the variables.
	// There cannot be ny code inside the class.

	// The following are called "Instance variable".
	String name;
	int age;
	double weight;
	double height;
	String address;

	// Using constructors.
	// Constructors should have the same name as the class name.
	// Constructors will be called by default whenever a new object of the class is created.
	// Constructors can have multiple parameters.
	// Constructors don't need to mention any return parameters like void, int, etc.
	// One constructor can call another constructor on its 
	// first line by passing a different set of parameters. 

	// Default constructor
	public People() {
		System.out.println("Default constructor setting default values.");
		this.name = "Rocky Bhai";
		this.age = 42;
		this.weight = 78.0;
		this.height = 5.4;
		this.address = "Bhandup West, Mumbai";
	}

	// Constructor with one argument
	public People(String name) {
		System.out.println("Constructor with one argument: Name");
		this.name = name;
	}

	// Constructor with three arguments
	public People(String name, int age, double height) {
		// Will call the default constructor - People()
		// Calling another constructor should always be done on the first line.
		this();

		System.out.println("Constructor with three arguments: Name, age and height");
		this.name = name;
		this.age = age;
		this.height = height;
	}

	// Constructor with two arguments
	public People(double weight, String address) {
		// Calling another constructor with three arguments.
		this("Sachin Tendulkar", 36, 5.7);
		this.weight = weight;
		this.address = address;
	}

	// Setters: Using the set method to set the value of the variable.

	public void setName(String name) {
		this.name = name;
	}

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
		return height; // Ignoring this keyword as it is referring to the variable within the class.
	}

	public String getAddress() {
		return address;
	}
}

public class ConstructorMethod01 {

	public static void main(String[] args) {

		// This will invoke the default constructor.
		People p1 = new People();
		p1.name = "Thomas Edison";
		p1.setAge(32);
		p1.setWeight(65);
		p1.setHeight(5.5);
		p1.setAddress("Lokhandwala Complex, Mumbai, India");

		System.out.printf("Name: %s \n", p1.getName());
		System.out.printf("Age: %d (years) \n", p1.getAge());
		System.out.printf("Weight : %.2f (Kgs) \n", p1.getWeight());
		System.out.printf("Height : %.2f (Feet) \n", p1.getHeight());
		System.out.printf("Address: %s \n", p1.getAddress());
		System.out.println("-----------------------");

		// This will invoke the constructor with one argument.
		People p2 = new People("Dwyane Johnson");
		p2.setAge(45);
		p2.setWeight(86.3);
		p2.setHeight(6.3);
		p2.setAddress("Block 415, Bedok North, Singapore - 460415");

		// This will print "Dwyane Johnson".
		System.out.printf("Name: %s \n", p2.getName());
		System.out.printf("Age: %d (years) \n", p2.getAge());
		System.out.printf("Weight : %.2f (Kgs) \n", p2.getWeight());
		System.out.printf("Height : %.2f (Feet) \n", p2.getHeight());
		System.out.printf("Address: %s \n", p2.getAddress());
		System.out.println("-----------------------");

		// This will invoke the default constructor.
		People p3 = new People();
		// This will print default values set by the constructor.
		System.out.printf("Name: %s \n", p3.getName());
		System.out.printf("Age: %d (years) \n", p3.getAge());
		System.out.printf("Weight : %.2f (Kgs) \n", p3.getWeight());
		System.out.printf("Height : %.2f (Feet) \n", p3.getHeight());
		System.out.printf("Address: %s \n", p3.getAddress());
		System.out.println("-----------------------");

		// This will invoke the constructor with 3 arguments
		// but will set the remaining values as default
		// by calling the default constructor.

		People p4 = new People("Scarlett Johansson", 23, 5.1);
		System.out.printf("Name: %s \n", p4.getName());
		System.out.printf("Age: %d (years) \n", p4.getAge());
		System.out.printf("Weight : %.2f (Kgs)", p4.getWeight());
		System.out.printf(" ---> Default value \n");
		System.out.printf("Height : %.2f (Feet) \n", p4.getHeight());
		System.out.printf("Address: %s ", p4.getAddress());
		System.out.printf(" ---> Default value \n");
		System.out.println("-----------------------");

		People p5 = new People(62.5, "Los Angeles, United States of America.");
		System.out.printf("Name: %s ", p5.getName());
		System.out.printf(" ---> Value set by another constructor \n");
		System.out.printf("Age: %d (years) ", p5.getAge());
		System.out.printf(" ---> Value set by another constructor \n");
		System.out.printf("Weight : %.2f (Kgs) \n", p5.getWeight());
		System.out.printf("Height : %.2f (Feet) ", p5.getHeight());
		System.out.printf(" ---> Value set by another constructor \n");
		System.out.printf("Address: %s \n", p5.getAddress());
		System.out.println("-----------------------");
	}
}
