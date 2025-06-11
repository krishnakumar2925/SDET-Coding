package LogicalCoding;

public class Max_subarray_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,-1,2,5,6,8};
		
		int currentminSum=arr[0];
		int currentmaxSum=arr[0];
		int maxSum=arr[0];
		int minSum=arr[0];
		
		for(int i=1;i<arr.length;i++) {
			//currentminSum=Math.min(currentminSum, currentminSum+arr[i]);
			currentmaxSum=Math.max(arr[i], currentmaxSum+arr[i]);
			//minSum=Math.min(minSum, currentminSum);
			maxSum=Math.max(maxSum, currentmaxSum);
		}
		
		System.out.println(maxSum);
		//System.out.println(minSum);
	}

}
