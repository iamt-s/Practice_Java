package ab;
	
import java.util.HashMap;
import java.util.Map;

public class DuplicateWord {
    
    public static  void findDuplicateWords() {
        String string = "Big black bug bit a big black dog on his big black nose";    
        
        // Convert the string into lowercase
        string = string.toLowerCase();    
        
        // Split the string into words
        String[] words = string.split(" ");    
        
        // Use a HashMap to count word occurrences
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
      
        
        // Display duplicate words
        System.out.println("Duplicate words in the given string:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
    
    public static void main(String[] args) {    
    	findDuplicateWords(); 
    }    
}
