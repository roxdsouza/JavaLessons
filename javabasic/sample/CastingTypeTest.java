package sample;

// This test is to find how casting can be done.

public class CastingTypeTest {

	public static void main(String[] args) {
		byte byteValue = 20;
		short shortValue = 55;
		int intValue = 888;
		int intValue1 = 888;
		long longValue = 235555;
		
		float floatValue = 465.23f;
		double doubleValue = 324585.442;
		
		// Can use these classes to find MAX / MIN values.
		System.out.println("Max Byte Value: " + Byte.MAX_VALUE);
		System.out.println("Min Byte Value: " + Byte.MIN_VALUE);
		System.out.println("Max Integer Value: " + Integer.MAX_VALUE);
		System.out.println("Min Integer Value: " + Integer.MIN_VALUE);
		
		intValue = (int)longValue;
		System.out.println(intValue);
		
		doubleValue = intValue;
		System.out.println(doubleValue); // Will add a decimal 0 behind the int value
		
		intValue1 = (int)doubleValue;
		System.out.println(intValue1);
		
		byteValue = (byte)128;
		
		// Max byte value is 127
		// Here byte value has moved to -128 (left most number)
		// This is due to overflow
		System.out.println(byteValue);
		
		System.out.println("Max Short Value: " + Short.MAX_VALUE);
		System.out.println("Min Short Value: " + Short.MIN_VALUE);
		intValue = 888;
		
		// This will convert from int to short
		shortValue = (short)intValue;
		System.out.println(shortValue);
		
		shortValue = (short)longValue;
		System.out.println(shortValue);
		
		floatValue = (float)doubleValue;
		System.out.println(floatValue);
		
		System.out.println("Max float Value: " + Float.MAX_VALUE);
		System.out.println("Min float Value: " + Float.MIN_VALUE);
		
		
	}

}
