package ab;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class PracticeCollection {
	
// HashMap Example with String	
	public void map(String str) {
		
		Map<Character, Integer> mp=new HashMap<>();
		
		for(char c: str.toCharArray()) {
			
			mp.put(c, mp.getOrDefault(c, 0)+1);
		}
		System.out.println("Map Exapmple:-"+mp);
	}

	// Set Example with String	
	public void set(String str1) {
		
		Set<Character> st=new HashSet<>();
		for(char c: str1.toCharArray()) {
			st.add(c);
		}
		System.out.println("Set:-"+st);
		
	}
	
// Linked hashSet Example with String	
	public void linkedSet(String str) {
		
		Set<Character> ls=new LinkedHashSet<>();
		for(char c: str.toCharArray()) {
			ls.add(c);
		}
		System.out.println("Linked HAsh Set:-"+ls);
	}

	
	public static void main(String[] args) {
		
		String str="tejass";
		PracticeCollection coll=new PracticeCollection();
		coll.map(str);
		coll.set(str);
		coll.linkedSet(str);
	}

}
