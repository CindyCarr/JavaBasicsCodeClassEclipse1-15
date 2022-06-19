package com.syntax.class06;

import java.util.Scanner;

public class SwitchString {

	public static void main(String[] args) {
		// lets ask a user where they are from
		// based on the country we will define favorite food
	
	Scanner scan=new Scanner(System.in);
	
	
	System.out.println("What Country are you from?");
	String country=scan.nextLine();
	
	
	String food;
	
	switch (country.toLowerCase()) {
	
	case "mexico":
		food="tacos";
		break;
	case "peru":
		food="Lomo Saltado";
		break;
	case "canada":
		food="Poutine";
		break;
	case "usa":
		food="Cheesburger";
		break;
	case "turkey":
		food="Lahmacun";
		break;
	case "pakistan":
		food="Pati Chai";
		break;
	case "egypt":
		food="Koshary";
		break;
	default:
		food="unknown";
		
	}
	System.out.println("If you're from "+country+" you're favorite food is "+food);
	
	
	
	
	
	
	
	
	
	}

}
