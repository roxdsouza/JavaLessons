package package01;

//Public - Can be accessed from anywhere.
//Protected - Can be accessed anywhere within the package.
//Private - Can be access only within  the class.

//Use ClassInsidePackage.java to run the program.

public class Stars extends Galaxy {
	private static int sid;
	protected String sname;
	
	public Stars() {
		System.out.println("Calling stars constructor.");
		Stars.sid++;
	}
	
	public int printStarID() {
		return Stars.sid;
	}
	
}
