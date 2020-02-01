package sample;

public class StringTest {

	public static void main(String[] args) {
		// Working with String and String arrays (single and multi-dimensional array)
		// Includes for loop example
		
		String[] fruits = { "Apple", "Mango", "Chickoo", "Tommato", "Banana" };

		for (String fruit : fruits) {	// Use of for loop using String
			System.out.println(fruit);
		}

		String[] words = new String[4]; // All strings have value of null 

		words[0] = "Lovely"; // Space and value allocated to string
		words[1] = "day";
		words[2] = "today";

		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}

		// Concatenate strings
		System.out.println(words[0] + ' ' + words[1] + ' ' + words[2]);
		System.out.println(words[3]); // Will print null as nothing is allocated to the string
		
		// Multi-dimensional array
		
		String[][] data = new String[2][3];
		data[0][1] = "Hello";
		data[1][2] = "World";
		
		System.out.println(data[0][1] + " " + data[1][2]);
		
		// Print all values of the two dimensional array

		System.out.println("Print the two dimentional data:");
		for (int row = 0; row < data.length; row++) {
			for (int col=0; col < data[row].length; col++) {
				System.out.print(data[row][col] + "\t");	// Prints values on the same line.
			}
			System.out.println(); 	// Print a new line.
		}
		
		// Array without dimension
		
		System.out.println("Printing values of an array :");
		String[][] info = new String[2][];	// Creating an array without the column dimension
		System.out.println(info[0]);
		info[0] = new String[5];	// Assigning the column dimension
		info[1] = new String[3];
		
		info[0][2] = "Hi There!";
		for (int row = 0; row < info.length; row++) {
			for (int col=0; col < info[row].length; col++) {
				System.out.print(info[row][col] + "\t");	// Prints values on the same line.
			}
			System.out.println(); 	// Print a new line.
		}
		
	}

}