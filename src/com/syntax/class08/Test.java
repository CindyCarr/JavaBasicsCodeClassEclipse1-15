package com.syntax.class08;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a value");
		
		for (int x=input.nextInt(); x>=0; x--) {
			System.out.print(x+" ");
		}
		

	}

}
