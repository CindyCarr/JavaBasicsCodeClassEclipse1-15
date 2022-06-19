package com.syntax.class04;

import java.util.Scanner;

public class ScannerHomework {

	public static void main(String[] args) {
		// PART 1
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter your 1st name");
		String firstName=input.next();
		System.out.println(firstName);
		
		System.out.println("Please enter your last name");
		String lastName=input.next();
		System.out.println(lastName);
		
		System.out.println("Please enter the state where you live");
		String state=input.next();
		System.out.println(state);
		

	}

}
