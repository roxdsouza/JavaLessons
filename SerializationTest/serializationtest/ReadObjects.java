package serializationtest;

// Reading serialized objects from the file.
// Run the writeObjects.java file before executing this program.

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadObjects {

	public static void main(String[] args) {
		System.out.println("Reading objects...");

		try (FileInputStream fi = new FileInputStream("people.dat")) {
			ObjectInputStream os = new ObjectInputStream(fi);

			Person p1 = (Person) os.readObject();
			Person p2 = (Person) os.readObject();

			Person[] people = (Person[]) os.readObject();

			// The following is used to suppress any unwanted warnings.

			@SuppressWarnings("unchecked")
			ArrayList<Person> peopleList = (ArrayList<Person>) os.readObject();

			for (Person person : people) {
				System.out.print("-->");
				System.out.println(person);
			}

			for (Person person : peopleList) {
				System.out.print("++");
				System.out.println(person);
			}

			os.close();

			System.out.println(p1);
			System.out.println(p2);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}