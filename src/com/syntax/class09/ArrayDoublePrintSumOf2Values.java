package com.syntax.class09;

public class ArrayDoublePrintSumOf2Values {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numbers[]=new int[3]; //needs to be 1 higher than the amount of values you have
		numbers[0]=10; //0
		numbers[1]=11;//1
		numbers[2]=12;//2
		System.out.println(numbers[2]+numbers[1]);
		
		//numbers[3]=13; during run time error -> 
		//ArrayIndexOutOfBoundsException
		// System.out.println(numbers[3]);
		//arrays are fixed in size
		// during runtime JAVA cannot increase or decrease a size of an array

	}

}
