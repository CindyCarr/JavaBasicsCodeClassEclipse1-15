package com.syntax.reviewclass04;

public class AllElementsFrom2DArray {

	public static void main(String[] args) {
		// PRINT ALL ARRAY
		
		int [][] numbers={
				{10, 20, 30, 40},
				{1, 2, 3, 4},
				{9, 8, 7, 6}
				
		};
	//OUTER LOOP ITERATES OVER ROWS
		//INNER LOOP ITERATES OVER COLUMNS
		for (int row=0; row<numbers.length; row++) {
			for(int col=0; col < numbers[row].length; col++) {
			
			System.out.print(numbers[row] [col]+" ");
			}
			System.out.println();
	}

}}
