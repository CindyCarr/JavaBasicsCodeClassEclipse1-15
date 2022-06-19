package com.syntax.class04;

public class IfElseIf {

	public static void main(String[] args) {
		/* You can use If Else If when you want to 
		 * declare 2 numbers and verify which one is the largest
		 */

		
		int num1=20;
		int num2=20;
		
		if(num1>num2) {
			System.out.println(num1+" is larger than "+num2);
			
		}else if (num2>num1){
			System.out.println(num2+" is the larger than "+num1);
			
		}else {
			System.out.println(num1+" is equal to "+num2);
		}
		
		
		System.out.println("-------------------------------------");
		
		//The moment Java finds a true condition ---> it executes that block & exits the entire statement
		
		int day=7;
		
		if (day==1) {
			System.out.println("Monday");
		}else if(day==2) {
			System.out.println("Tuesday");
		}else if(day==3) {
			System.out.println("Wednesday");
		}else if (day==4) {
			System.out.println("Thursday");
		}else if (day==5) {
			System.out.println("TGI...Friday!!!");
		}else if(day==6) {
			System.out.println("Saturday");
		}else if (day==7) {
			System.out.println("Sunday");
			System.out.println("Happy Mother's Day");
		}
		
		
	}

}
