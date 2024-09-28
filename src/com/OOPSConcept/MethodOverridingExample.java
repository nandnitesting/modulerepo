package com.OOPSConcept;

public class MethodOverridingExample extends MethodOverriding{

	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		
		MethodOverridingExample m1=new MethodOverridingExample();
		m1.add(10, 70);
		MethodOverriding obj=new MethodOverriding();
		obj.add(30, 50);
	}

}
