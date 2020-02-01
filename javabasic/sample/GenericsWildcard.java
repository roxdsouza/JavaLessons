package sample;

import java.util.ArrayList;

// Using generics with wildcard

class Machine1 {
	@Override
	public String toString() {
		return "This is a Machine.";
	}
	public void start() {
		System.out.println("Machine starting...");
	}

	public void stop() {
		System.out.println("Machine stopping...");
	}
}

class Camera extends Machine1 {
	@Override
	public String toString() {
		return "This is a Camera.";
	}
	// Overrides the start method in Machine1 class
	public void start() {
		System.out.println("Camera starting...");
	}
	public void snap() {
		System.out.println("Photo snapped..");
	}
}

class Car extends Machine1 {
	@Override
	public String toString() {
		return "This is a Car.";
	}
	public void stall() {
		System.out.println("Car has stalled...");
	}
	public void sleep() {
		System.out.println("Car is sleeping...");
	}
}

class Bus extends Machine1 {
	@Override
	public String toString() {
		return "This is a Bus.";
	}
	// Overrides the start method in Machine1 class
	public void start() {
		System.out.println("Bus has started...");
	}
	// Overrides the stop method in Machine1 class
	public void stop() {
		System.out.println("Bus has stopped...");
	}
}

public class GenericsWildcard {

	// Used wildcard "?" as to pass object of any class
	public static void showList(ArrayList<?> list) {

		// Using Object as it is the super class
		for (Object value : list) {
			System.out.println(value);
		}
	}

	public static void showListExtends(ArrayList<? extends Machine1> list) {

		// Changing to Machine1 from Object as this method
		// is extended to Machine1.
		for (Machine1 value : list) {
			System.out.println(value);
			value.start();
			value.stop();

			// Cannot use the snap method from the Camera class
			// as it is not available in Machine1 class.
			// The following will throw an error.
			// value.snap();
		}
	}

	public static void main(String[] args) {
		ArrayList<Machine1> list1 = new ArrayList<Machine1>();

		list1.add(new Machine1());
		list1.add(new Machine1());

		ArrayList<Camera> list2 = new ArrayList<Camera>();

		list2.add(new Camera());
		list2.add(new Camera());

		ArrayList<Car> list3 = new ArrayList<Car>();

		list3.add(new Car());
		list3.add(new Car());

		ArrayList<String> list4 = new ArrayList<String>();

		list4.add("Dog");
		list4.add("Cat");
		list4.add("Horse");

		ArrayList<Bus> list5 = new ArrayList<Bus>();

		list5.add(new Bus());
		list5.add(new Bus());
		
		showList(list1);
		showList(list2);
		showList(list3);
		showList(list4);

		System.out.println("*************************");

		showListExtends(list1);
		System.out.println();
		
		// Camera does not have stop method and hence
		// it reaches out to the stop method in the 
		// parent class - Machine1
		
		showListExtends(list2);
		System.out.println();
		
		// Since car class does not have start / stop 
		// method, it will use the start /stop method of 
		// the parent class i.e. Machine1
		
		showListExtends(list3);
		System.out.println();

		// Cannot use object list4 as with showListExtends method as
		// it extends to Machine1 class. It will throw an error
		// if you try to use it:
		// showListExtends(list4);
		
		// Since Bus class has stop / start method, it will
		// use it's own methods and will override the methods
		// provided by the parent class - Machine1
		showListExtends(list5);
		System.out.println("*************************");
	}
}