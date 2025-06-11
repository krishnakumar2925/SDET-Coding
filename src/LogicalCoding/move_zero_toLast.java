package LogicalCoding;

import java.util.Arrays;

public class move_zero_toLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,4,0,0,0,3,5};
		
		int count=0;
		
		for(int num:arr)

	{
		if (num!= 0) {
			arr[count++]=num;

		}
		

	}
		while(count<arr.length) {
			arr[count++]=0;
		}
		
		
		System.out.println(Arrays.toString(arr));
}
}
