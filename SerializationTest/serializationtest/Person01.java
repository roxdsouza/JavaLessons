package serializationtest;

// Using transient keyword to stop the object from getting serialized.

import java.io.Serializable;

public class Person01 implements Serializable {

	private static final long serialVersionUID = 7343385617370573445L;
	private transient int id;
	private String name;
	private static int count;

	public Person01(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Person01.count = count;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "] Count is: " + count;
	}
}
