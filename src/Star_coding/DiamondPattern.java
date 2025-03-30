package Star_coding;

import java.util.Scanner;

public class DiamondPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a =new Scanner(System.in);
		int n=a.nextInt();
		star(n);	
		

	}
	public static void star(int n) {
		for(int i=1;i<=2*n-1;i++) {
			int row=(i<=n)?i:(2*n-i);
			System.out.print(" ".repeat(n-row));
			System.out.println("*".repeat(2*row-1));
		}
		
	}

}
/*

    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *

*/