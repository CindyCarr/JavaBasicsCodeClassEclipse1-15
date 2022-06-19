package com.syntax.class04;

import java.util.Scanner;

public class ScannerHomeworkPartTwo {

	public static void main(String[] args) {
		// Part2
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter a number");
		int num1=input.nextInt();
		System.out.println(num1);
		
		System.out.println("Please enter a second number");
		int num2=input.nextInt();
		System.out.println(num2);
		
		if (num1>=num2){
		System.out.println(num1+" is the largest number");
			}else {System.out.println(num2+" is the largest number");
	}
		
			
	}}

	


