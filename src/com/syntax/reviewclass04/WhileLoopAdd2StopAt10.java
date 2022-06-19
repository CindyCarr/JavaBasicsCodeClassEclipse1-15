package com.syntax.reviewclass04;

import java.util.Scanner;

public class WhileLoopAdd2StopAt10 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		int num=0;
		while (num!=10) {
		System.out.println("Enter a value");
		num=input.nextInt();		
		System.out.println(num+2);
	
		}		
		input.close();
		
		
		
	}

}
