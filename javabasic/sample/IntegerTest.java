package sample;

public class IntegerTest {

	public static void main(String[] args) {
		// Single dimensional and multi-dimensional array.
		// Includes for loop example
		
		// Array values need to be provided during initialization.
		int[] values = { 3, 7, 10, 15, 18 };
		values[3] = 100;

		// Using printf statement. Will print everything in the same line.
		System.out.printf("%d\n", values[3]);

		System.out.println("The fourth element in the array is: " + values[4]);

		// Multi-dimensional array

		int[][] grid = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 } };

		System.out.println("The third element in each array is: " + grid[0][2] + " " + grid[1][2] + " " + grid[2][2]);

		// Print all numbers of the array

		System.out.println("Print the two dimentional grid:");
		for (int row = 0; row < grid.length; row++) {
			for (int col=0; col < grid[row].length; col++) {
				System.out.print(grid[row][col] + "\t");	// Prints values on the same line.
			}
			System.out.println(); 	// Print a new line.
		}
	}
}
