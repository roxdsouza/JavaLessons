package sample;

// Program to test the equals method.
// You can use the equals method of the Object class or the equals 
// method of the String or other non primitive class or can override 
// the equals method in the class whose object is being created.

class Personnel {
	private int id;
	private String name;

	public Personnel(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		System.out.println("Inside toString() method.");
		return "Person [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		System.out.println("Inside hash code");
		final int prime = 31;
		int result = 1;
		int result1 = 0;
		result = prime * result + id;
		System.out.println(result);
		result1 = prime * result + name.hashCode();
		System.out.println(result1);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		System.out.println(result);
		System.out.println(name.hashCode());
		return result;
	}

	// Right click, select "Source" and select "Generate hashCode() and equals()"
	// This will create the equals method below.

	// If this method is not present then the program will call the
	// equals method from the Object class.

	@Override
	public boolean equals(Object obj) {
		System.out.println("--> Person [id=" + id + ", name=" + name + "]");
		if (this == obj)
			return true;
		System.out.println("A"); // Included to find which code is getting executed.
		if (obj == null)
			return false;
		System.out.println("B");
		if (getClass() != obj.getClass())
			return false;
		System.out.println("C");
		Personnel other = (Personnel) obj;
		if (id != other.id)
			return false;
		System.out.println("D");
		if (name == null) {
			if (other.name != null)
				System.out.println("E");
			return false;
		} else if (!name.equals(other.name))
			return false;
		System.out.println("F");
		return true;
	}

}

public class EqualsMethod {

	public static void main(String[] args) {
		Personnel p1 = new Personnel(2, "John");
		Personnel p2 = new Personnel(2, "John");

		System.out.print("Is object p1 = p2? ");
		System.out.println(p1 == p2);
		System.out.println("-----------------------------");

		// Try the below statement by commenting the equals method
		// mentioned in the Personnel class above. The output will be "false" as
		// it calls the equals method from the Object class by default.

		// Hence you need to override the Object.equals() method
		// as seen in the Personnel class above.
		System.out.println("Checking again with eguals method - " + p1.equals(p2));
		System.out.println("-----------------------------");

		p1 = p2;
		System.out.print("Is object p1 = p2? ");
		System.out.println(p1 == p2);
		System.out.println("-----------------------------");
		System.out.println("Checking again with eguals method - " + p1.equals(p2));
		System.out.println("-----------------------------");

		p2 = new Personnel(4, "Michael");
		System.out.print("Is object p1 = p2? ");
		System.out.println(p1 == p2);
		System.out.println("-----------------------------");
		System.out.println("Checking again with eguals method - " + p1.equals(p2));
		System.out.println("-------------DOUBLE----------------");

		Double v1 = 7.2;
		Double v2 = 7.2;

		System.out.println(v1 == v2);
		System.out.println(v1.equals(v2));
		System.out.println("-------------INTEGER---------------");

		Integer n1 = 6;
		Integer n2 = 6;
		System.out.println(n1 == n2);
		System.out.println(n1.equals(n2));
		System.out.println("--------------STRING--------------");

		String t1 = "Hello";
		String t2 = "Hello";
		String t3 = new String("Hello");
		String t4 = "Helloabskj".substring(0, 5);

		System.out.println("Compare t1 with t2: " + t1 == t2);
		System.out.println("Compare t1 with t2: " + t1.equals(t2));
		System.out.println("Compare t1 with t3: " + t1 == t3);
		System.out.println("Compare t1 with t3: " + t1.equals(t3));
		System.out.println("t4 = " + t4);
		System.out.println("Compare t1 with t4: " + t1 == t4);
		System.out.println("Compare t1 with t4: " + t1.equals(t4));

		System.out.println("------------HASH CODE-----------------");
		System.out.println(new Object());
		Object obj1 = new Object();
		System.out.println(obj1.hashCode());
		System.out.println(p2.hashCode());
	}
}