package com.syntax.class08;

public class ForLoopSumOfEvenAndOddNumbers {

	public static void main(String[] args) {
		
		// Write a program to find the sum of all even and off numbers from 1 to 70
		
		int sum1=0;
		 for (int i=1; i<=70; i++) {
			 if (i%2==0) {
			 sum1+=i;
		 }}
		 System.out.println("Sum of all even = "+sum1);
		 int sum2=0;
		 
		 for (int i=1; i<=70; i++) {
			 if (i%2!=0) {
				 sum2+=i;
			 }}
		 System.out.println("Sum of all odds= "+sum2);
		 
		//Another way - THIS IS EASIER
		 
		 int sumEven=0;
		 int sumOdd=0;
		 
		 for (int i=1; i<=70; i++) {
			 if (i%2==0) {
				 sumEven+=i;
			 }else {
				 sumOdd+=i;
			 }}
		 
		 System.out.println("Sum of all even numbers is "+sumEven);
		 System.out.println("Sum of all off numbers is "+sumOdd);

}
}