package com.syntax.class05;

import java.util.Scanner;

public class AssignmentTwo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Do you have a credit card?");
		boolean cc=scan.nextBoolean();
		
		if (cc==false) {
			System.out.println("Would you like to get a credit card?");
		}
		
		else {
			
			System.out.println("What is your balance?");
			 int bal=scan.nextInt();
			 if (bal>1000) {
				 System.out.println("Pay off immediatly");
			 }else {
				 System.out.println("You're able to spend more");
			 }
			
		}
	}

}
