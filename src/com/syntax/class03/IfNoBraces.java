package com.syntax.class03;

public class IfNoBraces {

	public static void main(String[] args) {
		// Without braces Java can identify only 1 statement per block
		
		// no curly braces
		
		String time="Morning";
		
		if (time.equals("Morning")) 
			
			System.out.println("Say Good Morning");
		else 
			System.out.println("Say Good Day");
			System.out.println("or say good evening");
			
			System.out.println("-----------------------");
		
			// With Curly Braces
			
			String time1="Evening";
			
			if (time.equals("Evening")) {
				
				System.out.println("Say Good Evening");
			}else { 
				System.out.println("Say Good Day");
				System.out.println("or say good night");
				
			}

	}

}
