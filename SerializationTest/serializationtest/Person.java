package serializationtest;

// Serialization is a mechanism of converting the state of an object into a byte 
// stream. Deserialization is the reverse process where the byte stream is used 
// to recreate the actual Java object in memory. This mechanism is used to persist 
// the object.

import java.io.Serializable;

public class Person implements Serializable{
	
	// The Serialization runtime associates a version number with each Serializable 
	// class called a SerialVersionUID, which is used during Deserialization to
	// verify that sender and reciever of a serialized object have loaded classes 
	// for that object which are compatible with respect to serialization. If the 
	// reciever has loaded a class for the object that has different UID than that 
	// of corresponding sender’s class, the Deserialization will result in an 
	// InvalidClassException. A Serializable class can declare its own UID explicitly 
	// by declaring a field name. 	It must be static, final and of type long.

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
