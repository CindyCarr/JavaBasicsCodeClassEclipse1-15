package com.syntax.class13;

public class Task3 {
	public Task3() {
		
	}

	public static void main(String[] args) {
		String father="Sameer";
		String mother="Taylor Marino";
		boolean boy=false;
		String firstHalf;
		String secondHalf;
		if (boy) {
			firstHalf=mother.substring(0, mother.length()/2);
			secondHalf=father.substring(father.length()/2);
			System.out.println(firstHalf.trim()+secondHalf.trim());
		}else {
			firstHalf=father.substring(0, father.length() /2);
			secondHalf=mother.substring(mother.length()/2);
			System.out.println(firstHalf.trim()+secondHalf.trim());
		}

	}

}
