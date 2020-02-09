package serializationtest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TransientRead {

	public static void main(String[] args) {
		System.out.println("Reading objects...");

		try (ObjectInputStream os = new ObjectInputStream(new FileInputStream("people01.dat"))) {
			Person01 p1 = (Person01) os.readObject();
			Person01 p2 = (Person01) os.readObject();
			
			// Id and count will be 0 because
			// id is transient and count is static
			
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