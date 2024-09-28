package com.OOPSConcept;

public class MethodOverloadingExample {

	public void add(int a, int b)
	{
		
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		MethodOverloadingExample obj=new MethodOverloadingExample();
		obj.add(10, 20);
		obj.add(10, 20, 30);
		

	}
	
	public void add(int a, int b,int c)
	{
		System.out.println(a+b+c);
	}

		
	}


