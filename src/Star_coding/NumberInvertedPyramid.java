package Star_coding;

import java.util.Scanner;

public class NumberInvertedPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a =new Scanner(System.in);
		int n=a.nextInt();
		inverted(n);

	}
	public static void inverted(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				System.out.print("0");
			}
			System.out.println(n-i);
		}
	
	}

}

/*

00005
0004
003
02
1


*/