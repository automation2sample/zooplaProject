package com.Learn.Java;

public class StringInJava {

	public static void main(String[] args) {
		
	String country = "I love United States Of America. I live here. But I am not from here. But still i dont care.";
	
	int counter = 0;
	
	for(int i=0; i<country.length(); i++) {   //0 1 2 3 4 ---- 71
		
		if(country.charAt(i) == 'a') {
			System.out.println(country.charAt(i));
			counter++;
		}
		
	}

	System.out.println(counter);
	
	
	

		
		

	}

}
