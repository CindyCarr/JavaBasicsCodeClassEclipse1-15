package com.syntax.class09;

public class HW4 {

	public static void main(String[] args) {
		//  Create an array on integers and calculate the sum of all elements in an array
		
		int  num[]= {10, 20, 30, 40, 50};
		int sum=0;
		for (int i=0; i<num.length; i++) {
			sum=sum+num[i];
		}System.out.print(sum);
		
	}

}
