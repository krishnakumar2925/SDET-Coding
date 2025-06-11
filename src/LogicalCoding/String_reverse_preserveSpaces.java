package LogicalCoding;

public class String_reverse_preserveSpaces {

	public static void main(String[] args) {
		
		String str="krishna kumar Muralidharan";
		// TODO Auto-generated method stub
		
		StringBuilder sb =new StringBuilder(str.replace(" ", "")).reverse();
		StringBuilder result = new StringBuilder(str);
		
		int j=0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ') {
			result.setCharAt(i, sb.charAt(j++));
		}
		}
				
		System.out.println(result.toString());
	}

}
