import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		int v=a.nextInt();
		int[] arr = new int[v];
		for(int i=0;i<v;i++) {
			arr[i]=a.nextInt();
		}
		a.close();
		List<List<Integer>> result = permute(arr);

        result.forEach(System.out::println);

	}
	public static List<List<Integer>> permute(int[] arr){
		List<Integer> lis=new ArrayList<>();
		for (int num : arr) {
		    lis.add(num);  // Convert int to Integer manually
		}
		List<List<Integer>> result=new ArrayList<>();
		generatePermute(lis,0,result);
		return result;
		
	}
	
	private static void generatePermute(List<Integer> arr,int ind,List<List<Integer>> result) {
		if(ind==arr.size()) {
			result.add(new ArrayList<>(arr));
			return;
		}
		
		for(int i=ind;i<arr.size();i++) {
			Collections.swap(arr, i, ind);
			generatePermute(arr,ind+1,result);
			Collections.swap(arr, i, ind);
		}
	}

}
