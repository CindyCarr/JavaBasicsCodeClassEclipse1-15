package com.syntax.class05;

public class LogicalOr {

	public static void main(String[] args) {
		/* Logical Or || 
		 * 
		 * true || true -----> TRUE
		 * true || false ----> TRUE
		 * false || true ----> TRUE
		 * false || false ---> FALSE
		 * 
		 */
		
		
		
		/* Tuesday and Wednesday -> Manual Testing
		 * Thursday --------------> Review
		 * Saturday & Sunday -----> Java
		 */
		
		String day="Monday";
		
		if (day.equals("Monday") || day.equals("Friday")) {
			
			System.out.println("I have no class");
			
		}else if (day.contentEquals("Tuesday") || day.equals("Wednesday")) {
			System.out.println("I have Manual Testing class");
		
		}else if (day.equals("Thursday")) {
			System.out.println("I have review class");
		
		}else if (day.equals("Saturday") || day.equals("Sunday")) {
			System.out.println("I have Java class");
		
		}
		
		
		
		
		

	}

}
