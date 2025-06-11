package LogicalCoding;

public class Find_Unique_char_in_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int[] arr = {2,2,3,4,4,5,5};
//		
//		//to find unique 
//		int res=0;
//		
//		for(int num: arr) {
//			res ^=num;
//		}
		
		String s = "good";
		String t ="goodi";
		char res =0;
		for (char c : s.toCharArray()) {
			res ^= c;
	    }

	    for (char c : t.toCharArray()) {
	    	res ^= c;
		
		

	}
	    System.out.println(res);
	}
}


