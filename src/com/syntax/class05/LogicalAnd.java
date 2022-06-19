package com.syntax.class05;

public class LogicalAnd {

	public static void main(String[] args) {
/* Logical Operators
 * 
 * AND &&
 * TRUE && TRUE -----> TRUE
 * TRUE && FALSE ----> FALSE
 * FALSE && TRUE ----> FALSE
 * FALSE && FALSE ---> FALSE
 * 
 * 
 * OR ||
 */

		boolean job=true;
		double salary=750000;
		
		if (job && salary>=100000) {
			System.out.println("I'm super duper happy");
			
			}
System.out.println("-----------------------");


boolean study=true;
boolean homework=true;
boolean practice=true;

if (study && homework && practice) {
	System.out.println("You will succeeed in the course");

		}else {
			System.out.println("You will struggle");
		}
System.out.println("----------------------------");

/*Write a program to find largest number amoung 3 numbers using nest && 
 * provided by a user (numbers must be distinct
 */




int num1=65;
int num2=66;
int num3=23;

if (num1 > num2 && num1 > num3) {
	System.out.println("The largest number is "+ num1);
	
} else if (num3 > num1 && num3 > num2) {
	System.out.println("The largest number is "+num3);
} else if (num2 > num1 && num2 > num3) {
	System.out.println("The largest number is "+num2);
}

int num10=20;
int num20=10;
int num30=22;

if (num10 > num20 || num10 > num30) {
	System.out.println("The largest number is "+ num10);
}else if ( num30 > num10 || num30 > num20) {

}else if (num20 > num10 || num20 > num30) {
	System.out.println("Th largest number is " + num20);
}
	

	}

}
