package com.syntax.class10;

public class Assignment {

	public static void main(String[] args) {
		// Task1
		
		
		
		int [] num={10, 20, 30};
		
		int large=num[0];
		
		for (int i=1; i<num.length; i++) {
			if (num[i]>large) {
				large=num[i];
			}}
				System.out.println("The largest number is "+large);
			large=num[0];
			for (int nums:num) {
				if (nums>large) {
					large=nums;
				}
			}
		System.out.println("The largest number is "+large);
		

	}}

