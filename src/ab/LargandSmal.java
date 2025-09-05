package ab;

import java.util.Arrays;

public class LargandSmal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LargandSmal.largestAndSmallest();
	}
	
	
	public static void largestAndSmallest() {
		
		int numbers[]= {21,24,56,30,90,70};
		int largest=0;
		int smallest=0;
		
		Arrays.sort(numbers);
		for(int i=0;i<numbers.length;i++) {
		System.out.print(numbers[i]);
		largest=numbers[numbers.length-1];
		smallest=numbers[0];
		System.out.println();		
			}
		
		System.out.println("Big Number is:-"+largest);
		System.out.println("Small Number is:-"+smallest);
	}

}
