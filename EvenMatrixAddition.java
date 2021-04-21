package apcsa;

public class EvenMatrixAddition {
	public static int addEven(int[][] mat) {
		int total = 0;
		for(int r = 0; r < mat.length; r++) {
			for(int c = 0; c< mat[0].length; c++) {
				if(mat[r][c] % 2 == 0) {
					total = total + mat[r][c];
				} else {
					total = total - mat[r][c];
				}
			}
		}
		return total;
	}
	public static void main(String[] args) {
		int[][] matrix = {{0, 1, 2,4},
				          {3, 4, 5,8}};
		int total = addEven(matrix);
		System.out.println("total of even values: " + total);
		
		}	
}
