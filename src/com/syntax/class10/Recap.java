package com.syntax.class10;

public class Recap {

	public static void main(String[] args) {


		String[] disney= {"Elsa", "Shreck", "Goofy", "Mulan", "Tom & Jerry"};
		System.out.println("All elements using regular for loops ---------------");
		
		// to get all elements from an array
		
		for (int i=0; i<disney.length; i++) {
			if(disney[i].equalsIgnoreCase("Shreck")) {
				
			}else {
				System.out.print(disney[i]+" ");
			}
		}
		System.out.println();
		System.out.println("All elements using regular for loop ---------------");
		
		for(String character:disney) {
			if (character.equalsIgnoreCase("Mulan")) {
				continue;
			}else {
				System.out.print(character + " ");
			}
		}
		
		

	}

}
