package com.syntax.class03;

public class PrimitivesCasting {

	public static void main(String[] args) {
		//Casting in Java -->converting 1 type into another
		
		//Widening AKA Implicit Casting or Automatic Casting
		
		//ctrl+space --->auto complete
		
		int i=100;
		double d=100; //widening
		
		System.out.println(i); //100
		System.out.println(d); //100.00
		
		long l=1009878;
		
		
		//byte b=130; (can't do) error: cant convert from int to byte
		//int x=99.99 error: can't convert from double to int
		int x=(int)99.99; //narrowing - we do it manually (some info can be lost ex: decimals are lost
		System.out.println(x);
				
		byte b=(byte)130;
		System.out.println(b);
		
		//Type mismatch: can't convert from double to float
		float f=10.99f;
		double dd=9.99;
		
		double price=100;
		
		
		System.out.println(dd);
				
		
	}

}
