package innerclass;

// Test for inner classes

public class AppClass {

	public static void main(String[] args) {

		Robot rone = new Robot(1);
		rone.start();
		
		Robot.Brain bone = rone.new Brain();
		bone.think();
		
		Robot.Battery battery = new Robot.Battery();
		battery.charge();
	}
}
