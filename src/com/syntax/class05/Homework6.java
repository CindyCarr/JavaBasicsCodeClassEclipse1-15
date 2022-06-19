package com.syntax.class05;

import java.util.Scanner;

public class Homework6 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter quiz grade");
		int quiz=scan.nextInt();
		
		System.out.println("Please enter mid term grade");
		int midTerm=scan.nextInt();
		
		System.out.println("Please enter final grade");
		int fin=scan.nextInt();
		
		int av=(quiz+midTerm+fin)/3;
		
		if (av>=90) {
			System.out.println("A");
		}else if (av>=70 && av<90) {
			System.out.println("B");
			
		}else if (av>=50 && av<70) {
			System.out.println("C");
		}else {
			System.out.println("F");
		}

		// if you are an A or B student -----> you're doing great
		//otherwise ---------> please try to study more
		
		
		
		
	}

}
