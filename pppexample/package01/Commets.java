package package01;

public class Commets extends Galaxy {
	private static int cid;
	protected String cname;
	private double speed;

	public Commets() {
		System.out.println("Calling empty commets constructor.");
	}

	protected Commets(String cname, double speed) {
		this.cname = cname;
		this.speed = speed;
	}

	protected double printCommetsSpeed() {
		return this.speed;
	}
	
	protected int printCommetsID() {
		return ++Commets.cid;
	}
}
