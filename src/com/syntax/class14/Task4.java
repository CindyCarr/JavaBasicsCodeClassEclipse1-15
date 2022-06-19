package com.syntax.class14;

public class Task4 {
	public Task4() {
	}
	
	public static void main(String[] args) {
		String str="This is the sentence I want to reverse";
		String [] arr=str.split(" ");
		String[] var3=arr;
		int var4=arr.length;
		
		for (int var5=0;var5<var4; ++var5) {
			String s=var3[var5];
			System.out.print(new StringBuilder(s).reverse()+" ");
		}
		System.out.println();
	}

}
