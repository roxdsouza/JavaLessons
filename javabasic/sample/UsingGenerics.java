package sample;

import java.util.ArrayList;

public class UsingGenerics {
	
	public static void showStringList(ArrayList<String> strings)
	{
		for (int i = 0; i < strings.size(); i++) {
			System.out.println("Animal name is: " + strings.get(i));
		}
	}
	
	public static void showDoubleList(ArrayList<Double> dbValue)
	{
		for (int i = 0; i < dbValue.size(); i++) {
			System.out.println("Double value is: " + dbValue.get(i));
		}
	}

	public static void main(String[] args) {
		ArrayList<String> strings = new ArrayList<String>();
		
		strings.add("Cat");
		strings.add("Dogs");
		strings.add("Elephants");
		strings.add("Donkeys");

		showStringList(strings);
		
		strings.add(2, "Monkeys");
		strings.add(4,"Hippos");
		
		System.out.println("****************************");
		showStringList(strings);
		
		System.out.println("****************************");
		ArrayList<Double> dbValue = new ArrayList<Double>();
		dbValue.add(32.65);
		dbValue.add(3243.54354);
		dbValue.add(654.0154);
		dbValue.add(983940.2132);
		
		showDoubleList(dbValue);
	}

}
