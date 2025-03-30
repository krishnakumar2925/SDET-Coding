package Star_coding;

import java.util.Scanner;

public class InvertedPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a =new Scanner(System.in);
		int n=a.nextInt();
		inverted(n);

	}
	public static void inverted(int n) {
		for(int i=n;i>=1;i--) {
			System.out.print(" ".repeat(n-i));
			System.out.println("*".repeat(2*i-1));
		}
	}

}
/*

*********
 *******
  *****
   ***
    *
n=5
*/