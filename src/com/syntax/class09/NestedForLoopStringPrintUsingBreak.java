package com.syntax.class09;

public class NestedForLoopStringPrintUsingBreak {

	public static void main(String[] args) {


		for (int i = 1; i <= 5; i++) {
			System.out.println("Hello " +i);
			for (int y = 1; y <= 3; y++) {
			System.out.println("Bye "+y);
			break;
			}}
		
	}

}
