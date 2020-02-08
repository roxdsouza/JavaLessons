package serializationtest;

// Reading serialized objects from the file.
// Run the writeObjects.java file before executing this program.

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadObjects01 {

	public static void main(String[] args) {
		System.out.println("Reading objects...");

		try (FileInputStream fi = new FileInputStream("people.dat")) {
			ObjectInputStream os = new ObjectInputStream(fi);

			Person[] people = (Person[]) os.readObject();

			// The following is used to suppress any unwanted warnings.

			@SuppressWarnings("unchecked")
			ArrayList<Person> peopleList = (ArrayList<Person>) os.readObject();

			for (Person person : people) {
				System.out.println(person);
			}

			for (Person person : peopleList) {
				System.out.println(person);
			}

			int num = os.readInt();

			for (int i = 0; i < num; i++) {
				Person person = (Person) os.readObject();
				System.out.println(person);
			}

			os.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}