package filemanagement;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// Example to read file using some older methods.

public class BufferedReader1 {

	public static void main(String[] args) {

		// Reading file from absolute path. Uncomment the line below to check.
		// Take note of the "/" as the other "\" tries to escape the character.
		// String fileName = "c:/TEMP/Reanna.txt";

		// Reading the file from the root directory of Java project

		// Try changing the file name to a non-existing file name
		// to get into the NullPointerException catch.

		String fileName = "Reanna.txt";

		File f1 = new File(fileName);
		BufferedReader br = null;

		try {
			FileReader fr = new FileReader(f1);
			br = new BufferedReader(fr);

			String line;

			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}

		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + f1.toString());
		} catch (IOException e) {
			System.out.println("Unable to read file: " + f1.toString());
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				System.out.println("Unable to close file: " + f1.toString());
			} catch (NullPointerException npe) {
				System.out.println("Cannot find file: " + f1.toString());
			}
		}
	}
}