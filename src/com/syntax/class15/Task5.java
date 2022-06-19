package com.syntax.class15;

public class Task5 {
	public Task5() {
		
	}
	String completezEmail(String firstName, String lastName, String emailType) {
		return firstName+lastName+"@"+emailType+".com";
	}

	public static void main(String[] args) {
Task5 task=new Task5();
System.out.println(task.completezEmail("Tara", "Sitara", "gmail"));

	}

}
