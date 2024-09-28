package com.JumpingStatements;

public class BreakExample {

	public static void main(String[] args) {
	for(int a=1;a<=5;a++)
	{
		if(a==4)
			break;
		System.out.println(a);
	}
	for(int a=1;a<=5;a++)
	{
		if(a==4)
			continue;
		System.out.println(a);
	}

	}

}
