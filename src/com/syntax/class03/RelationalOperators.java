package com.syntax.class03;

public class RelationalOperators {

	public static void main(String[] args) {
		// >, <, >=, <=, ==, !=
		
		
		int num1=20;
		int num2=22;
		
		System.out.println(num1>num2); //false)
		System.out.println(num1<num2); //true);
		System.out.println(num1 !=num2); //true
		
		System.out.println(num1==num2); //no=false
		System.out.println(num1=num2); //22
		
		System.out.println(num1==num2); //true
		
		boolean result=100>200; //is 100 is greater than 200
		System.out.println(result); //false
		
		int result1=100+200;
		System.out.println(result1); //300
		
		String result2="Emre"+10; //Emre1010
		
		System.out.println(result2+10);
		
		int num3=10;
		int num4=11;
		result=num3==num4;//checking if num3 is equal to num4
		System.out.println(result);//false
		
		result=num3!=num4; //checking if num3 is NOT equal to num4
		System.out.println(result); //true
	}

}
