package com.syntax.class08;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {
		// Write a program that reads a range of integers (start and end point), provided by a user and then from that range prints the sum of the even and odd integers
		
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter 2 numbers");
		int a=input.nextInt();
		int b=input.nextInt();
		int se=0;
		int so=0;
		
		for (int i=a; i<=b; i++) {
			if (i%2==0) {
				se+=i;
		}else {
			so+=i;
		}}
		System.out.println("Sum of all even numbers is "+se);
		System.out.println("Sum of all odd numbers is "+so);
		
		
		
		
		
		
		
		
		
		
	}

}
