package ab;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//Count vowels and consonants in a string
public class VowelAndConsonant {

	public static void main(String[] args) {
		
String word="perplexity";
		VowelAndConsonant vc=new VowelAndConsonant();
		vc.vowels(word);
	}
	public void vowels(String string){
		
		// creating a list of Vowels using ArrayList
		ArrayList<Character> vowelList=new ArrayList<Character>();
		vowelList.add('a');
		vowelList.add('e');
		vowelList.add('i');
		vowelList.add('o');
		vowelList.add('u');
		
		Map<Character, Integer> cc=new HashMap<Character, Integer>();
		Map<Character, Integer> consonants=new HashMap<Character, Integer>();
		//traversing through the string and checking in Vowel List
		for(int i=0;i<string.length();i++) {
		
			if(vowelList.contains(string.charAt(i))) {
				cc.put(string.charAt(i), cc.getOrDefault(string.charAt(i), 0)+1);
				
			}
			
			else {
				consonants.put(string.charAt(i), consonants.getOrDefault(string.charAt(i), 0)+1);
			}
		
		}
		System.out.println("Vowels are:-"+ cc);
		System.out.println("consonants are:-"+consonants);
	}

}


// Use ArrayList and add the Vowels in list
// create two maps one for Vowels and other one for consonants
// check in condition whether the characters in string are present in Arraylist of vowels then increment count
// else increment the count of consonants.
// print both the maps 
