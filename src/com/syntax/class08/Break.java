package com.syntax.class08;

public class Break {

	public static void main(String[] args) {

boolean summer=true;

int temp=95;

while (summer) {
	System.out.println("It is hot");
	if (temp<80) {
		System.out.println("It is not hot anymore");
		break;
	}
	temp-=10;
}
		
		
	}

}
