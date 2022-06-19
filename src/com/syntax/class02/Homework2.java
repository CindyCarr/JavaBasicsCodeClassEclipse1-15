package com.syntax.class02;

public class Homework2 {

	public static void main(String[] args) {
		// Part 1
		
		double a=11.11;
		double b=22.22;
		double sum, sub, mult, div;
		
		sum=a+b;
		sub=a-b;
		mult=a*b;
		div=a/b;
		System.out.println("The sum of 2 numbers "+a+" and "+b+" is equal to "+sum);
		System.out.println("The sub of 2 numbers "+a+" and "+b+" is equal to "+sub);
		System.out.println("The mult of 2 numbers "+a+" and "+b+" is equal to "+mult);
		System.out.println("The div of 2 numbers "+a+" and "+b+" is equal to "+div);
		
		// Part 2
		
		System.out.println( );
		double x=3.9;
		double y=03.9;
		double z=x*y;
		System.out.println("The square of "+x+" is "+z+".");
		
		// Part 3
		
		int w=5;
		int h=8;
		int area=h*w;
		int perimeter=2*(h+w);
		System.out.println( );
		System.out.println("The perimeter of a rectangle with width "+w+" and height "+h+" is equal to "+perimeter+" and the area is "+area+".");
	}

}
