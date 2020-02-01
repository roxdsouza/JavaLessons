package package01;

//Public - Can be accessed from anywhere.
//Protected - Can be accessed anywhere within the package.
//Private - Can be access only within  the class.

//Use ClassInsidePackage.java to run the program.

public class Planets extends Stars{
	private static int pid;
	protected String pname;
	
	public Planets() {
		System.out.println("Calling empty planet constructor.");
	}
	
	public Planets(String gname, String garea, String sname, String pname, double glocation) {
		galaxyArea(garea);
		System.out.println("Calling planets constructor.");
		Planets.pid++;
		this.pname = pname;
		this.sname = sname;
		this.gname = gname;
		this.glocation = glocation;
	}
	
	public int printPlanetID() {
		return Planets.pid;
	}
}
