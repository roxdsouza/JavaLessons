package filemanagement;

// Creating and writing to files.

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateWriteFiles {

	public static void main(String[] args) {
		File f1 = new File("C:/TEMP/Sample.txt");

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(f1))) {
			bw.write("Hello World \n");
			bw.newLine();
			bw.write("Second line \n");
			System.out.println("Wrote two lines to the file!");
		} catch (IOException e) {
			System.out.println("Unable to write file: " + f1.toString());
		}

	}

}
