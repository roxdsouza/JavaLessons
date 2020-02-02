package exceptionmanagement;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;;

public class Test {
	public void run() throws IOException, ParseException {
		// throw new IOException();
		System.out.println("An idiot is watching this program...");
		throw new ParseException("Error in the command line", 1);
	}
	
	public void rub(int v1) throws FileNotFoundException, IOException {
		if (v1 == 1)
		{
			System.out.println("Inside the rub method...");
			throw new FileNotFoundException("File is not found.");
		} 
		else
		{
			System.out.println("Inside the rub method...");
			throw new IOException("IOException found.");
		}
	}
}