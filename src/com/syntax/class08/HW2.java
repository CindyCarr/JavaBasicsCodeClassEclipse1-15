package com.syntax.class08;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
		
		//Write a program to ask a user to enter item they want to buy and the price of that item. 
		//Every time user enters money, accumulate the amount and tell the user how much is left to pay off. 
		//If user give more money program should return a change. 
		//Whenever a user done with payments program should say “Thank you for shopping!”
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter item you wish to purchase");
		String item=input.nextLine();
		System.out.println("Enter price of "+item);
		double price=input.nextDouble();
		double paid;
		double sum=0;
		
		
		
		do {
			System.out.println("How much are you paying");
			paid=input.nextDouble();
			sum+=paid;
				if(sum-price<0) {
				System.out.println("You still owe "+(price-sum));
			}
			
			
		}while (sum<price);
		
		if(sum>price) {
		System.out.println("Thank you for shopping. Your change is "+(sum-price));
			
		}else if (sum==price) {
			System.out.println("Thank you for shopping");
	
		}

	}}