import java.util.Scanner;

public class Stringreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner get =new Scanner(System.in);
		String str=get.nextLine();
		System.out.println(reverse(str));

	}
	public static String reverse(String str) {
		
		StringBuilder string =new StringBuilder();
		string.reverse();
		//string.replace(0, str.length()-2, "Hi");
		//string.append(str);
		
		return string.toString();
	}

}
