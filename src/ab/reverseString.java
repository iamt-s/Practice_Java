package ab;

public class reverseString {

	public void reverse() {
		String str = "madam";
		char[]revStr= str.toCharArray();
		String rev="";
		
		
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
