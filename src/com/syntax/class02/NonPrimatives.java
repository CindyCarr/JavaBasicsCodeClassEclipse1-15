package com.syntax.class02;

public class NonPrimatives {

	public static void main(String[] args) {
		
		String name="Cindy";
		String lastName="Mendoza";
				
		long phone=7035426874l;
	
		// xxx-xxx-xxxx

		String phoneNumber="703-542-6874";		
		String address="4520 Fidelity Ct";
		String city="Annandale";
		String state="VA";
		String zipCode="22003";
		
		int age =30;
		
	//shortcut for printing
		//type syso & press ctrl +space ----> hit enter
		/* when we want to attach a String to another String
		 * we can use +
		 */
			
	System.out.println(name+ " " + lastName);
	
	//Cindy lives in Annandale
	
	System.out.println(name+" lives in "+city);
	
	//Cindy is 30 years old
	
	System.out.println(name+" is "+ age + " years old.");
	
System.out.println(name+"'s phone number is "+phoneNumber);

/*Naming Conventions
 *
 */
	
	}

}
