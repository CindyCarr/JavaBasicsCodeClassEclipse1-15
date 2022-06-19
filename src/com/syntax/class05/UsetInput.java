package com.syntax.class05;

import java.util.Scanner;

public class UsetInput {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter first and last name");
		String nam1=scan.nextLine();  //capture String - nextLine prints multiple names
		System.out.println(nam1);
		
		System.out.println("Please enter middle name");
		String name=scan.next(); //capture String - next will print 1 word only
		System.out.println(name);
				
		System.out.println("Please enter age");
		int age=scan.nextInt(); //capture integer
		System.out.println(age);
		
		System.out.println("Please enter price");
		double price=scan.nextDouble(); //capture double
		System.out.println(price);
		
		System.out.println("Please enter boolean");
		boolean boo=scan.nextBoolean(); //capture boolean
		System.out.println(boo);
		
		System.out.println("Please enter character");
		char CHARACTER=scan.next().charAt(0); //capture 1 character only
		//J O H N							 //num in the charAt() will print out that letter only
		//^ ^ ^ ^							// ex charAt(3) prints N when John is written
		//0 1 2 3
		System.out.println(CHARACTER);
		
		System.out.println("Enter a long number");
		long longg=scan.nextLong();
		System.out.println(longg);
		
		
		
	}

}
