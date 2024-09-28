package com.ArraysExample;

public class SingleDimensionalArrayExample {

	public static void main(String[] args) {
		// Datatype variablename[]=new Datatype[size];
		
		int array1[]=new int[3];
		array1[0]=10;
		array1[1]=20;
		array1[2]=30;

		System.out.println(array1[0]);
		System.out.println(array1[1]);
		System.out.println(array1[2]);
		System.out.println("*********************************");

		for(int index=0;index<3;index++)
		{
			System.out.print(array1[index]+",");
		}
	}

}
