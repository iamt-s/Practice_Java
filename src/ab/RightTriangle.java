package ab;

public class RightTriangle {

	public void triangle() {
		int rows =5;
		int i;
		int n=1;
		
		for(i=1;i<=rows;i++) {
			
			for (int j=rows;j>=i;j--);
				{
				System.out.print(" ");
				}

				for(int k=1;k<=i;k++) 
				{			
		                 System.out.print("* ");
				}

				System.out.println("");
			}
		
				
	}
	
	public void reverseTriangle() {
		
		int rows=5;
		for(int i=rows;i>=1;i--) {
			
			for (int k=1;k<=i;k++) {
				System.out.print(" *");
			}
			System.out.println("");
		}
	}
	public static void  main(String[] args) {
		RightTriangle tri = new RightTriangle();
		tri.triangle();
		tri.reverseTriangle();
		
		
	}
}
