package ab;

import java.util.Scanner;

public class Palindrom {
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Ener a Strting to check Palindrom:- ");
		String str=sc.next();
		
		if(isPlaindrom(str)) {
			System.out.println("String is palindrom");
		}
		else {System.out.println("String is not palindrom");}
		
		
	}
	public static boolean isPlaindrom(String str) {
		int left=0, right=str.length()-1;
		
		while(left<right) {
			if(str.charAt(left)!=str.charAt(right)) {
				
				return false;
			}
			left++;
			right--;
		}
		
		
		return true;
		
	}

}
