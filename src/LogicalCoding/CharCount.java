package LogicalCoding;

public class CharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "aaabbccca";
        String output = Stringcount(input);
        System.out.println("Input String : " + input);
        System.out.println("Compressed String: " + output);
    }
		  public static String Stringcount(String input) {
		        if (input == null || input.isEmpty()) {
		            return "";
		        }
		        StringBuilder compressed = new StringBuilder();
		        int count = 1;

		        for (int i = 0; i < input.length()-1; i++) {
		            if (input.charAt(i) == input.charAt(i + 1)) {
		                count++;
		            } else {
		                compressed.append(count).append(input.charAt(i - 1));
		                count = 1;
		            }
		        }
		        //compressed.append(count).append(input.charAt(input.length() - 1));

		        return compressed.toString();
		    }

		   
		        

	}


/*
 * 
 * Input String : aaabbccca
Compressed String: 3a2b3c1a

 */

