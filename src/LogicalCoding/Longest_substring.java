package LogicalCoding;

import java.util.HashSet;

public class Longest_substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="aabcassccse";
		HashSet<Character> set = new HashSet<>();
		int left =0,maxLen=0,start=0;
		
		for(int i=0;i<str.length();i++) {
			while(set.contains(str.charAt(i))) {
				set.remove(str.charAt(left++));
				
			}
			 set.add(str.charAt(i));

	            if (i - left + 1 > maxLen) {
	                maxLen = i - left + 1;
	                start = left;
	            }
	        }
 
	        // Print longest substring
	        System.out.println(str.substring(start, start + maxLen));
	        System.out.println("Length: " + maxLen);
	    }
	}
