package ch1;

import java.util.*;

public class Q1_IsUnique {
	
	public static boolean isUnique(String input){
		/*<--------- Strategy -----------
		 * 1. We need to make sure that every charcter in the string is unique
		 *  |--> by making sure that the alphabet (128 bit ascii table) is there only once,
		 *  	 we assure that the string is valid, else it fails to comply
		 */
		
		if(input.length() > 128)
			return false; // it has to be at max 128 unique characters
		
		char[] array = new char[128];
		
		for(int i = 0; i < input.length(); i++){
			char charToCheck = input.charAt(i);
			
			if(array[charToCheck]++ == 0){ 
			}
			else// we already encountred that character
				return false;
		}
		
		return true;
	}
	
	public static void main(String[] args){
		
		String[] stringsToTest = {"ascrfgy", "dswqPFD", "PpOoKk", "ooOO", "baby"};
		String result;
		for(String string : stringsToTest){
			
			result = (isUnique(string) ) ? "VALID" : "NOT VALID";
			System.out.println("The string \""+ string + "\" is " + result);
		}
		
	}
	

}
