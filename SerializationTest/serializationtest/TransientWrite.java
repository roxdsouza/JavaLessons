package serializationtest;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TransientWrite {

	public static void main(String[] args) {
		System.out.println("Writing objects...");

		// Nested statement.
		// Compare the code against WriteObjects.java file.

		try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("people01.dat"))) {
			Person01 mike = new Person01(543, "Mike");
			Person01 sue = new Person01(531, "Sue");
			
			// Setiing value of static variable count.
			Person01.setCount(69);
			
			os.writeObject(mike);
			os.writeObject(sue);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Writing completed.");
	}
}