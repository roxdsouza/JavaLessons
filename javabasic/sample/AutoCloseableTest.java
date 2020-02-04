package sample;

// Using the "AutoCloseable" interface.
// Using try(statement).

// AutoCloseable has just one method - close()
// To understand more, select the word "AutoClosable" and press F3.

class Temp implements AutoCloseable 
{
	public void close() throws Exception
	{
		System.out.println("Closing!");
		throw new Exception("Oh no!");
	}
}

public class AutoCloseableTest {

	public static void main(String[] args) {
		
		// Try creating an object of Temp class.
		// Will throw an error stating variable t2 is never closed.
		// Uncomment the line below to try.
		// Temp t2 = new Temp();		
		
		
		// The following is called "Try with Resources".
		try(Temp t1 = new Temp())
		{
			
		} catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}