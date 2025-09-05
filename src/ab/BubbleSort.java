package ab;

public class BubbleSort {
	
	
	public void sort(int[] arr) {
		int i,j, temp;
		for(i=0;i<arr.length;i++) {
			
			for(j=0;j<arr.length-i-1;j++) {
				
				if(arr[j]>arr[j+1]) {
				
					// compare two digits and swap 
					
						temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					
				}
			
				
			}
			System.out.println(arr[i]);
		}
		
			
			
				
}
public static void main(String[] args){
	int[] array= {15,12,18,62,45,98};
	BubbleSort ab=new BubbleSort();
	ab.sort(array);
}
}