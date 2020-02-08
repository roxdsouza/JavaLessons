package serializationtest;

import java.io.Serializable;

public class Person implements Serializable{

	// Serialization UID added to ensure that the write / read is 
	// happening from the same Person class.
	// Run the WriteObjects.java program, then change the serialized starting value
	// from 7343385617370573445L to 6343385617370573445L
	// Then run the ReadObjects.java program. An exception will be thrown.
	// The write and read object operation needs to happen with the same
	// serialized UID value.
	
	private static final long serialVersionUID = 7343385617370573445L;
	private int id;
	private String name;

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
}
