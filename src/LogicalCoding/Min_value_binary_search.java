package LogicalCoding;

public class Min_value_binary_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5, 6, 1, 2, 3, 4};
		int target=5;
		
		int left =0,right =arr.length-1;
		while(left<right) {
			if(arr[left]<arr[right]) {
				System.out.println(arr[left]);
				break;
			}
			
			int mid=left+(right-left)/2;
			
			if(arr[mid]==target) {
				left=mid+1;
			}else {
				right=mid;
			}
			
			
		}
		System.out.println(arr[left]);

	}

}
