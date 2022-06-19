package com.syntax.reviewclass04;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [][] usa= {
				{"New York", "Albany", "Buffalo"},
				{"Los Angeles", "San Fransisco", "San Jose", "San Diego", "Long Island"},
				{"Miami", "Orlando", "Niceville", "Tampa", "Jacksonville", "Palm Beach"},
				{"McLean", "Richmond", "Leesburg"}
				
				};
		
		for (String[] state:usa) {
			
			for (String city:state) {
				System.out.print((city+" "));
				
				
			}
		}
	}

}
