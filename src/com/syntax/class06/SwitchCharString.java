package com.syntax.class06;

public class SwitchCharString {

	public static void main(String[] args) {
		
		char choice='N';
		String meaning;
		
		//Variable and matching cases MUST BE of the same type
		// switch doesn't allow duplicate cases
		
		switch(choice) {
		
		case 'Y':
			meaning="Yes";
			break;
		case 'M':
			meaning="Maybe";
			break;
		case 'N':
			meaning="No";
			break;
		default:
			meaning="Unknown";
			
		}
		
		System.out.println(meaning);
		

	}

}
