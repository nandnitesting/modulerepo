package com.OOPSConcept;

public class EncapsulationExample {

	String name="Livetech";
	int age=28;
	
	public void test()
	{
		System.out.println("Institute name is:"+name);
		System.out.println("Institute age is:"+age);
	}
	public static void main(String[] args) {
		EncapsulationExample obj=new EncapsulationExample();
		obj.test();

	}

}
