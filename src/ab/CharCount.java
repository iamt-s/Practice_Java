package ab;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CharCount {
	
	public static void main(String[] args) {  
        
		String word="aaffffffbbccdddddE";
	
		int len= word.length();
		//System.out.println(len);
		Map<Character, Integer> cc=new HashMap<Character, Integer>();
		
		for(int i=0;i<len;i++) {
			
			
			
			if(cc.containsKey(word.charAt(i))) {
				//System.out.println(word.charAt(i));
				
				cc.put(word.charAt(i), cc.get(word.charAt(i))+1);
			}
		
			else {
				cc.put(word.charAt(i), 1);
				//System.out.println(word.charAt(i));
			}
		
			
		}
				
		//System.out.println(cc);
		 char maxChar = 0;
	        int maxCount = 0;

	        for (Map.Entry<Character, Integer> entry : cc.entrySet()) {
	            if (entry.getValue() > maxCount) {
	                maxCount = entry.getValue();
	                maxChar = entry.getKey();
	            }
	        }

	        // Step 3: Print the result
	        System.out.println("Character with maximum frequency: " + maxChar + " = " + maxCount);
			
	
		
       }  
}

// Take the String 
//Convert it to arrat using toCharArray
// Declare HamMap 
//check the character of string is already present in the map or not 
// If not then add and increment the count to 1 
// after all this use enhanced for loop and iterate the MAP 
// using the Entry method print it.