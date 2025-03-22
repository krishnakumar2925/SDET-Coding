import java.util.Scanner;

public class capcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner get =new Scanner(System.in);
		String str=get.nextLine();
		System.out.println(cap(str));

	}
	public static int cap(String str) {
		int count=0;
//		if(str==null||str.isEmpty()) {
//			return 0;
//		}
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='A'&&str.charAt(i)<='Z') {
				count++;
			}
		}
		return count;
		
	}
	

}
