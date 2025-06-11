package LogicalCoding;

public class IamNeo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="mano palani raja a";
		
	String[] arr=str1.split(" ");
//	StringBuilder str=new StringBuilder();
//	StringBuilder str2=new StringBuilder();
//	int a=arr[0].length();
//	int b=arr[1].length();
//	String c=str.append(arr[0]).reverse().toString();
//	String d=str2.append(arr[1]).reverse().toString();
//	
//	System.out.println(c+a+" "+d+b);
	for(int i=0;i<arr.length;i++) {
		int a=arr[i].length();
		arr[i]=new StringBuilder(arr[i]).reverse().toString()+a+" ";	
		
	}
	StringBuilder str=new StringBuilder();
	for(String c:arr) {
		str.append(c);
	}
	
		System.out.println(str.toString());
		

	}

}
