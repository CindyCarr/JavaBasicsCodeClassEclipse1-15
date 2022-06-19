package com.syntax.class03;

public class ShorthandAssignmentAkaCompoundOperators {

	public static void main(String[] args) {
		//Shorthand Assignment aka Compound Operators
		
		int num=100;
		num=num+100;
		
		System.out.println(num); //200
		
		num=num+50;
		System.out.println(num); //250
		
		num+=100; //num=num+100	-This is a shorthand operator	- A quicker way to type arithmatic operators
		System.out.println(num); //350
		
		num-=10;
		System.out.println(num); //340
		
		num/=10; //34
		num*=2;	 
		System.out.println(num); //68
		
		num%=2;
		System.out.println(num); //0
		
		int a=10;
		int b=20;
		int c=30;
		
		a+=b;
		System.out.println(a); //30
		
		
		a+=b+c;
		System.out.println(a);
	}

}
