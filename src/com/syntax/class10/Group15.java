package com.syntax.class10;

import java.util.Scanner;

public class Group15 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of elements in array");
		int el = input.nextInt();
		input.nextLine();
		
		String[] countries = new String[el];
		for(int i=0; i<el; i++) {
			System.out.println("Enter the name of country");
			countries[i]=input.nextLine();
		}
		
		String capital;
		for(int i=0; i<el; i++) {
			

	        switch (countries[i]) {
	            case "Mexico":
	                capital="Mexico City";
	                break;
	            case "Peru":
	                capital="Lima";
	                break;
	            case "Honduras":
	                capital="Tegucigalpa";
	                break;
	            case "Colombia":
	                capital="Bogota";
	                break;
	            case "El Salvador":
	                capital="San Salvador";
	                break;
	            case "Panama":
	                capital="Panama City";
	                break;
	            case "Chili":
	                capital="Santiago";
	                break;
	            case "Costa Rica":
	                capital="San Jose";
	                break;
	            case "Nicaragua":
	                capital="Managua";
	                break;
	            case "Brazil":
	                capital="Brasilia";
	                break;
	            case "Venezuela":
	        		capital="Caracas";
	        		break;
	        	case "Guatemala":
	        		capital="Guatemala City";
	        		break;
	        	case "Belize":
	        		capital="Belmopan";
	        		break;
	        	case "Argentina":
	        		capital="Buenos Aires";
	        		break;
	        	case "Ecuador":
	        		capital="Quito";
	        		break;
	        	case "Aruba":
	        		capital="Oranjestad";
	        		break;
	        	case "Uruguay":
	        		capital="Montevideo";
	        		break;
	        	case "Bolivia":
	        		capital="Sucre";
	        		break;
	            default:
	                capital="unknown";
			}
			System.out.println("The capital of the coutry "+countries[i]+" is "+capital);
		}input.close();
	}}
	        