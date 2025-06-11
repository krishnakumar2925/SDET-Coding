package LogicalCoding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Stringcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="aaabbbccd BBDEF";
		
		LinkedHashMap<Character,Integer> map= new LinkedHashMap<>();
		for(char c:str.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		for(char c:map.keySet()) {
		if(map.get(c)>1) {
			System.out.println("Character is "+c+" and its occurence is "+map.get(c));
		}
		}
		
		//to find the second highest freq character 
		secondHighestFreq(map);
		
	}

	public static void secondHighestFreq(LinkedHashMap<Character, Integer> map) {
		// TODO Auto-generated method stub
		
		List<Integer> freqList = new ArrayList<>(new HashSet<>(map.values()));
		Collections.sort(freqList,Collections.reverseOrder());
		
		freqList.forEach(System.out::println);
		
		int secondHighestInt = freqList.get(1);
		
		for(Map.Entry<Character, Integer> entry: map.entrySet()) {
			if(entry.getValue()==secondHighestInt) {
				System.out.println("Second highest occurence character is "+entry.getKey());
				
			}
		}
		
	}

}
