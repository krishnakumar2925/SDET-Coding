package LogicalCoding;

public class palidrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String  str ="Amana plan a canal Panama";
		
		if(str.length()<1) {
			System.out.println("not a palindrome");
		}else if(str.length()==1) {
			System.out.println("palindrome");
		}else {
			String Str=str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
			StringBuilder builder=new StringBuilder();
			for(int i=Str.length()-1;i>=0;i--) {
				builder.append(Str.charAt(i));
			}
			if(Str.equals(builder.toString())) {
				System.out.println("palindrome");
			}
			else {
				System.out.println("not a palindrome");
			}
			
			System.out.println(builder.toString());
			System.out.println(Str);
		}
	}

}
