package LogicalCoding;

public class Matrix_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {
							{1,2,3},
							{9,10,11},
							{3,4,5} };
		
		int rows = 0;
		int cols =matrix[0].length-1;
		int target = 10;
		boolean result=false;
		
		while(rows<matrix.length && cols>=0) {
			if(matrix[rows][cols] == target) {
				result =true;
				System.out.println("found");
				break;
			}
			else if(matrix[rows][cols]>target) cols--;
			else rows++;
		}
		if(!result) {
			System.out.println("not found");
		}
		
			
		
		
	
		}

	}


