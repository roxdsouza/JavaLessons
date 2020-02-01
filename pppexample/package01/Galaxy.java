package package01;

//Public - Can be accessed from anywhere.
//Protected - Can be accessed anywhere within the package.
//Private - Can be access only within  the class.

// Use ClassInsidePackage.java to run the program.

public class Galaxy {
	public String gname;
	
	// If no declaration is provided then the variable will be accessible only
	// within the package.
	
	int gid = 0;
	static int gnumber = 0;
	protected double glocation;
	private String garea;
	
	public Galaxy() {
		System.out.println("Calling galaxy constructor.");
	}
	
	public void galaxyArea(String garea) {
		System.out.println("Calling galaxy method.");	
		Galaxy.gnumber++;
		gid = Galaxy.gnumber;
		this.garea = garea;
	}
	
	protected String printGalaxyArea() {
		return this.garea;
	}
}
