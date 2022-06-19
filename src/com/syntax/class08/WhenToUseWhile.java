package com.syntax.class08;

import java.util.Scanner;

public class WhenToUseWhile {

	public static void main(String[] args) {
		/* Declare a secret number; you want to ask user to"Guess secret number"
		 * your code should keep asking to guess until user get secret number
		 * once user get the secret number->"You got it!"
		 */
		
		int s=17;
		int g;
		Scanner scan=new Scanner(System.in);
		
		
		do {
			System.out.println("Guess the secret number");
			g=scan.nextInt();
		}while (g != s);
		System.out.println("You got it!");
	}

}
