package com.syntax.reviewclass04;

public class MoreEx {

	public static void main(String[] args) {

int [][] nums= {
		{1, 2, 3, 4, 5},
		{199, 300, 588, 700},
		{1900, 4578, 98787}

};
for (int i=0; i<nums.length; i++) {
	for (int j=0; j<nums[i].length; j++) {
		System.out.print(nums[i][j]+" ");
		}
	System.out.println();
	
	//Enhanced Loop
	System.out.println();
	for (int [] num:nums) {
		
		for (int n:num) {
		System.out.print(n+" ");
	}
	
	
	
	
	
	
	
	
	
	
	}
}
}}

