package sample;

// Understanding string formatting
// Using the toString method
// More information on toString method - 
// https://www.javatpoint.com/understanding-toString()-method

class FormatterText {
	String name;
	String value;
	int number;
	
	public FormatterText(String name, String value, int number) {
		this.name = name;
		this.value = value;
		this.number = number;
	}

	// toString method is automatically invoked by java for the object.
	public String toString() {
		System.out.println("Using the toString method");
		StringBuilder sb = new StringBuilder();
		sb.append(name)
		.append(" - ")
		.append(value)
		.append(number)
		.append(" times!");
		return sb.toString();
	}
	
	public String toPrint() {
		//System.out.println("Testing!!!");
		return "Using the print method!!!";
	}
}

class FormatterText01 {
	String name;
	String value;
	int number;
	
	public FormatterText01() {
		this.name = "Mahendra Singh Dhoni";
		this.value = "Rubbish value";
		this.number = 47;
	}
}

public class StringFormatter {

	public static void main(String[] args) {

		// ineffecient code as info is creating and updating the string in every
		// statement.
		String info = "My name is Bob.";
		info += " ";
		info += "I am a builder.";

		System.out.println(info);

		// More efficient code.
		StringBuilder sb = new StringBuilder("");

		sb.append("My name is Rocky boy.");
		sb.append(" ");
		sb.append("I am a dangerous man!");

		System.out.println(sb.toString());

		System.out.println("*********************");

		StringBuilder sb1 = new StringBuilder("");

		sb1.append("My name is Roger.").append(" ").append("I am a skydiver!");
		System.out.println(sb1.toString());

		System.out.println("*********************");

		for (int i = 1; i < 5; i++) {
			// Print digits with 5 spaces and right align.
			System.out.printf("%5d: %s \n ", i, "The digit is right aligned!");

			// Print digits with 5 spaces and left align.
			System.out.printf("%-5d: %s \n", i, "The digit is left aligned!");
		}

		System.out.println("*********************");
		FormatterText01 ft1 = new FormatterText01();
		System.out.println("Printing value of object ft1: ");
		System.out.println("Prints package name.classname@hash_value : " + ft1);
		System.out.println("This is because toString() function is not used.");
		
		System.out.println("*********************");
		
		FormatterText ft2 = new FormatterText("Sachin", " Your mama is going to wack your ass ", 100);
		
		// Following statement will automatically invoke the toString method.
		System.out.println("Printing value of object ft2: (Automatically calls the toString method)");
		System.out.println(ft2);
		System.out.println(ft2.toPrint());
	}

}
