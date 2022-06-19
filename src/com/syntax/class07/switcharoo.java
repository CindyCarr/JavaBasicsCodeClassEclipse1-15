package com.syntax.class07;

import java.util.Scanner;

public class switcharoo {

	public static void main(String[] args) {
		
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter 2 numbers");
		
		double x=input.nextDouble();
		double y=input.nextDouble();
		
		System.out.println("please enter operator");
		char 'op'=input.next()charAt(0);
		double result=0;
		
		
		switch (op) {
		case '*':
			result= x*y;
			break;
		case '/':
			result x/y;
			break
		case '+':
			result=x+y;
			break;
		case '-':
			result=x-y;
			break;
		default:
			System.out.println("Invalid");
		}System.out.println(x+" "+ op+""+y"="+result);

	}

}
