package LogicalCoding;

import java.util.*;

public class First_non_repeating_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Swiss";
		HashMap<Character,Integer> map=new HashMap<>();
		
		for(char c:str.toCharArray()) {
			map.put(Character.toLowerCase(c), map.getOrDefault(Character.toLowerCase(c), 0)+1);
		}
		for(char c:str.toCharArray()) {
		if(map.get(Character.toLowerCase(c))==1) {
			System.out.println("first non repeating character is "+c);
			break;
		}
		
		}
	}

}
