package sample;

// Writing a recursive method.

public class RecursionTest {

	public static void main(String[] args) {
		int num = 5;
		System.out.println(factorial(num));
		
		System.out.println("---------------------");
		num = 5;
		System.out.println(summation(num));
	}

	public static int factorial(int num) {
		if (num == 1) {
			return 1;
		}
		System.out.println((num - 1) * num);
		return factorial(num - 1) * num;
	}
	
	public static int summation(int num)
	{
		if (num == 1) {
			return 1;
		}
		return summation(num - 1) + num;
	}
}
