package ab;

import java.util.Arrays;

public class shiftOddEven {

	// Shift all even numbers to left side of array and odd number to right side.
	public static  void oddEven() {
		
		int num[]= {253,222,364,123,145,885,454,777};
		int left=0;
		int right= num.length-1;
		
		while(left<right) {
			if(num[left]%2==0) {
				left++;
			}
			
			else if(num[right]%2!=0) {
				right--;
			}
			else {
				int temp=num[left];
				num[left]=num[right];
				num[right]=temp;
				left++;
				right--;
			}
		}
		System.out.println(Arrays.toString(num));
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shiftOddEven seo=new shiftOddEven();
		seo.oddEven();
		
	}
	
}
