package ab;

public class CyclicSort {
	
	public void sorting(int[] array) {
		
		int i=0,correct,temp;
		
		while(i<array.length) {
			correct=array[i]-1;
		if(array[i]!=array[correct-1]) {	
			temp=array[i]; 
			array[i]=array[correct-1];
			array[correct-1]=temp;
		}
		else {
			i++;
		}
		
	}
		
		for(int j=0;j<array.length;j++) {
			System.out.println(array[j]);
		}
	}
	
	
	public static void main(String[] args) {
		CyclicSort cs=new CyclicSort();
		int[]numArray= {5,2,4,3,6,8,7};
		cs.sorting(numArray);
	}
	
	
}


// First check the given array numbers are in consecutive like 1,2,3,4,5 etc.
// Then start using cyclic sort
// Check Manually first that which number should be on which index.
//Then implement the logic correct=array[i]-1 which will comp[are the numbers with each other
// Then implement the swapping mechanism