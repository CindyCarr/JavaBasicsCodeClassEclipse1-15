package com.syntax.class05;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("How many years have you worked with this company");
		int years=scan.nextInt();
		
		System.out.println("What is your annual salary");
		int salary=scan.nextInt ();
		
		if (years>=5 && salary>50000) {
			System.out.println("You are eligible for a $5000 bonus");
		}else if (years>=5 && salary<=50000) {
			System.out.println("You are eligible for a $3000 bonus");
			
		
		
		}else {
		System.out.println("You are not eligible for a bonus");
		}
	
	
	}

}
