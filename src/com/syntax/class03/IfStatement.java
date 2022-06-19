package com.syntax.class03;

public class IfStatement {

	public static void main(String[] args) {
		/* Declare a variable
		 * If interest rate is more than 5 ---> I am not buying a house
		 */
		
		double mortgageRate=5.5;  //mortgage rate
		if (mortgageRate>5)	{ //I'm setting my condition which is 5
			System.out.println("I am not buying a house");
		}
		
		
		mortgageRate=4.5;
		
	if (mortgageRate>5) { //if condition is not true than it won't print statement
		System.out.println("I am not buying a house");
	}
		
	//declare 2 variables and check if num1 is bigger than num2
	
	int num1=99;
	int num2=10;
	
	if(num1>num2) {
		System.out.println(num1+ " is bigger than "+num2); //statement is true so it will appear when run
		
	int num3=100;
	if(num1>num3) {
		System.out.println(num1+" is bigger than "+num3); //statement is false so it will not appear when run
	}
		
		/* declare temperature
		 * if temp is higher than 75 ----> I will go for a walk
		 */
		int temp=89;
		if (temp>75) {
			System.out.println("I will go for a walk");
		}else { //otherwise - Code come to else {}
				//when condition is false
			System.out.println("I am going to study Java");
			
		}
	
		System.out.println("-------------------------");
		
		char gender='m';
		char gender1='f';
		
		
		if (gender=='f') {
			System.out.println("You like shopping");
		}else {
			System.out.println("You like watching sports");
		}
	
		
		System.out.println("---------------------------------------");
		
		String browser="chrome";
		
		if (browser.equals("chrome")) {
			System.out.println("All test cases will be exectuted on chrome");
			System.out.println("Reason - right browser");
		}else {
			System.out.println("I am not executing any test cases");
			System.out.println("Reason - wrong browser");
		}
		

		
	}
		
		
	}

}
