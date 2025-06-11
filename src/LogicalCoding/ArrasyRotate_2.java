package LogicalCoding;

import java.util.Arrays;

public class ArrasyRotate_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
	     int k=2;
	     
	     k%=arr.length;
	     reverse(arr,0,arr.length-1);
	     reverse(arr,0,k-1);
	     reverse(arr,k,arr.length-1);
	     System.out.println(Arrays.toString(arr));
	     
		

	}

	private static void reverse(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		
		while(i<j) {
			int temp = arr[i];
			arr[i++]= arr[j];
			arr[j--]=temp;
		}
		
	}

}
