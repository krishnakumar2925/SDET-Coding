package LogicalCoding;

import java.util.*;

public class ArrayRotation {

	public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5,6,7};
        int k=3;
        List<Integer> list=new ArrayList<>();
        for(int n:arr) {
        	// Convert array to list
        	list.add(n);
        }
        Collections.rotate(list, k);
        // Rotate the list by k positions

        list.forEach(System.out::println);


}
}
