package com.syntax.class05;

import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {
		// Part 1
		
		Scanner scan=new Scanner(System.in);

		System.out.println("Enter age");
		int age=scan.nextInt();
		
		if (age>=18) {
			System.out.println("Licence issued");
		}
		else {
			
			System.out.println("Learner's permit issued");
		}
	}
	
	
	
	
	
	
	

}
