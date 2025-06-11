package LogicalCoding;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class charcount_replaceDuplicate {
	public static String replaceDuplicates(String str) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        StringBuilder result = new StringBuilder();
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
           
        }

        for(char ch : str.toCharArray()) {
        if(map.get(ch)>1) {
        	result.append(map.get(ch));
        }else {
        	result.append(ch);
        }
        
    }
        return result.toString();
	}
	
    public static void main(String[] args) {
        System.out.println(replaceDuplicates("Testing Automation")); // "2u22m22i2n"
    }
}
