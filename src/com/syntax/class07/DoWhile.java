package com.syntax.class07;

public class DoWhile {

	public static void main(String[] args) {

		//While loop 1st checks condition & only then executes block of code
		
				int num=1;
				
				while (num<=3) {
					System.out.print(num+ " ");
					num++;
				}
				System.out.println(" ");
		
		//do while 1st executes the code & only then checks the condition

		int num1=10;
		
		do { System.out.print(num1+" ");
		num1++;
		
		}while (num1<=3);
		
		
		
		System.out.println(" ");
		
		
		
		

	}

}
