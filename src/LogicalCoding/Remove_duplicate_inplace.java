package LogicalCoding;

import java.util.Arrays;

public class Remove_duplicate_inplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 3, 3, 5, 5, 2, 7};
		int i=0;
		for(int j=1;j<arr.length;j++) {
			if(arr[j]!=arr[i]) {
				i++;
				arr[i]=arr[j];	
			}
		}
		System.out.println("non duplicated array length "+(i+1));
		
		System.out.print("Unique elements: ");
        for (int k = 0; k <= i; k++) {
            System.out.print(arr[k] + " ");
        }
	}

}
