package com.syntax.class06;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		

		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter your grade. Ex: A, B, C..");
		char grade=input.next().charAt(0);
		
		
		String note;
		
		switch (grade) {
		
		case 'A':
			note="Excellent";
			break;
		case 'B':
			note="Good";
			break;
		case 'C':
			note="Average";
			break;
		case 'D':
			note="Bad";
			break;
		default:
			note="Not Acceptable";
		
		}
		
		System.out.println(note);
		
		
		
		
	}

}
