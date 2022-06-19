package com.syntax.class06;

import java.util.Scanner;

public class EnhancedCode {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter quiz grade");
		int quiz=scan.nextInt();
		
		System.out.println("Please enter mid term grade");
		int midTerm=scan.nextInt();
		
		System.out.println("Please enter final grade");
		int fin=scan.nextInt();
		
		int av=(quiz+midTerm+fin)/3;
		
		char grade;
		
		
		if (av>=90) {
			grade='A';
			
		}else if (av>=70 && av<90) {
			grade='B';
			
		
		}else if (av>=50 && av<70) {
			grade='C';
		
		}else {
			grade='F';
		
		}

		System.out.println("You are a "+grade+" student");
		
		if (grade=='A' || grade=='B') {
			System.out.println("You're doing great!");
		}else {
			System.out.println("You need to study more!");
		}
		
		
		
		
		
		
		
	}

}
