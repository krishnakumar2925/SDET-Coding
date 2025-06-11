
public class lastStringlength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "HelloWorlds";
		
		System.out.println(s.trim().substring(s.trim().lastIndexOf(" ")+1).length());

	}

}
