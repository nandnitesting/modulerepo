package com.Strings;

import java.util.Arrays;

public class StringComparisionExample {

	public static void main(String[] args) {

		String s1="LiveTech";
		System.out.println(s1);
		String s2="Livetech123@gmail.com";
		System.out.println(s2);
		System.out.println(s1+s2);

		String s3=new String("Testing");
		System.out.println(s3);

		String s4="Hello";
		String s5=new String("Hello");
		String s6="Hello";
		String s7=new String("Hello");

		System.out.println(s4==s5);//false //Addresses will be verified here
		System.out.println(s4==s6);//true
		System.out.println(s4==s7);//false
		System.out.println(s5==s7);//false
		System.out.println(s5==s6);//false
		System.out.println(s6==s7);//false

		//1.equals()
		System.out.println(s4.equals(s5)); //Text will be verified here
		System.out.println(s4.equals(s6));//true
		System.out.println(s4.equals(s7));//true
		System.out.println(s5.equals(s7));//true
		System.out.println(s5.equals(s6));//true
		System.out.println(s6.equals(s7));//true

		//2.equalsIgnoreCase()

		String s8="Hello World";
		String s9="HELLO WORLD";

		System.out.println(s8.equals(s9));//false
		System.out.println(s8.equalsIgnoreCase(s9));//true

		//Contains()
		System.out.println(s8.contains("o"));//true
		System.out.println(s8.contains("O"));//false
		System.out.println(s9.contains("L"));//true
		System.out.println(s9.contains("LL"));//true
		System.out.println(s9.contains("WQ"));//false
		System.out.println(s9.contains(" L"));//FALSE

		//startsWith()
		System.out.println(s8.startsWith("H"));//true
		System.out.println(s8.startsWith("He"));//true
		System.out.println(s9.startsWith("he"));//false
		System.out.println(s9.startsWith("HELLO WORLD"));//true

		//endsWith()
		System.out.println(s8.endsWith("d"));//true
		System.out.println(s8.endsWith("He"));//false
		System.out.println(s9.endsWith("he"));//false
		System.out.println(s9.endsWith("HELLO WORLD"));//true

		//length()
		System.out.println(s8.length());//11
		System.out.println(s2.length());//21
		System.out.println(s9.length());//11

		//trim()
		String s11="  Testing  Tools  ";
		System.out.println(s11.trim());//Testing  Tools
		System.out.println(s11.trim().length());

		//toLowerCase()
		System.out.println(s9.toLowerCase());//hello world
		System.out.println(s8.toLowerCase());//hello world

		//toUpperCase()
		System.out.println(s9.toUpperCase());//HELLO WORLD
		System.out.println(s8.toUpperCase());//HELLO WORLD

		//indexOf() //Index is always starts with Zero.
		String s12="Madam";
		System.out.println(s12.indexOf("a"));//1

		//lastIndexOf()
		System.out.println(s12.lastIndexOf("a"));//3
		System.out.println(s8.indexOf("l"));//2
		System.out.println(s8.lastIndexOf("l"));//9

		//subString()
		System.out.println(s8.substring(2));//llo World
		System.out.println(s8.substring(0));//Hello World
		System.out.println(s8.substring(0, 4));//

		//split()
		String s13="Th@is i@s my c@las@s";
		//System.out.println(s13.split("@"));//[Ljava.lang.String;@77556fd
		System.out.println(Arrays.toString(s13.split("\\@")));

		//		String s15 = "Th@is i@s$m#y c@l#as@s";
		//		String specialChars = "";
		//
		//		for (char c : s15.toCharArray()) {
		//		    if (!Character.isLetterOrDigit(c)) {
		//		        specialChars += c;
		//		    }
		//		}
		//
		//		System.out.println("Special characters: " + specialChars);


		//charAt()
		System.out.println(s13.charAt(0));//T
		System.out.println(s13.charAt(2));//@

		//replace()
		System.out.println(s13.replace("@", "$"));
		System.out.println(s13.replace("i", "a"));

		//replaceAll()
		System.out.println(s13.replaceAll("Th@is i@s my c@las@s", "My Class"));

		System.out.println(s13.replaceAll(s12, s13));


	}

}
