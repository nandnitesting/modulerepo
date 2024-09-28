package com.Abstraction;

public class ExceptionExample {

	public static void main(String[] args) {
		int fnumber=9;
		int lnumber=0;
		int result=0;
		try {
		result=fnumber/lnumber;
		}
//		catch(ArithmeticException ae)
//		{
//			 System.out.println(ae.toString());
//		}
		finally {
		System.out.println("Program Executed");
		System.out.println(result);
	}

}}
