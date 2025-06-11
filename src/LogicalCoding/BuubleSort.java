package LogicalCoding;
import java.util.Arrays;

public class BuubleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 5, 8, 4,9, 3, 3};
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				//System.out.println(Arrays.toString(arr));
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
