package enumTest;

// An enum is a special "class" that represents a group 
// of constants (unchangeable variables, like final variables).

// Enumerations serve the purpose of representing a group of named constants 
// in a programming language. For example the 4 suits in a deck of playing 
// cards may be 4 enumerators named Club, Diamond, Heart, and Spade, belonging 
// to an enumerated type named Suit. 

// https://www.geeksforgeeks.org/enum-in-java/

public class EnumClass {

	public static void main(String[] args) {
		
		// Using enum
		Animal animal = Animal.CAT;
		System.out.println(animal);
		
		switch(animal) {
		case CAT:
			System.out.println("It's a CAT!");
			break;
		case DOG:
			System.out.println("It's a DOG!");
			break;
		case MOUSE:
			System.out.println("It's a MOUSE!");
			break;
		default:
			break;
		}
		
		System.out.println(Animal.CAT);
		System.out.println(Animal.DOG);
		System.out.println(Animal.DOG.getClass());
		System.out.println(Animal.DOG.getDeclaringClass());
		System.out.println(Animal.DOG instanceof Enum);
		System.out.println(Animal.DOG instanceof Animal);
		
		System.out.println(Animal.MOUSE.getName());
		
		System.out.println("Enum name as a string: " + Animal.DOG.name());
		
		Animal animal2 = Animal.valueOf("MOUSE");
		System.out.println(animal2);
		System.out.println(Animal.valueOf("MOUSE"));
		System.out.println(animal2.getName());
	}
}