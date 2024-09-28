package com.Constructor;

public class ImplicitConstructorExample {

	public int i;
	public static void main(String[] args) {
		ImplicitConstructorExample ic=new ImplicitConstructorExample();
		System.out.println(ic.i);

	}
	
	public ImplicitConstructorExample()
	{
		i=30;
		System.out.println(i);
	}
	public ImplicitConstructorExample(int a)
	{
		i=a;
		System.out.println(a);
	}

}
