package com.syntax.class10;

public class AllElementsFrom2DArray {

	public static void main(String[] args) {
		String [] [] usa= {
				{"New York", "Albany", "Buffalo"},
				{"Los Angeles", "San Fransisco", "San Jose", "San Diego", "Redding"},
				{"Miami", "Orlando", "Niceville", "Tampa"},
				{"McLean", "Richmond", "Leesburg"}
		};
		System.out.println("Retrieve all values using for each loop");
		System.out.println();
		for (String[] state:usa) {
			for(String city:state)
			System.out.print(city+" ");
		}System.out.println();
	
	
	// System.out.println("Retrieve all values using for each loop");
	//outer loop iterates over rows
	//inner loop iterates over columns

	
	// for (int row=0); row<usa.length; row++) {
		// for(int col=0; col<usa[row][col]+" ");
	
	
	}	}


