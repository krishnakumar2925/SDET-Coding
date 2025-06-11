package LogicalCoding;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5, 6, 1, 2, 3, 4};
		int target = 5;
		
		int left=0,right=arr.length-1;
		
		while(left<=right) {
			int mid =left+(right-left)/2;
			//System.out.println(" initial mid"+ mid);
			
			if(arr[mid]==target) {
				System.out.println("targeted index "+mid);
				break;
			}else if(arr[mid]<target) {
				left=mid+1;
				//System.out.println("left"+left);
			}else {
				right=mid-1;
				//System.out.println("right"+right);
			}
			//System.out.println("mid"+mid);
		}

	}

}
