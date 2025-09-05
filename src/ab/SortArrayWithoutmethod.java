package ab;

public class SortArrayWithoutmethod {

	public static void main(String[] args) {
		int numbers[]= {21,24,56,30,90,70};
		
		for(int i=0;i<numbers.length;i++) {
			
			for(int j=0;j<numbers.length-1-i;j++) {
			
			if(numbers[j]>numbers[j+1]) {
				int tempNum=numbers[j];
				numbers[j]=numbers[j+1];
				numbers[j+1]=tempNum;
				}
			}
			
			
		}
		
		System.out.println("Sorted Arra is:-");
		for(int num: numbers) {
			System.out.println(num);
		}
	}

}
