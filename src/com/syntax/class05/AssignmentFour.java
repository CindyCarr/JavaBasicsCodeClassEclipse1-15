package com.syntax.class05;

import java.util.Scanner;

public class AssignmentFour {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter day number");
		int day=scan.nextInt();
		
		if ((day>=1) && (day<=5)) {
			System.out.println("Weekday");
		}else if ((day>=6)&& (day<=7)) {
			System.out.println("Weekend");
		}else {
			System.out.println("invalid");
		}
	}

}
