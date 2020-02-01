package sample;

public class DataTypes {

	public static void main(String[] args) {

		/*
		 * The following data types are called PRIMITIVE DATA TYPES. 
		 * int, long, short, float, double, char, boolean, byte
		 * 
		 * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
		 * 
		 * You may have noticed that the new keyword isn't used when initializing a variable of a primitive type. 
		 * Primitive types are special data types built into the language; 
		 * they are not objects created from a class. 
		 * A literal is the source code representation of a fixed value; literals are represented 
		 * directly in your code without requiring computation. 
		 * As shown below, it's possible to assign a literal to a variable of a primitive type:

			boolean result = true;
			char capitalC = 'C';
			byte b = 100;
			short s = 10000;
			int i = 100000;
		 */

		// INTEGER

		int ivalue;
		ivalue = 357000000;

		// Type "sysout" and press CTRL + SPACE to fill the following line.
		// There are other variations of println like print and printf.
		System.out.println("Integer variable: " + ivalue);

		// *******************************************************************

		// BYTE

		byte byvalue;
		byvalue = -126; // Can have value between -128 to 127
		System.out.println("Byte variable: " + byvalue);
		
		byte nybbles = 0b0010_0101;
		System.out.println("Byte variable nybbles: " + nybbles);

		// *******************************************************************

		// SHORT
		short svalue; // Can have value between -32768 to 32768.
		svalue = 32767;
		System.out.println("Short variable: " + svalue);

		// *******************************************************************

		// LONG

		long lvalue;
		// Use this data type when the integer range cannot be accommodated in int
		// value.
		// An integer literal is of type long if it ends with the letter L or l;
		// otherwise it is of type int.
		// It is recommended that you use the upper case letter L because the lower case
		// letter l is hard to distinguish from the digit 1.

		lvalue = 100000000000L;
		System.out.println("Long variable: " + lvalue);
		
		long creditCardNumber = 1234_5678_9012_3456L;		// Underscore used to separate numbers
		System.out.println("Credit card number: " + creditCardNumber);
		
		long maxLong = 0x7fff_ffff_ffff_ffffL;
		System.out.println("Max Long: " + maxLong);
		
		long bytes = 0b11010010_01101001_10010100_10010010;
		System.out.println("Long byte: " + bytes);
		
		long hexWords = 0xCAFE_BABE;
		System.out.println("Long Hex Words: " + hexWords);

		// *******************************************************************

		// BOOLEAN
		boolean boovalue = true;
		System.out.println("Boolean value: " + boovalue);

		boovalue = 7 < 2;
		System.out.println("Boolean value: " + boovalue);

		boovalue = 7 != 2;
		System.out.println("Boolean value: " + boovalue);
		
		boovalue = 7 == 2;
		System.out.println("Boolean value: " + boovalue);
		
		boovalue = 'a' == 'a';
		System.out.println("Boolean value: " + boovalue);
		
		boovalue = "India" == "india";
		System.out.println("Boolean value: " + boovalue);
		
		// *******************************************************************

		// FLOAT
		
		float fvalue;
		
		// A floating-point literal is of type float if it ends with the letter F or f; 
		// otherwise its type is double and it can optionally end with the letter D or d.
		fvalue = 3.6f;
		System.out.println("Float value: " + fvalue);
		
		float pi =  3.14_15F;			// Using underscore in a float value.
		System.out.println("Float PI value: " + pi);
		
		// *******************************************************************

		// DOUBLE
		
		double d1 = 25.36;
		System.out.println("Double value : " + d1);

		// *******************************************************************

		// CHAR
		
		// The char data type is a single 16-bit Unicode character. 
		// It has a minimum value of '\u0000' (or 0) and a maximum value of '\uffff' (or 65,535 inclusive).
		
		char alpha = 'a';		// Can only use single quotes.
		System.out.println("Char value: " + alpha);

		// *******************************************************************

	}

}
