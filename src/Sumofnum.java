import java.util.Scanner;

public class Sumofnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner get =new Scanner(System.in);
		int num=get.nextInt();
		System.out.println(sum(num));
		
	}
	public static int sum(int num) {
		
		if(num==0) {
			return 0;
		}
		//num=num%10;
		return (num%10) +sum(num/10);
	}
//	int sum = 0;
//    while (num != 0) {
//        sum += num % 10;
//        num /= 10;
//    }
//    return sum;
//	

}
