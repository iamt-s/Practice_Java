package ab;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class NonRepeated {

	public static void main(String[] args) {
		NonRepeated nr=new NonRepeated();
		nr.firstNonRepeatedChar("Abhyuday");
	}
	 public void firstNonRepeatedChar(String str) {
		 
		 //First take a String 
		 // Iterate the character in the string 
		 //check each character with other that is it exist in remaining set of characters
		 // if not then print it as First Non Repeating character 
		 
		
		Map<Character, Integer> charCount=new HashMap<>();
		 
		for(char c : str.toCharArray()) {
			
			charCount.put(c, charCount.getOrDefault(c, 0)+1);
			
		}
		System.out.println(charCount);
			for(int i=0;i<str.length();i++) {
				
				char c =str.charAt(i);
				if(charCount.get(c)>1) {
					  System.out.println("Character '" + c + "' is duplicated (" + charCount.get(c) + " times).");
	            } else {
	                System.out.println("Character '" + c + "' is unique.");
	            }
				
			} 
	 
	 
	 }
}
