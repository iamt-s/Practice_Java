package ab;

import java.util.Arrays;

class GFG {
 
static int countOccurrences(String str, String word) 
{
    // split the string by spaces in a
    String a[] = str.split(" ");
    //System.out.println("Total Words are "+ a.length);

    // search for pattern in a
    int count = 0;
    for (int i = 0; i < a.length; i++) 
    {
    // if match found increase count
    if (word.equals(a[i]))
        count++;
    }
    return count;
}
static int countOccurrences1(String str, String word) {
    return (int) Arrays.stream(str.split(" "))
                       .filter(w -> w.equals(word))
                       .count();
}


// Driver code
public static void main(String args[]) 
{
    String str = "Geeks A computer science portal for Geeks ";
    String word = "Geeks";
    
    System.out.println("Occureance of word "+word +" is:-"+ countOccurrences1(str, word));
	}
}