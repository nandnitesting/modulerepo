package com.ExceptionHandling;

public class ExceptionExample {

	public static void main(String[] args) {
		
		int firstNumber=9;
		int lastNumber=0;
		int result=0;
//		result=firstNumber/lastNumber;
//		System.out.println(result);
		
		try {
			result=firstNumber/lastNumber;
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae.toString());
		}
		System.out.println(result);
		System.out.println("program executed");
	
//		finally
//		{
//			System.out.println("Program terminated");
//			System.out.println(result);
//		}
	}

}
