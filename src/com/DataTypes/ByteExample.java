package com.DataTypes;

public class ByteExample {

	static byte byteVariable;
	public static void main(String[] args) {

		System.out.println("Default value:"+byteVariable);

		byteVariable=10;
		System.out.println("Actual Value:"+byteVariable);
		System.out.println("Byte "+Byte.SIZE/8+" Size");
		System.out.println("Minimum Value is:"+Byte.MIN_VALUE);
		System.out.println("Maximum Value is:"+Byte.MAX_VALUE);
	}

}
