package com.syntax.class02;

public class Task {
//Part A
	public static void main(String[] args) {
		String name="Cindy";
		String lastName="Mendoza";
		char grade='A';
		String city="Annandale";
		String state="VA";
		String phoneNumber="571-451-5833";
		
		
System.out.println("My name is "+name+" and my last name is "+lastName+".");
System.out.println("I am a "+grade+ " student.");
System.out.println("I live in "+city+ ","+state+".");
System.out.println("And my phone number is "+phoneNumber+".");

//PartB
	city="Miami";
	state="Fl";
	phoneNumber="954-264-7856";
	grade=12;
			
System.out.println("My name is "+ name+" and I moved to a new city "+city+" and a new state "+state+".");
System.out.println("My new phone number is "+phoneNumber+".");

/* Rules for identifiers
 * 1. no spaces
 * 2. no keywords
 * 3. cant start w/ numbers (#'s can be used after alpha character)
 * 4. cant hacve special characters (except _,$ )
 */

	}

}
