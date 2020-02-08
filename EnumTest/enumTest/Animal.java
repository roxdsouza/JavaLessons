package enumTest;

// To create an enum, use the enum keyword (instead of class or interface), 
// and separate the constants with a comma. Note that they should be in 
// uppercase letters

public enum Animal {
	
	// Can define enums like below
	// CAT, DOG, MOUSE
	
	// Can define like a constructor
	CAT("Tom"), DOG("Bruno"), MOUSE("Jerry");
	
	private String name;
	
	Animal(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String toString()
	{
		return "This animal is called: " + name;
	}
}
