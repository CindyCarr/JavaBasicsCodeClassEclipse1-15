package com.syntax.class08;

public class DoWhileSecretNumber {

	public static void main(String[] args) {


		for (int i=1; i<=3; i++) {
			System.out.print(i+" "); 		//outer loop controls inner loop
			
			for (int y=1; y<=2; y++) {	//inner loop depends on the outer loop
				System.out.print(y+" ");
				
				System.out.println(" ");
			}
			
			
			
		}
		
		
		
		

	}

}
