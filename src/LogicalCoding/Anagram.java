package LogicalCoding;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="tomato";
		String s2="matoto";
		
		char[] st1=s1.toCharArray();
		char[] st2=s2.toCharArray();
		Arrays.sort(st1);
		Arrays.sort(st2);
		
		System.out.println(Arrays.equals(st1, st2));

	}

}
