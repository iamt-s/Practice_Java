package ab;

import java.util.Arrays;

public class fibonaci {
	public static void main(String args[])  
	{    
		fibo();
	  
	}
	
	public static void fibo() {
		 int n1=0,n2=1,n3,i,count=8;    
		 System.out.print(n1+" "+n2+" ");//printing 0 and 1    
		    
		for( i=1;i<count;i++) {			
			n3=n1+n2;
			System.out.print(n3+" ");
			n1=n2;
			n2=n3;
		 }   
		}
	
	}
