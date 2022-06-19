package com.syntax.class08;

public class HW3 {
	
		public static void main(String[] args) {
		
			//Using nested loop, create a 24 hour clock that will display 2 digits for an hour and 2 digits for a minute.
		
			for(int h=1; h<=24; h++) {
					if (h<=24) {
					
						
				
					
					for (int m=0; m<60; m++) {
						
							if (m>60) {
								continue;
							}
							System.out.println(h+":"+m);
					}
				}
					
					
					
			}
	
	

}}
