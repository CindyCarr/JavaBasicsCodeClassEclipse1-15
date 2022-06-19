package com.syntax.class07;

public class DoWhilePrint70To30 {

	public static void main(String[] args) {
		
		// print even #'s from 70 to 30
		
		int num3=70;
		
		do { 
			System.out.print(num3+" ");
			num3-=2; //68, 66, 64, etc
			
		}while (num3>=30);
	
		
		System.out.println(num3); //28

	

}}
