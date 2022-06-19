package com.syntax.class05;

public class LogicalNot {

	public static void main(String[] args) {
		//Logical Not !
		
		boolean boo=!true; //(not true) =false
		boolean boo1=!false; //(not false) = true
		
		System.out.println(boo);
		System.out.println("--------");
				
// if there is no traffic ---> I will get to work on time
		
		boolean traffic=true;
		
		if (!traffic) {
			System.out.println("I will get to work on time");
		}else if (traffic) {
			System.out.println("I will be late");
		}
		System.out.println("-------------");
				
		String name="Cindy";
		
		if (!name.equals("Cindy")) {
			System.out.println("You can't sit with us");
		}else if (name.equals("Cindy")) {
			System.out.println("Take a seat");
		}
		
		
	}

}
