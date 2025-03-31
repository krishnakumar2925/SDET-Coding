package LogicalCoding;

import java.util.LinkedHashSet;

public class String_remove_duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Automataion";
		
		LinkedHashSet<Character> set=new LinkedHashSet<>();
		
		for(char c:s1.toCharArray())
			set.add(Character.toLowerCase(c));
		StringBuilder str=new StringBuilder();
		for(char a:set) str.append(a);
			
		
		
		System.out.println(str.toString());
		
		
		

	}

}
