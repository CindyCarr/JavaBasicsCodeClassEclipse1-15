package com.syntax.class05;

import java.util.Scanner;

public class AssignmentTwoIgnoreCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Do you have a cc, yes or no");
		String answer=scan.next();
		
		if (answer.equalsIgnoreCase("no")) {//if (answer.equalsIgnoreCase("no"); ///equalsIgnoreCase it doesn't matter if you type no or No
				System.out.println("here's a cc");
		
		}else {
			System.out.println("What ur bal?");
			int bal=scan.nextInt();
			
			if (bal>1000) {
				System.out.println("Pay");
			}else {
				System.out.println("spend");
			}
		}
	
	
	
	
	}

}
