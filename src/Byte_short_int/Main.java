package Byte_short_int;

public class Main {
	
	public static void main(String[] args) {
		int myValue = 10000;
		
		int myMinIntValue = Integer.MIN_VALUE;
		int myMaxIntValue = Integer.MAX_VALUE;
		
		System.out.println("Integer minimum value: " + myMinIntValue);
		System.out.println("Integer maximum value: " + myMaxIntValue);
		System.out.println("Busted Int MAX Value: " + (myMaxIntValue+1));
		System.out.println("Busted Int Min Value: " + (myMinIntValue-1));
	//	int myMaxIntTest = 21474836471; --> Integer value out of range error
	//  int myMinIntTest = -21474836649 --> Int out of range error
		
		byte myMinByteValue = Byte.MIN_VALUE;
		byte myMaxByteValue = Byte.MAX_VALUE;
		System.out.println("Byte minimum value: " + myMinByteValue);
		System.out.println("Byte maximum value: " + myMaxByteValue);
		
		short myMinshortValue = Short.MIN_VALUE;
		short myMaxshortValue = Short.MAX_VALUE;
		System.out.println("short minimum value: " + myMinshortValue);
		System.out.println("short maximum value: " + myMaxshortValue);		
		
		
	//	long myLongValue =100L;  --> end of number put capital 'L' to represent long.
		
		long myMinlongValue = Long.MIN_VALUE;
		long myMaxlongValue = Long.MAX_VALUE;
		System.out.println("long minimum value: " + myMinlongValue);
		System.out.println("long maximum value: " + myMaxlongValue);
		
		long bigLongLiteralValue = 2_147_483_647_234L;
		System.out.println(bigLongLiteralValue);
		
	//	short bigShortLiteralValue = 32768; -- >error cannot convert int to short
		
		
	}



}
