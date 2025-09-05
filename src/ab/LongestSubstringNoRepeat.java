package ab;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringNoRepeat {

    // Returns the longest substring without repeating characters.
	// 1. Check whether string is null or Empty and return ""
	// 2. Start scanning the characters to right from left so create two variables left and right 
	// 3. loop the right and store the character in char c 
	// 4. Use MAp and add each character of string to map by checking whether it is already exists or not 
	// 5. Change the left count to exact position(not index) of character 
	// 6. declare var windowLen which should be right - left +1 which is actual length of substring.
	// 7. 
	
    public static String longestSubstringWithoutRepeating(String s) {
        if (s == null || s.isEmpty()) return "";

        Map<Character, Integer> lastIndex = new HashMap<>();
        int left = 0, bestStart = 0, bestLen = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            // If 'c' was seen inside the current window, move 'left'
            if (lastIndex.containsKey(c) && lastIndex.get(c) >= left) {
            	//Start position of current window ..index= actualt position-1
                left = lastIndex.get(c) + 1;
            }

            // Mark latest index for 'c'
            lastIndex.put(c, right);

            // Try to improve best window
        //windowLen is the length of substring after taking the next character and it's status like removed if duplicated
            // removing the character if duplicate and start the substring from "left"
            //bestLen is the length of substring and If condition satisfied then windowLen assign to bestLen
            int windowLen = right - left + 1;
            if (windowLen > bestLen) {
                bestLen = windowLen;
                bestStart = left;
            }
        }
        return s.substring(bestStart, bestStart + bestLen);
    }

    // Helper: length only
    public static int lengthOfLongestSubstringWithoutRepeating(String s) {
        return longestSubstringWithoutRepeating(s).length();
    }

    // Quick demo
    public static void main(String[] args) {
        String[] tests = {"abcabcbb"};
        for (String t : tests) {
            String best = longestSubstringWithoutRepeating(t);
            System.out.printf("Input: %-10s  Longest: %-6s  Length: %d%n",
                    "\"" + t + "\"", "\"" + best + "\"", best.length());
        }
    }
}

