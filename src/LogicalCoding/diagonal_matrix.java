package LogicalCoding;

public class diagonal_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };

	        System.out.println("Diagonal Sum: " + diagonalSum(matrix));  // Output: 25

	}

	private static int diagonalSum(int[][] matrix) {
		// TODO Auto-generated method stub
		
		int n = matrix.length;
		int sum=0;
		
		for(int i=0;i<n;i++) {
			sum+=matrix[i][i]; //primary diagonal 1+5+9 =15
			
			if(i!=n-1-i) {
				sum+=matrix[i][n-1-i]; //secondary diagonal 3+7=10 5 will be skipped
			}
			
		}
		return sum;
	}

}
