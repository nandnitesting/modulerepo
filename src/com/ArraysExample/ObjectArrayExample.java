package com.ArraysExample;

public class ObjectArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object array1[]=new Object[3];
		array1[0]=10;
		array1[1]="hello";
		array1[2]='a';
		for(int i=0;i<=2;i++)
		{
			System.out.println(array1[i]);
		}
		System.out.println("__________________");
		for(Object index:array1)
		{
			System.out.println(index);
		}
		//for(int j=0;j<array1.s)

	}

}
