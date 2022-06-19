package com.syntax.reviewclass04;

public class TwoDimensionalArray {

	public static void main(String[] args) {

		//long way
		
		int [][] numbers=new int [3] [4];
		////1 row
		numbers [0][0]=10;
		numbers [0][1]=20;
		numbers [0][2]=30;
		numbers [0][3]=40;
		
		//2 row
		numbers [1][0]=1;
		numbers [1][1]=2;
		numbers [1][2]=3;
		numbers [1][3]=4;
		
		//row3
		numbers [2][0]=9;
		numbers [2][1]=8;
		numbers [2][2]=7;
		numbers [2][3]=6;
		
		System.out.println(numbers [1][3]);
		System.out.println(numbers [0][1]);
		
		int rows=numbers.length; //gives #of 1d arrays
		System.out.println("numbers of rows = "+rows);
		
		int colof1row=numbers[0].length;
		System.out.println("Number of cols in 1st row "+colof1row);
	}

}
