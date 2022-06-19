package com.syntax.class07;

public class OddNumberDecrement {

	public static void main(String[] args) {
			
		
		//print only odd numbers from 100 to 1
		
		int n=100;
		while(n>=1) {
			if ((n%2)!=0) 
				System.out.print(n+" ");
				n--;
			
		}
		
		System.out.println(" ");
		
		// another way
		System.out.println();
		int y=99;
				while (y>=1) {
			System.out.print(y+ " ");
			y-=2;
		}
				
				
	}

}
