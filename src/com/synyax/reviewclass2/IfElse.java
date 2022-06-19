package com.synyax.reviewclass2;

public class IfElse {

	public static void main(String[] args) {
		
		
		// whenever we use primitive data types like bte, short, int, long. float. double, char, boolean
		// we use ==
		// whenever we use non-primitive data types we use.equals method String
		
		
		String user="Asghar";
		String password="pass123";
		
		
		if(user.equals("Ashghar") && password.equals("pass123")) {
			System.out.println("Welcome back to Syntax");
		}else { 
			System.out.println("username or password is not corect");
		}
	}

}
