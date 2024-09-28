package com.OOPSConcept;

public class C extends B{
	public void selRC()
	
	{
		System.out.println("Selenoium RC");
	}

	public static void main(String[] args) {
		
		C obj=new C();
		obj.selRC();
		obj.selIDE();
		obj.selWebDriver();
	}

}
