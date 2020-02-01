package sample;

import java.util.ArrayList;

// Using generics with wildcard

class Machine1 {
	@Override
	public String toString() {
		return "This is a Machine.";
	}

}

class Camera extends Machine1 {
	@Override
	public String toString() {
		return "This is a Camera.";
	}
}

public class GenericsWildcard {

	public static void showList(ArrayList<?> list) {
		for (Object value : list) {
			System.out.println(value);
		}
	}

	public static void main(String[] args) {
		ArrayList<Machine1> list1 = new ArrayList<Machine1>();

		list1.add(new Machine1());
		list1.add(new Machine1());

		ArrayList<Camera> list2 = new ArrayList<Camera>();

		list2.add(new Camera());
		list2.add(new Camera());
		
		showList(list1);
		showList(list2);
	}

}
