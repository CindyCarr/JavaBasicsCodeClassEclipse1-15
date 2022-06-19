package com.syntax.class10;

public class ForLoopString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String [] disney={"Shrek", "Elsa", "Goofy", "Mulan", "Tom & Jerrry"};
System.out.println(disney[1]); //Elsa

for (int i=0; i<disney.length; i++) {
	System.out.print(disney[i]+" ");
}
System.out.println("");

	for (String character:disney) {
		if (character.equalsIgnoreCase("Mulan")) {
			System.out.println(character+" is my favorite character");
			continue;
			
		}else {
			System.out.print(character+" ");
		} 
			
		}
	}
	
	
	}

}
