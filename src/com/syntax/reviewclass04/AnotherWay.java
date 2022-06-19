package com.syntax.reviewclass04;

public class AnotherWay {

	public static void main(String[] args) {

		String [][] usa= {
		{"New York", "Albany", "Buffalo"},
		{"Los Angeles", "San Fransisco", "San Jose", "San Diego", "Long Island"},
		{"Miami", "Orlando", "Niceville", "Tampa", "Jacksonville", "Palm Beach"},
		{"McLean", "Richmond", "Leesburg"}
		};
		System.out.println(usa[1][2]); //San Jose
		System.out.println("I want to go to "+usa[2][0]); //Miami
		System.out.println("Total # of 1D arrays in the USA = "+usa.length); //4
		//TOTAL AMOUNT OF ELEMENTS IN 1ST ARRAY
		int elem1array=usa[0].length;
		System.out.println("# of elements in 1st array = "+elem1array);
		//3 OF ELEMENTS IN 2ND ARRAY
		int elem2array=usa[1].length;
		System.out.println("# of elements in 2nd array = "+elem2array);
	}

}
