package com.syntax.class06;

public class EnhancedLargestNumber {

	public static void main(String[] args) {
		
		int num1=200;
		int num2=20;
		int num3=200;
		int large = 0;
		
		/*compiler can initialize variables to it's default values
		 * int------>0
		 * double--->0.0
		 * boolean -> false
		 * String---> null
		 * char ---->0 (maybe?)
		 * float --->0.0f (maybe?)
		 */

		if (num1 > num2 || num1 > num3) {
			large=num1;
		}else if ( num3 > num1 || num3 > num2) {
			large=num3;

		}else if (num2 > num1 || num2 > num3) {
			large=num2;

		}else {
			System.out.println("All numbers are equal");
			
		}
		if (large !=0 ) { 
		System.out.println("The largest number is "+large);
		
	}}}
