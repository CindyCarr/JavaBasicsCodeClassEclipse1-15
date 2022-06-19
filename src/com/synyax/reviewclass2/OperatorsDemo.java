package com.synyax.reviewclass2;

public class OperatorsDemo {

	public static void main(String[] args) {
		// Arithmatic Operators in Java + - / * %
		//Logical Operators && == != >= <= > < (true or false) 
	
		int num=10;
		int num2=10;
		System.out.println(num+num2);//addition
		System.out.println("---------");
		System.out.println(num>num2); //num>num2=f or num=num2=>t
		System.out.println("---------");
		
		//Division with whole # vs doubles
		//Whole is -infinity to positive infinity
		System.out.println(Long.MAX_VALUE);//gives the max # of long
		System.out.println(Long.MIN_VALUE); //gives min range
		System.out.println("----------");
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		System.out.println("----------");
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println("---------");
		System.out.println(num/num2);
		System.out.println(num%num2);
		System.out.println("--------");
		System.out.println(10/3);
		System.out.println(10%3);
		System.out.println("--------");
		System.out.println(10.0/3);// dividing double to int
		System.out.println((int)10.0/3);//forcing Java to switch answer to int AKA "widening"
		System.out.println(10.0*3);
	
	
	
	
	
	}

}
