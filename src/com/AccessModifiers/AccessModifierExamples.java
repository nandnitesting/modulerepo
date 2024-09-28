package com.AccessModifiers;

public class AccessModifierExamples {

	public void addition()
	{
		int var1=20;
		int var2=10;
		int var3;
		var3=var1+var2;
		System.out.println(var3);
	}
	
	public static void main(String[] args) {
		
		AccessModifierExamples m1=new AccessModifierExamples();
		m1.addition();
		m1.Substraction();
		m1.multiplication();
		m1.division();
		}
	private void Substraction()
	{
		int a=10;
		int b=20;
		int c;
		c=a-b;
		System.out.println(c);
	}
	void multiplication()
	{
		int var1=20;
		int var2=10;
		int var3;
		var3=var1*var2;
		System.out.println(var3);
	}
	protected void division()
	{
		int var1=20;
		int var2=10;
		int var3;
		var3=var1/var2;
		System.out.println(var3);
	}

}
