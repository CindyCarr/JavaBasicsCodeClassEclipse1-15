package com.syntax.class06;

import java.util.Scanner;

public class Homework3Switch {


		//switch method
		
		public static void main(String[] args) {
			Scanner input=new Scanner(System.in);
			
			System.out.println("Please enter a number");
			int num1=input.nextInt ();
			
			System.out.println("Please enter a operator");
			char op=input.next().charAt(0);
			
			System.out.println("Please enter another number");
			int num2=input.nextInt();
			
			int answer = 0;
			
			
			
			switch (op) {
			
			case '+':
				answer=(num1+num2);
				break;
			case '-':
				answer=(num1-num2);
				break;
			case '/':
				answer=(num1/num2);
				break;
			case '*':
				answer=(num1*num2);
		}
			System.out.println("The result is "+answer);

		
		}

}
