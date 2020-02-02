package exceptionmanagement;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class HandlingException2 {

	public static void main(String[] args) throws IOException {
		
		// Even though exceptions are handled inside the openFile() method,
		// the same also needs to be  handled here in the main method.
		// Move the mouse over openFile() method and click on 
		// Add throws declaration.
		openFile();
	}

	public static void openFile() throws IOException {
		// "Reanna01.txt" is a non existing file.
		File f1 = new File("Reanna01.txt");

		// Move the mouse over "new FileReader(f1);" and click on the
		// surrond with try/catch option.

		FileReader fr1;
		try {
			fr1 = new FileReader(f1);
			
			// The following line will not be executed if an exception is thrown.
			
			System.out.println("Continuing...");
			
			// Move the mouse pointer over fr1.close() and select
			// add throws exception. This will add the exception 
			// on the same line as the main method.			
			fr1.close();
		} catch (FileNotFoundException e1) {
			System.out.println(e1.getMessage());
		}	
	}
}