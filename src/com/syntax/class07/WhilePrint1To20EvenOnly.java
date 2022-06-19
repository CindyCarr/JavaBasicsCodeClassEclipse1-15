package com.syntax.class07;

public class WhilePrint1To20EvenOnly {

	public static void main(String[] args) {

		//print numbers from 1 to 20 but only even numbers
		//1st way
		System.out.println();
		 int e=2;
		 while (e<=20) {
			 System.out.print(e+" ");
			 e+=2; // or e=e+2
		 }
		 
		 //2nd way
		 System.out.println();
		 int f=1;
		 
		 
		 while (f<=20) {
			 
			 if(f % 2==0) {
			 System.out.print(f+" ");
			
			 
			}
		 f++;
		 
		 
}
		
		
		
		

	}

}
