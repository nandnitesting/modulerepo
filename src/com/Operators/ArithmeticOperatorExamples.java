package com.Operators;

public class ArithmeticOperatorExamples {

	public static void main(String[] args) {

		//Arithmetic Operator
		int a=20;
		int b=10;

		System.out.println("The value of a and b after addition is: "+(a+b));
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);

		//Unary Operator
		System.out.println(a);//20
		System.out.println(++a);//21
		System.out.println(a++);//21
		System.out.println(a);//22

		System.out.println(b);//10
		System.out.println(b++);//10
		System.out.println(++b);//12
		System.out.println(b);//12

		System.out.println(a);//22
		System.out.println(--a);//21
		System.out.println(a--);//21
		System.out.println(a);//20

		System.out.println(b);//12
		System.out.println(--b);//11
		System.out.println(b--);//11
		System.out.println(b);//10

		//Relational Operator

		int c=50;
		int d=30;
		System.out.println(c==d);//false
		System.out.println(c!=d);//true
		System.out.println(c>d);//true
		System.out.println(c<d);//false
		System.out.println(c>=d);//true
		System.out.println(c<=d);//false

		//conditional Operator
		System.out.println((c>d)&&(c<d));//false
		System.out.println((c>d)||(c<d));//true

		//Assignment Operator
		System.out.println(c+=5);//55
		System.out.println(c-=49);//6
		System.out.println(c*=3);//18
		System.out.println(c/=3);//6
		System.out.println(c%=3);//0

		System.out.println(c+=d);

		int e=30;
		int f=30;
		System.out.println(e=f);
		System.out.println(e==f);


	}

}
