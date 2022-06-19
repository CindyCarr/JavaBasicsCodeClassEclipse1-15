package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {


		boolean vaccine=false;
		int dose=1;
		
		
		if(vaccine) {
			System.out.println("Let me check how many doses you have.");
			
			if (dose==1) {
				System.out.println("You need 1 more shot");
				
			}else if (dose==2) {
				System.out.println("You need your booster");
				
			}else if (dose==3) {
				System.out.println("You're fully vaccinated");
			}
		}
	System.out.println("--------------------------");
	
	String month="September";
	int day=6;
	
	if (month.equals("May"))	{
		System.out.println("Let me check what is today's date");
		if (day==8) {
			System.out.println("Today is Mother's Day");
		}
		
	}else if (month.equals("June"))	{
		System.out.println("Let me check what is today's date");
		if (day==19) {
				System.out.println("Today is Father's Day");
			}
	}else if (month.equals("July")) {
		System.out.println("Let me check today's date");
		if (day==4) {
			System.out.println("Today is Independence Day");
		}
	}else if (month.equals("September")) {
		System.out.println("Let me check the date");
		if (day==6) {
			System.out.println("Today is my birthday");
		}
	}else if (month.equals("October")) {
		System.out.println("Let me check the date");
		if (day==25) {
			System.out.println("Today is Halloween");
		}
	}else if (month.equals("December")) {
		System.out.println("Let me check the date");
		if (day==25) {
			System.out.println("Today is Christmas");
		}
		}
	}
		
		

	}
