package ab;
public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,0,0,1,0,1,0,1,1};
		int j =0;
		System.out.println("Length of array is:- " + arr.length);
		for(int i=0;  i<arr.length; i++)
		{
			// here if array of i is 0 then assigning it to J
			if(arr[i]==0) {
				arr[j++]=arr[i];
			}
		}
		
		//this while loop continues from where zero's assignment to j is finished and start assigning 1 to j
		while(j<arr.length) {
			arr[j++]=1;
		}
		// By all above operations array is sorted and using this for loop we are just printing it.
		for(int k=0;  k<arr.length;k++)
		{
			System.out.print(arr[k]+" ");
		}
	}

	
}