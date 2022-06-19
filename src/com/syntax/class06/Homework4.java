package com.syntax.class06;

import java.util.Scanner;

public class Homework4 {

	public static void main(String[] args) {

Scanner input=new Scanner(System.in);






System.out.println("Is there a sale?");
String reply=input.nextLine();

if  (reply.equalsIgnoreCase("No")) {
	
	System.out.println("You're not going shoppping!");
	
}else if (reply.equalsIgnoreCase("yes")) 
	System.out.println("What item do you want to buy?");
	
	String item=input.next();
	
	System.out.println("What is the price?");
	int price=input.nextInt();
	
	int saleprice = 0;
	
	switch (saleprice) {
	case 1:
		saleprice=(price-(10 % price));
	
		break;
	case 2:
		saleprice=(price-(20 % price));
		break;
	case 3:
		saleprice=(price-(30 % price));
			break;
	case 5:
		saleprice=(price-(50 % price));
		break;
	
}
		System.out.println("After discount the price of the "+item+" is reduced from "+price+" to "+saleprice);







	}
		}

	


