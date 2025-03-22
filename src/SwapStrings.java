import java.util.Scanner;

public class SwapStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner get =new Scanner(System.in);
		String str=get.next();
		String str2=get.next();
		System.out.println("Before swap , str:"+ str +",str2: "+str2);
		String[] arr=swap(str,str2);
		System.out.println("after swap , str:"+ arr[0] +",str2: "+arr[1]);

	}
	public static String[] swap(String str,String str2) {
		
		String[] arr=new String[2];
		
		str=str+str2;
		arr[1]=str.substring(0,str.length()-str2.length());
		arr[0]=str.substring(str2.length());
		
		
		return arr;
	
	}

}
