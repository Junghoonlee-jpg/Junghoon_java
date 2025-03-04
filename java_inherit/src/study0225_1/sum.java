package study0225_1;

public class sum {

	public static void main(String[] args) {
		
		int[][] matrix = {
				{2,3,4},
				{1,5,7}
		};
		
		for(int i = 0; i<matrix.length; i++) {
			int sum = 0;
			for(int j = 0; j<matrix[i].length; j++) {
				sum += matrix[i][j];
			}
			
			System.out.println(sum);
		}

	}

}
