package ab;

import java.util.HashMap;
import java.util.Map;

public class FreqOfElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub{}

		int nums[]= {2,2,4,5,6,9,7,8,9,8,2,6,8,5,8};
		int count = 0;
		//int i;
		System.out.println("Totoal count of data is :-"+ nums.length);
		
		Map<Integer,Integer> li=new HashMap<Integer,Integer>();
		
		for(int i=0;i<nums.length;i++) {
		
			if(li.containsKey(nums[i])) {
				//System.out.print(nums[i]);
				li.put(nums[i], li.get(nums[i])+1);
				
				}
			else {
				
				li.put(nums[i], 1);
				//System.out.print(nums[i]);

			}
						
		}
		for(int i=0;i<nums.length;i++) {
			if(li.get(nums[i]) != 0) {
				System.out.print(nums[i]+"-");
				System.out.println(li.get(nums[i]));
				li.put(nums[i],0);
			}
		}
	}

}
