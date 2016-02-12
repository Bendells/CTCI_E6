package ch1;

public class Q2_CheckPermutations {
	public static boolean checkPerm(String input1, String input2){
		/*<--------- Strategy -----------
		 * 1. We need to check that those 2 strings are a permutation of each others
		 *  |--> we would need to keep a count of each of the alphabet appearance on
		 *       the first string.
		 *       Then going back to the second string we need to decrement those counts..
		 *       If we get below 0, then it is a bust and the test fails
		 */
		if(input1.length() != input2.length())
			return false; // They must be of the same length if they are permutations
						  // Assuming that ' ' isnt equivalent to ''
		
		char[] alphabet = new char[128];
		
		for(int i = 0; i < input1.length(); i++){
			alphabet[input1.charAt(i)]++;
		}
		
		for(int i =0; i < input2.length(); i++){
			if(--alphabet[input2.charAt(i)] < 0)
				return false;
		}
		
		
		return  true;
		
	}
	
	public static void main(String[] args){
		
		String[] stringsToTest = {"base", "as be", " esab", "s abe", "baby"};
		String result;
		for(String string : stringsToTest){
			
			result = (checkPerm(string, "base ") ) ? "VALID" : "NOT VALID";
			System.out.println("The string \""+ string + "\" compared to \"base \" is " + result);
		}
		
	}

}
