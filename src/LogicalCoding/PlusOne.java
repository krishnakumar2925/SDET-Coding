package LogicalCoding;

import java.util.Arrays;

public class PlusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] digits= {1,3,9};
		
		for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                System.out.println(Arrays.toString(digits));
            }
            digits[i]=0;
        }

        int[] result = new int[digits.length+1];
        result[0]=1;
        System.out.println(Arrays.toString(result));
		

	}

}
