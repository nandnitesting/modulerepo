package com.Abstraction;

public class TestBank {

	public static void main(String[] args) {
	
		ICICI obj=new ICICI();
		obj.credit();
		obj.debit();
		SBI obj1=new SBI();
		obj1.credit();
		obj1.debit();

	}

}
