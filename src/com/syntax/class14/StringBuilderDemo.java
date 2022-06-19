package com.syntax.class14;

public class StringBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s=new String ("hahahhaaa");
		System.out.println(s.toUpperCase());
		StringBuilder st=new StringBuilder("jajajaa");
		System.out.println(st.reverse());
		//String and StringBuilder are both classes that we can use to store and manipulate string characters
		//String is immutable and String builder is mutable
		//when we make a lot of changes to a String it creates multiple copies inside your memory and
		// b/c of this reason since every change a new variable is created

	}

}
