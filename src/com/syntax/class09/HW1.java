package com.syntax.class09;

public class HW1 {

	public static void main(String[] args) {
		// Create an array of cars and store 6 elements into it. 
		//Using 2 different loops print all values from the array.
		

		String[] cars= {"Ford", "Toyota", "Lexus", "BMW", "Audi"}; //0, 1, 2, 3
		for (String c1:cars) {
			System.out.print(c1+" ");
		}System.out.println();
		
		for(int c=0; c<cars.length; c++) {
			System.out.print(cars[c]+" ");
		}
		
	}}
