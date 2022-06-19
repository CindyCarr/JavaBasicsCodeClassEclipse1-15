package com.syntax.class04;

public class Mortgage {

	public static void main(String[] args) {
		
		// Part 1
		
				boolean diploma=true;
				double gpa=3.5;
				
				if (diploma) {
					System.out.println("Congratulations!");
					if (gpa>3.5) {
						System.out.println("You are eligable for a scholarship");
					}else if (gpa==3.5) {
						System.out.println("You are eligable for a scholarship");
					}else if (gpa<3.5) {
						System.out.println("You should have studied harder");
					}
				
			}else {
				System.out.println("You should get a degree");
	}

}}
