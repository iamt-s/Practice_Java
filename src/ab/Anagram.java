package ab;

import java.util.Arrays;

public class Anagram {
	
	
	
	 public static boolean checkAnagram(String st1, String str2){
		 
		 st1.toLowerCase();
		 str2.toLowerCase();
		 
		 if(st1.length()!=str2.length())
		 {
			 System.out.println("not anagram");
		 }
		 
		 char[] arr1=st1.toCharArray();
		 char[] arr2=str2.toCharArray();
		 
		 Arrays.sort(arr1);
		 Arrays.sort(arr2);
		 
		 return Arrays.equals(arr1, arr2);
		 
		 
	 }

	 public static void main(String[] args) {
			// TODO Auto-generated method stub

			
		
			if (checkAnagram("tejas", "abcde")) {
	            System.out.println("tejas" + " and " + "abcde" + " are anagrams.");
	        } else {
	            System.out.println("tejas" + " and " + "abcde" + " are NOT anagrams.");
	        }
			
		}

}
