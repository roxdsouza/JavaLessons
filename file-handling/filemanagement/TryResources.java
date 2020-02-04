package filemanagement;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// Writing the same code as in "BufferedReader1.java" using the new technique.
// Much shorter code as compared to "BufferedReader1.java"

public class TryResources {

	public static void main(String[] args) {
		File f1 = new File("Reanna.txt");
		
		// Using try(statement) 
		// Replaced - FileReader fr = new FileReader(f1);
		// directly by passing (new FileReader(f1)) as an object.
		
		try(BufferedReader br = new BufferedReader(new FileReader(f1))) {
			String line;

			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + f1.toString());
		} catch (IOException e) {
			System.out.println("Unable to read file: " + f1.toString());
		}

	}

}
