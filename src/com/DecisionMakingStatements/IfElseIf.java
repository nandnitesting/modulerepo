package com.DecisionMakingStatements;

public class IfElseIf {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=15;
		if((a>b)&&(a>c))
		{
			System.out.println("a is not greater than b and c");
		}
		else
			if(b<c)
			{
				System.out.println("b is greater than c");
			}
			else
			{
				System.out.println("b is greater than a and c");
			}
	}

}
