package LogicalCoding;

import java.util.Stack;

public class parathesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "({[])}";
        System.out.println("Is balanced? " + isValid(input));  // Output: true

	}

	public static boolean isValid(String input) {
		// TODO Auto-generated method stub
		Stack<Character> st = new Stack<>();
		for(char ch: input.toCharArray()) {
			if(ch=='('||ch=='{'||ch=='[') {
				st.push(ch);
			
			}else if(ch==')'||ch=='}'||ch==']') {
				if(st.isEmpty()) { return false;}
				char top =st.pop();
				if((ch==')'&&top!='(')||
				   (ch=='}'&&top!='{')||	
				   (ch==']'&&top!='[')) {
					return false;
				}
					
			}
			}
		return st.isEmpty();

	}

}
