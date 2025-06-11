package LogicalCoding;

import java.util.HashSet;
import java.util.Set;

public class Two_pair_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,-1,2,5,6,8};
		int target = 8;
		boolean flag=false;
		
		Set<Integer> num = new HashSet<>();
		
		for(int nums:arr) {
			int secondValue = target - nums;
			if(num.contains(secondValue)) {
				System.out.println("pairs are "+nums +","+secondValue);
				flag=true;
			}else if(target==nums) {
				System.out.println("direct target is there");
				flag=true;
				
			}
			num.add(nums);
		}
		
		if(!flag) {
			System.out.println("pairs are missing");
		}
		
		
	}

}
