package ab;

import java.util.Scanner;

public class reverseString {

	public void reverse() {
		System.out.println("Please enter String:-");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		
		char[]revStr= str.toCharArray();
		//String rev="";
		
		
		for(int i=revStr.length-1;i>=0;i--) 
		{
			
			System.out.print(revStr[i]);
//			ReverseString=str.charAt(i);
//			rev=ReverseString+rev;
			//System.out.print("Test is "+rev);
		}
	}
	
	
		

public static void main(String[] args) {
	
	reverseString reve = new reverseString();
	reve.reverse();
}
}
