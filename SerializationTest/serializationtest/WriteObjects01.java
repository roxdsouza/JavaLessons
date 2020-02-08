package serializationtest;

// Serialization: writing objects to files.
// Using objects, serialized arrays and ArrayList.

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteObjects01 {

	public static void main(String[] args) {
		System.out.println("Writing objects...");

		Person[] people = { new Person(111, "Sachin"), new Person(99, "Brian"), new Person(102, "Chandu") };

		ArrayList<Person> peopleList = new ArrayList<Person>(Arrays.asList(people));

		// Using try with resources which will take care of
		// closing the fs object automatically.

		try (FileOutputStream fs = new FileOutputStream("people.dat")) {
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(people);
			os.writeObject(peopleList);

			os.writeInt(peopleList.size());

			for (Person person : people) {
				os.writeObject(person);
			}

			for (Person person : peopleList) {
				os.writeObject(person);
			}

			os.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Completed writing.");
	}
}