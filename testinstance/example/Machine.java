package example;

// Machine class implements interface InfoInterface 

public class Machine implements InfoInterface {

	private int id = 7;

	public void start() {
		System.out.println("Machine started.");
	}

	public void stop() {
		System.out.println("Machine stopped.");
	}

	public void restart() {
		System.out.println("Machine is restarting.");
	}

	public void showInfo() {
		System.out.println("Machine ID is : " + id);
	}
}
