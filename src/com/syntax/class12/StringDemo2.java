package com.syntax.class12;

public class StringDemo2 {
    public StringDemo2() {
    	
    }

public static void main(String[] args) {
        String firstName = "Adem";
        String lastName = " jones";
        String fullName = firstName + lastName;
        String fullName2 = firstName.concat(lastName);
        System.out.println(fullName2);
        System.out.println(fullName);
        String name = " ";
        System.out.println(name.isEmpty());
        String captainAmerica = " ne   ver ";
        System.out.println(captainAmerica.trim());
    
    
    
    
    }
    
}
