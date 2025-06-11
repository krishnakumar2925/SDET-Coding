package LogicalCoding;

import java.util.Arrays;

public class Find_the_smallest_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2 , 3, 4, 6, 7};
		
//		int missing_number=1;
//		//Arrays.sort(arr);
//		
//		for(int num:arr) {
//			if(num==missing_number) {
//				missing_number++;
//				
//			}
//		}
//		System.out.println(missing_number);
//		
//		}

		int n = arr.length + 1;  // One number is missing, so total count should be n

        int totalSum = n * (n + 1) / 2;
        int arraySum = 0;

        for (int num : arr) {
            arraySum += num;
        }

        int missingNumber = totalSum - arraySum;
        System.out.println("Missing number is: " + missingNumber);
	}
}


