package abstractPackage;

public class TableFan01 extends Machine {

	@Override
	public void restart() {
		System.out.println("Fan started.");
	}

	@Override
	public void showInfo() {
		System.out.println("Fan is from Havells.");
		run();
		getInfo(20);
	}
}
