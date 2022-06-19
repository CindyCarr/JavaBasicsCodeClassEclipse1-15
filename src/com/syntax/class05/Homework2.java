package com.syntax.class05;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {

	Scanner scan=new Scanner(System.in);

	System.out.println("Please enter city");
	String city=scan.nextLine();
	
	System.out.println("Please enter temperature");
	int fer=scan.nextInt();
	
	int cel= 5 * (fer-32)/9;
	
	System.out.println("The temperature in "+city+" is "+cel);
	
		
	}

}
