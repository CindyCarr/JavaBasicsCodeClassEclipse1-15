package com.syntax.class02;

public class Homework {
	
	 public static void main(String[] args)	{
		 
			//to create a variable: I need a datatype & name
			// data type = byte		name=box 1 (or anything you want to name it)
			
			//Whole numbers
		 /*
		  * Box 1 - is a variable
		  * to create a variable we neeed 3 things; datatype & name
		  */
			byte box1=127;
			short box2=2022;
			int box3=76666;	// most frequently used
			long box4=45678909876543L; // long #'s need an "L' or "l" at the end to define its a long #
			
			//Decimal numbers
			float container=1.99F; //needs an "F" or "f" at the end to define is a float value
			double container2=89.99;
			
			// to represent 1 character
			char gender='m';
			char dollar='$';
			
			
			// to represent True or False (yes or no)	
			boolean hungry=true;
			boolean sleepy=false;
			
			//how to access values from variables?
			
			System.out.println(container2); //do not use "" to access variables
			
			//access & print values from all variables
		 System.out.println(box1);
			System.out.println(box2);
			System.out.println(box3);
			System.out.println(box4);
			System.out.println(container);
			System.out.println(container2);
			System.out.println(gender);
			System.out.println(dollar);
			System.out.println(hungry);
			System.out.println(sleepy);
			
			
			// string uses " "
			// char uses ' '
			
			int box5 = 900;
			System.out.println(box5);
			
			int year=2022; // create a variable and store value
			
			System.out.println(year);
			
			year =2023;
			System.out.println(year);
			
			
	 }

}
