package com.syntax.class05;

import java.util.Scanner;

public class Homework5 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter your birth month number");
		int month=scan.nextInt();
		
		if (month>=3 && month<=5) {
			System.out.println("You were born in Spring");
		}else if (month>=6 && month<=8) {
			System.out.println("You were bornin in Summer");
		}else if (month>=9 && month<=11) {
			System.out.println("You were born in Fall");
		}else { 
			System.out.println("You were born in Winter");
		
		
		
		}
	}

}
