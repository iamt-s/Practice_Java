package ab;
import java.util.*;
public class Collections {
	
	public static void arraylist() {
		List<String> myList=new ArrayList<String>();
		 myList.add("Orange");
		 myList.add("Yellow");
		 myList.add("Purple");
		 myList.add("Blue");
		 
		 myList.add(4,"red");
		 myList.set(1, "Burgandy");
		 
		 if(myList.contains("Black")) {System.out.println("Color Found");}
		 else {System.out.println("Color is not present");}
		
		 System.out.println("List is as below:-"+myList);
		 
		 List<String> ls2=new ArrayList<String>();
		 ls2.add("Orange");
		 ls2.add("Yellow");
		 ls2.add("Purple");
		 ls2.add("Blue");
		 ls2.add("Red");
		 System.out.println("List2 is as follows:- "+ls2);
		// Collections.copy(myList,ls2);
		 List<String> list3=new ArrayList<String>();
		 
		 for(String e : myList) 
			 list3.add(ls2.contains(e)? "Yes" : "No");
			 System.out.println(list3);
		 
		 List<String> list4 =new ArrayList<String>();
		 list4.addAll(myList);
		 list4.addAll(ls2);
		 ArrayList<String> newc1 = new ArrayList<String>();
		 newc1.add("x");
		 newc1.add("y");
		 newc1.add("z");
		 ArrayList<String> newc2 = (ArrayList<String>)newc1.clone();
		 
		 if(newc2.listIterator(5) != null) {
			 System.out.println("List is printng");
		 }
		 ArrayList<Integer> newc4 = new ArrayList<Integer>();
		 
	}
	
	public static void hashmap() {
		
		HashMap<Integer, String> keyValue = new HashMap<Integer, String>();
		keyValue.put(1,"Tejas");
		keyValue.put(2,"Manish");
		keyValue.put(3 ,"Swati");
		keyValue.put(4,"Vanashri");
		keyValue.put(5,"Family");
		//System.out.println("Values are as follows:-"+keyValue);
		
		HashMap<Integer,String> map2 = new HashMap<Integer, String>();
		map2.put(1, "Orange");
		map2.put(2, "Apples");
		map2.put(3, "Mangoes");
		map2.put(4, "Chillies");
		System.out.println("Before Copying: "+map2);
		for(Map.Entry x:keyValue.entrySet()) {
			//System.out.println(keyValue);
			//System.out.println(x.getKey()+" "+x.getValue());
		}
		
//		map2.putAll(keyValue);
//		System.out.println("After Copying from first map:- "+map2);
//		
		map2.remove(1);
		System.out.println("There no Mapping :-"+map2);
		
		boolean result=map2.isEmpty();
		System.out.println("Is hash map empty: " + result);
		map2.clear();
		if(map2.isEmpty()) {
			System.out.println("HasMap is emty:-");
		}
		else {System.out.println("Hashmap is Not EMTPY");}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		hashmap();	
		arraylist();
	}
}
