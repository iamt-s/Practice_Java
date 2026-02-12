package ab;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharCount {
	
	public static void main(String[] args) {  
        
		String word="aaffffffbbccdddddE";
	
		//CharCount.charC(word);
		
		//charcountWithouMap(word);		
		charcountWithStream(word);
		
       }  
	
	
	public static void charC(String word) {
		
		
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
				
		System.out.println(cc); // this will print the character count of each character
		
		//below logic is for character with Maximum frequency 
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
	
	public static void charcountWithouMap(String word) {
		
		//StringBuffer str=new StringBuffer();
		
		char[] strArray=word.toCharArray();
		int[] freq = new int[120];
		for(char ch:strArray) {
			
			freq[ch]++;
			
		}
		
		for(int i=0;i<freq.length;i++) {
			if(freq[i]>0) {
				
				System.out.println("'" + (char) i + "' : " + freq[i]);
			}
			
		}
		
		
	}
	
	public static void charcountWithStream(String word) {
		
		Map<Character, Long> charCount =
				word.chars()                       // Step 1
                     .mapToObj(c -> (char) c)       // Step 2
                     .collect(Collectors.groupingBy(   // Step 3
                             ch->ch,
                             Collectors.counting()
                     ));
		
		System.out.println(charCount);
	}
}

// Take the String 
//Convert it to arrat using toCharArray
// Declare HamMap 
//check the character of string is already present in the map or not 
// If not then add and increment the count to 1 
// after all this use enhanced for loop and iterate the MAP 
// using the Entry method print it.