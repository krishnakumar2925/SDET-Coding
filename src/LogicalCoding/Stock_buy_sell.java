package LogicalCoding;

public class Stock_buy_sell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr={7, 10, 1, 3, 6, 9, 2} ;
		int max=arr[0];
		int min=arr[0];
//		boolean flag=false;
//		
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]<arr[j]) {
//					int profit = arr[j]-arr[i];
//					if(max<profit) {
//						max=profit;
//					}
//					flag=true;
//				}
//				
//			}
//		}
//		
//		if(!flag) {
//			System.out.println(0);
//		}else {
//			System.out.println(max);
//		}
		for(int i=0;i<arr.length;i++) {
			min=Math.min(min, arr[i]);
			
			max=Math.max(max, arr[i]-min);
			
		}
		
		System.out.println(max);
		

	}
	
	

}
