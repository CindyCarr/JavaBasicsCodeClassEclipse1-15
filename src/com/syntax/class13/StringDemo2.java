package com.syntax.class13;

public class StringDemo2 {
	public StringDemo2() {
}

	public static void main(String[] args) {
		String str="sfkafdb18247t8725KSNDKASD!@#$((%^^";
		System.out.println(str);
		System.out.println(str.replaceAll("[0-9]","#"));
		System.out.println(str.replaceAll("[a-z]","#"));
		System.out.println(str.replaceAll("[A_Z]","#"));
		System.out.println(str.replaceAll("[a-za-z]","#"));
		System.out.println(str.replaceAll("[A-Za-z0-9]","#"));
		System.out.println(str.replaceAll("[^a-z]","_"));
		System.out.println(str.replaceAll("[^A-Z]","*"));
		System.out.println(str.replaceAll("[^A-Za-z0-9]","*"));
		str="abcdefghijkl";
		System.out.println(str.replaceAll("[a-f]","*"));
		str="mnopqrstUVWXYZ!@#$%^&*";
		System.out.println(str.replaceAll("[^A-z]",""));
		
	}

}
