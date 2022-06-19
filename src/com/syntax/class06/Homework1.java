package com.syntax.class06;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		 
		System.out.println("What country do you live in?");
		 String country=input.nextLine();
		 
		 String language;
		 
		 switch(country) {
		 
		 case "USA":
			 language="English";
			 break;
		 case "Ireland":
			 language="Irish";
			 break;
		 case "France":
			 language="French";
			 break;
		 case "Mexico":
			 language="Spanish";
			 break;
		 case "German":
			 language="French";
			 break;
		 case "Poland":
			 language="Polish";
			 break;
		 case "Scotland":
			 language="Scottish";
			 break;
		 case "Afganistan":
			 language="Dari";
			 break;
		 case "Egypt":
			 language="Arabic";
			 break;
		default:
			language="unknown";
			 	 
		 }
		System.out.println("In "+country+" they speak "+language);
		

	
	}
}
