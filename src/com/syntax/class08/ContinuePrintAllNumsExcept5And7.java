package com.syntax.class08;

public class ContinuePrintAllNumsExcept5And7 {

	public static void main(String[] args) {
		
		
		//Print Numbers from 1 to 10 except 5 & 7
		
		for (int i=1; i<=10; i++) {
			if (i==5 || i==7) {
				continue;
			}
			System.out.print(i+" ");
		}

	}

}
