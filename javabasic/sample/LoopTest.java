package sample;

// This program demonstrates different types of loops in Java.

public class LoopTest {

	public static void main(String[] args) {
		int i = 0;

		for (i = 0; i < 5; i++) {
			System.out.println(i + ": Inside FOR loop");
		}

		System.out.println("=======================");
		
		// Will execute until the condition is TRUE
		while (i != 0) {
			System.out.println(i + ": Inside WHILE loop");
			i--;
		}

		System.out.println("=======================");

		// Will execute the loop at least once.
		
		do {
			System.out.println(i + ": Inside DO...WHILE loop");
			i++;
		} while (i < 5);
		
		System.out.println("=======================");
	}
}