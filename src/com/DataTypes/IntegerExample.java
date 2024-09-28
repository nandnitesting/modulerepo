package com.DataTypes;

public class IntegerExample {

	static int intVariable;
	public static void main(String[] args) {

		System.out.println("Default Value is:"+intVariable);
		intVariable=20;
		System.out.println("Actual Value is:"+intVariable);
		System.out.println("Byte "+Integer.SIZE/8+" Size");
		System.out.println("Minimum Value is:"+Integer.MIN_VALUE);
		System.out.println("Maximum Value is:"+Integer.MAX_VALUE);

	}

}
