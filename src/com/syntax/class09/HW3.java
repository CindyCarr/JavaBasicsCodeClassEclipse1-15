package com.syntax.class09;

public class HW3 {

	public static void main(String[] args) {
		//Create an array to store double values and then print all elements using 2 different loops
		
		
		
		
		int [] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for (int i=0; i<num.length; i++) {
			System.out.print(num[i]+" ");
		}System.out.println();
		
		for (int n:num) {
			System.out.print(n+" ");
			
		}
	}

}
