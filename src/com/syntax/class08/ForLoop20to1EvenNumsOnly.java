>=package com.syntax.class08;

public class ForLoop20to1EvenNumsOnly {

	public static void main(String[] args) {
		// Print Even Numbers from 20 to 1
		
		//1st way
		
		for (int a=20; a>=1; a-=2) {
			System.out.print(a+" ");
		}
System.out.println(" ");

		//2nd way
		
		for(int m=20; m>=1; m--) {
			if (m%2==0) {
				System.out.print(m+" ");
			}
		}
	
	
	
	
	}
}
