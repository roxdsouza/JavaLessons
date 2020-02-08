package serializationtest;

// Serialization: writing objects to files.
// Using objects, serialized arrays and ArrayList.

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteObjects {

	public static void main(String[] args) {
		System.out.println("Writing objects...");

		Person mike = new Person(543, "Mike");
		Person sue = new Person(221, "Sue");

		System.out.println(mike);
		System.out.println(sue);

		Person[] people = { new Person(111, "Sachin"), new Person(99, "Brian"), new Person(102, "Chandu") };
		
		System.out.println(people);
		ArrayList<Person> peopleList = new ArrayList<Person>(Arrays.asList(people));
		System.out.println(peopleList);
		
		// Using try with resources which will take care of
		// closing the fs object automatically.

		try (FileOutputStream fs = new FileOutputStream("people.dat")) {
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(mike);
			os.writeObject(sue);
			os.writeObject(people);
			os.writeObject(peopleList);

			os.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}