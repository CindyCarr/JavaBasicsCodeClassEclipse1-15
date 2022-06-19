package com.syntax.class02;

import java.util.Scanner;

public class Variables {

	public static void main(String[] args) {
		// PART A
		System.out.println("PART A");
		double a=10.11;
		double b=20.22;

		
		double sum, sub, mult, div;
		
		sum= a+b;
		sub= b-a;
		mult=a*b;
		div= b/a;
		
		System.out.println("The sum of " +a+ " and " + b+ " is " + sum+".");
		System.out.println("The sub of "+ b+ " and "+ a+ " is " + sub+".");
		System.out.println("The mult of " + a+ " and " + b+ " is " + mult+ ".");
		System.out.println("The div of " + b+ " and " + a+ " is " + div+ ".");
		System.out.println(" ");
				
		//PART B
		System.out.println("PART B");
		
		double sq=Math.sqrt(3.9);
		System.out.println("Square root of 3.9 is " +sq);
		
	System.out.println(" ");

// PART C
	System.out.println("PART C");

Scanner in=new Scanner(System.in);

int S1=in.nextInt();
int S2=in.nextInt();
int area = S1*S2;// creating Area
int perimeter= 2*(S1+S2);// creating Perimeter

System.out.println("Area"+ S1*S2);
System.out.println("Perimeter"+ (2*(S1+S2)) );
				

	}

}
