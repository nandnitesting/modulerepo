package com.DecisionMakingStatements;

public class NestedIfExample {

	public static void main(String[] args) {

		int a=40;
		int b=30;
		int c=10;
		if(a>b)
		{
			System.out.println("Manual");
			if(a>c)
			{
				System.out.println("Testing");
			}
			System.out.println("Automation");
		}

	}

}
