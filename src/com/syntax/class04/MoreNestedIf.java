package com.syntax.class04;

public class MoreNestedIf {

	public static void main(String[] args) {
		/*We need ti check if repl was cinoketed
		 * 
		 * if repl is completed we want to see if you did more than 15 ---> great job
		 * if you did more than 10 ----> did good
		 * if less than 10 ----> try to complete all assignments
		 */

		Boolean repl=true;
		int assignments=16;
		
		if (repl) {
			System.out.println("How many assignments have you done");
			if (assignments>15) {
				System.out.println("You did a great job");
				
			}else if (assignments>10) {
				System.out.println("You did good");
			
			}else { 
				System.out.println("Try to complete all your assignments");
			}
			
			
		}else {
			System.out.println("You should complete your homework");
		}
	}

}
