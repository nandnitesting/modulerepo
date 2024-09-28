package com.Abstraction;

public class ConstructorExample {

	public int i;
	public static void main(String[] args) {
		
		ConstructorExample ce=new ConstructorExample();
		System.out.println(ce.i);
	}
	
	public ConstructorExample()
	{
		i=30;
		System.out.println(i);
	}
	public ConstructorExample(int a)
	{
		i=a;
		System.out.println(a);
	}

}
