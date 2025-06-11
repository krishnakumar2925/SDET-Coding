package LogicalCoding;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {8, 3, 1, 7, 0, 10, 2};

        quickSort(arr, 0, arr.length - 1);

        for (int num : arr) {
            System.out.print(num + " ");
        }

	}

	private static void quickSort(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		
		int pivotIndex = pivot(arr,i,j);
		pivot(arr,i,pivotIndex-1);
		pivot(arr,pivotIndex,j);

		
	}

	private static int pivot(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
		 int pivot = arr[high]; // choose last element as pivot
	     int i = low - 1;
	     
	     for(int j=low;j<arr.length;j++) {
	    	 if(arr[j]< pivot) {
	    		 i++;
	    		 int temp=arr[i];
	    		 arr[i]=arr[j];
	    		 arr[j]=temp;
	    	 }
	     }
	     
	     int temp=arr[i+1];
	     arr[i+1] = arr[high];
	     arr[high]=temp;
	     
	     return i+1;
	     
	}

}
