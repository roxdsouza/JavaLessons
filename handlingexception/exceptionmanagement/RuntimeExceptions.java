package exceptionmanagement;

//Course from "Udemy" - John - Java tutorials for complete beginners
//Github - https://github.com/caveofprogramming/java-beginners.git

// Types of exceptions - Checked and unchecked exceptions.
// Checked exceptions - specific exception for which code is written to 
// take the necessary action once the exception is encountered.
// Unchecked exception can be any exception which are not forced to be handled.
// Example could be divide by 0. The code will compile but exception will
// be thrown during execution and the program will not be able to recover
// or end gracefully.

public class RuntimeExceptions {

	public static void exception1() {
		// Example 1 of unchecked exception
		int value = 7;

		// The following code will thrown an exception during run time.
		// Such exceptions cannot be caught using try/catch.
		try {
			value = value / 0;
		} catch (RuntimeException e) {
			System.out.println("An idiot is watching this program.");
			System.out.println(e.getMessage());
		}

	}

	public static void exception2() {
		// Example 2 of unchecked exception

		// The following code will thrown an exception during run time.
		// Because we are referring to the fourth element which does not exist.
		try {
			String[] texts = { "one", "two", "three" };
			System.out.println(texts[3]);
		} catch (Exception e) {
			System.out.println("An idiot is watching this program.");
			System.out.println(e.getMessage());
		}

	}

	public static void main(String[] args) {
		// Comment exception1() if you want to run exception2()
		// exception1();
		exception2();

	}
}
