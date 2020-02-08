package innerclass;

// Creating Brain and Battery class inside Robot class.
// Creating a Temp class within a method.

public class Robot {

	private int id;

	public class Brain {
		public void think() {
			System.out.println("Robot " + id + ": is thinking...");
		}
	}

	public static class Battery {
		public void charge() {
			System.out.println("Battery of Robot is charging...");
		}
	}

	public Robot(int id) {
		this.id = id;
	}

	public void start() {
		System.out.println("Robot " + id + ": is starting...");
		
		Brain bone = new Brain();
		bone.think();
		
		String name = "Robert King";
		
		// Local class within a method.
		
		class Temp
		{
			public void printSomething()
			{
				System.out.println("ID is " + id);
				System.out.println("My name is " + name);
			}
		}
		
		Temp t1 = new Temp();
		t1.printSomething();
		
		Battery btwo = new Battery();
		btwo.charge();
	}
}
