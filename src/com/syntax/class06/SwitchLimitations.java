package com.syntax.class06;

public class SwitchLimitations {

	public static void main(String[] args) {
		/*Switch can work with byte, short, int, char, String
		 * 
		 * Switch has datatype limitations
		 * 
		 * Switch can't work with double, float, long or boolean
		 */

		double price=10;
		
		//switch (price) {----> won't work b/c it's double
		
		boolean hungry=true;
		//switch (hungry) {---> won't work b/c the value is too small only T or F
		
		char choice='Y';
		String meaning;
		
		//switch (choice) {
		
		//case 'Y' || 'y':	--->  won't work ||
		//	meaning='Yes';
		//	break;
		
		
		/*int day=5
		
		switch (day) {
		case >5:  --------------> won't work >,<,=
		*/			
		
		}
		
		
		
		
	}

}
