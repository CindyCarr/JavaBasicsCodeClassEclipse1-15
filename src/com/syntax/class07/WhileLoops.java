package com.syntax.class07;

public class WhileLoops {

	public static void main(String[] args) {
		/*  Loops - ir repeats a block of code (aka controls flow statement)
		 * 
		 * what? statement that executes a block of code # of times based on condition
		 * 
		 * why? - eliminates code redundancy
		 * 
		 * how?
		 * 
		 * 
		 * ex: if I wants to say "hi" 5 times I'd have to do syso "hi" 5 times
		 * instead now  we can do:
		 * while
		 * do while
		 * for loop
		 * enhanced for loop/advanced for loop/for each loop
		 * 
		 * while loop- repeats block of code based on condition
		 */

int time=10;

if (time<12) {
	System.out.println("Morning"); //print 1 time
	
	System.out.println("-------------------");
	
	
	
}
while(time<12) {
	System.out.println("Morning"); //infinite loop
	time++; // adds +1 (making morning print twice)
}

System.out.println("Here");
		
		
		
	}

}
