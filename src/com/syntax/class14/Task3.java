package com.syntax.class14;

public class Task3 {
	public Task3() {
		
	}

	public static void main(String[] args) {
		
		String str="Is it saturday?: Is it raining? Do we have a Java class today? I love Java. We go to park today.";
		System.out.println(str.split("[?.!]").length);
	}

}
