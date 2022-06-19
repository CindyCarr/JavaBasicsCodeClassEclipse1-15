package com.synyax.reviewclass2;

public class IfElseDemo5 {

	public static void main(String[] args) {


		double money=1000;
		boolean amIFree=true;
		
		if (true) {
			
			if (true) {
				System.out.println("Go watch a movie");
				
				if (false) {
					System.out.println("Go to work");
				}
			}else if (false) {
				if (true) {
					System.out.println("Go to Bora Bora");
					
					if (false) {
						System.out.println("Go to Hawaii");
					}
				}
			}
			
		}else {
			System.out.println("I'm so confused");
		}
	}

}
