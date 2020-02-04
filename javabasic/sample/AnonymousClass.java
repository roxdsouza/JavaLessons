package sample;

//Basic "Hello World" example.
//Course from "Udemy".
//John - Java tutorials for complete beginners
//Github - https://github.com/caveofprogramming/java-beginners.git

// This example is to test the anonymous classes

class Books {
	public void name() {
		System.out.println("Printing book name.");
	}
	public void author() {
		System.out.println("Calling author inside Book class.");
	}
}

interface Paper {
	public void pages();
	public void thick();
}

public class AnonymousClass {

	public static void main(String[] args) {

		Books b1 = new Books() {
			// Creating an override method while creating an object

			@Override
			public void name() {
				System.out.println("Printing book name inside main.");
			}
			public void author() {
				System.out.println("Book has been written by a famous author.");
			}
			
			// Uncomment to check what happens.
			
			/* public void pages() {
				System.out.println("Printing the number of pages inside main.");
			} */
		};

		b1.name();
		b1.author();

		// The following will produce an error as the pages
		// method is not existing inside Books class.

		// b1.pages();

		Paper p1 = new Paper() {
			@Override
			public void pages() {
				System.out.println("Page size is A4");
			}
			public void thick() {
				System.out.println("Page is thick");
			}
		};
		
		p1.pages();
		p1.thick();
	}

}
