package LogicalCoding;

public class binary_search {

	public static void main(String[] args) {
		//123456
		//345612
		
		//int[] rotated_arr= {2,1,3,4,5,6};
		int[] rotated_arr= {3,4,5,6,2,1};
		int result =rotate(rotated_arr);
		System.out.println(result);
		
	}

	public static int rotate(int[] num) {
		// TODO Auto-generated method stub
		//int left =0, right=num.length-1;
		int res=0;
		for(int i=0;i<num.length;i++) {
			if(num[i]==1) {
				res=i;
			}		
			
		}
		//if()
		int ind=num.length-res;
		return ind;
		
		
		
		
		
	}
}
