package apcsa;

public class DiagonalAddition {
	public static int add(int[][] mat) {
		int total = 0;
		for(int row = 0; row < mat.length; row++) {
			int col = row;
			while(col == row) {
				total = total + mat[row][col];
				System.out.println(mat[row][col]);
				col++;
			}
			
		}
		return total;
	}
	public static void main(String[] args) {
		int[][] matrix = {{0, 1, 2},
				          {3, 4, 5},
				          {6, 7, 8}};
		int total = add(matrix);
		System.out.println("total of diagonal values: " + total);
		
		
		
		
		}	
}
