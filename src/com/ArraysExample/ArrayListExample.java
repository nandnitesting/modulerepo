package com.ArraysExample;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// List<datatype>arraylistname=new Arraylist<>();
		
		List<Object>arraylist1=new ArrayList<>();
		arraylist1.add(10);
		arraylist1.add(10.45);
		arraylist1.add('A');
		arraylist1.add("LiveTech");
		
		for(int index=0;index<arraylist1.size();index++)
		{
			System.out.println(arraylist1.get(index));
		}
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		for(int index=0;index<4;index++)
		{
			System.out.println(arraylist1.get(index));
		}
		System.out.println("****************************");
		for(Object index:arraylist1)
		{
			System.out.println(index);
		}
		

	}

}
