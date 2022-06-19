package com.syntax.class04;

public class Donor {

	public static void main(String[] args) {
		// Part 2

		int eligible = 11;
		int weight = 111;

		if (eligible > 18) {
			if (weight>110) {
				System.out.println("You are able to donate blood");
			}else { System.out.println("We cannot accept such a patient");
			}

		} else if (eligible == 18) {
			if (weight>110) {
				System.out.println("You are able to donate blood");
			}else {System.out.println("We cannot accept such a pt");
			}
		}

		else
			System.out.println("You are not eligible to donate blood");

	}

}
