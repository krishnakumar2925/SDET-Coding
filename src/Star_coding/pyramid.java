package Star_coding;

import java.util.Scanner;

public class pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a =new Scanner(System.in);
		int n=a.nextInt();
		inverted(n);

	}
	public static void inverted(int n) {
		for(int i=1;i<=n;i++) {
			//System.out.print(" ".repeat(n-i));
			System.out.println("*".repeat(i));
		}
		
	}
	
	

}
/*


 	*
   ***
  *****
 *******
*********

*/