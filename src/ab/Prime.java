package ab;

import java.util.Scanner;

public class Prime {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number till which you  want prime numbers :- ");
				int num=sc.nextInt();
				// This Code is for if want the prime numbers from 0 to any range
				  int count=0;
				  
				  for(int j=0;j<num;j++) { 
					  if(isPrime(j)) {
						  System.out.println(j); 
						  count++; 
						  }
				  
				  } System.out.println("Total number of Prime numbers are:- "+ count);
				 			
					  if(num==2) { 
						  System.out.println("Number is Prime"); 
						  } 					  
					  else { 
						  if(isPrime(num)) { 
							  System.out.println("Number is Prime");
							  }
					  	}
		
	}
	
	
	  public static boolean isPrime(int num) { int m =num/2; for(int i=2; i<=m;i++)
	  {
	  
	  if(num%i==0) { return false; }
	  
	  }
	  
	  
	  return true;
	  
	  }
	 
	
	/*
	 * public static boolean isPrime(int num) {
	 * 
	 * for(int i=3; i<Math.sqrt(num);i+=2) {
	 * 
	 * if(num%i==0) { return false; }
	 * 
	 * }
	 * 
	 * 
	 * return true;
	 * 
	 * }
	 */
}
