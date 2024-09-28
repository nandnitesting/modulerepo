package com.AccessModifiers;

public class UDMExamples {
	
	public void methodname1()
	{
		System.out.println("Testing");
	}
	
	
	public void methodname2()
	{
		System.out.println("Automation");
	}
	

	public static void main(String[] args) {
		UDMExamples obj=new UDMExamples();
		obj.methodname1();
		obj.methodname2();
		obj.methodname3();
		obj.Livetech();
		obj.Testing();
		obj.methodname2();
		obj.methodname1();
		obj.methodname2();
		obj.methodname3();
		obj.Livetech();
		obj.Testing();
		AccessModifierExamples m1=new AccessModifierExamples();
m1.addition();
//m1.Substraction();
m1.multiplication();
m1.division();
	}
	
	public void methodname3()
	{
		
		System.out.println("Manual");
	}
	public void Livetech()
	{
		System.out.println("Java");
	}
	public void Testing()
	{
		System.out.println("Selenium");
	}

}
