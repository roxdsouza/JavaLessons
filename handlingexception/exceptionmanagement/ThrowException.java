package exceptionmanagement;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class ThrowException {

	public static void main(String[] args) {
		Test t1 = new Test();

		// Option 1
		try {
			t1.run();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			System.out.println("Couldn't parse file.");
		}

		// Option 2
		// Move the mouse over t1.run() and select
		// surround with multicatch option.

		try {
			t1.run();
		} catch (IOException | ParseException e) {
			System.out.println("Couldn't parse file (inside multi-catch).");
		}

		// Option 3
		// Using the parent exception class

		try {
			t1.run();
		} catch (Exception e) {
			System.out.println("Using the parent EXCEPTION class.");
		}

		// Option 4.1
		// Putting the FileNotFoundException before the IOException
		// FileNotFoundException is a child class of IOException
		// If IOException is placed before FileNotFoundException then
		// FileNotFoundException code will never be executed.
		try {
			// Change the value in the method to '1' or '2' and try.
			t1.rub(2);
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		// Option 4.2
		// Putting the FileNotFoundException before the IOException
		// FileNotFoundException is a child class of IOException
		// If IOException is placed before FileNotFoundException then
		// FileNotFoundException code will never be executed.
		// Uncommet the code to fnd the error.
		
		/*		
		try {
			// Change the value in the method to '1' or '2' and try.
			t1.rub(2);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		*/
	}
}
