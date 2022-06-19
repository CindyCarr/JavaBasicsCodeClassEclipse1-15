package com.syntax.class08;

public class ForLoopOddNumsOnly20to50 {

	public static void main(String[] args) {
		// print 20-50 Odd Numbers Only
		
		//1st Way
		
		for (int i=21; i<=50; i+=2) {
			System.out.print(i+" ");
		}
		System.out.println(" ");

		//2nd Way
		
		
		for (int i=20; i<50; i++) {
			if (i%2 !=0) {
				System.out.print(i+" ");
			}
		}
	
	
	
	}

}
