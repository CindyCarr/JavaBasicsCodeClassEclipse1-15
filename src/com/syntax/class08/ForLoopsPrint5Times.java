package com.syntax.class08;

public class ForLoopsPrint5Times {

	public static void main(String[] args) {

//Print "0" 5 times
		int sum=0;
		
		for (int i=1; i<6; i++) {
			
			System.out.print(sum+" "); // will print 0,1,3,6,10
			sum+=i;
			System.out.print(sum+" "); //will print 1,3,6,10,15
		}System.out.println();
		System.out.println(sum); //15
				
				

	}

}
