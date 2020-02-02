package filemanagement;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Example to understand file scanning

public class FileScanner01 {

	public static void main(String[] args) throws FileNotFoundException, InterruptedException{
		
		// Reading file from absolute path. Uncomment the line below to check.
		// Take note of the "/" as the other "\" tries to escape the character.
		// String fileName = "c:/TEMP/Reanna.txt";
		
		// Reading the file from the root directory of Java project
		String fileName = "Reanna.txt";

		File f1 = new File(fileName);
		Scanner s1 = new Scanner(f1);

		while (s1.hasNextLine()) {
			String line = s1.nextLine();
			System.out.println(line);
			Thread.sleep(500);
		}
		s1.close();
	}
}