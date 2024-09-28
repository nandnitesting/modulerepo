package com.ArraysExample;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		
		//Datatype variablename[row][column]=new Datatype[size[size];

		String array1[][]=new String[2][2];
		
		array1[0][0]="Hyderabad";
		array1[0][1]="Telangana";
		array1[1][0]="SR Nagar";
		array1[1][1]="Ameerpet";
		for(int rowIndex=0;rowIndex<2;rowIndex++)
		{
			for(int cellIndex=0;cellIndex<2;cellIndex++)
			{
				System.out.println(array1[rowIndex][cellIndex]);
			}
			System.out.println();
		}
	}

}
