package dhbw.java1.chapter11;

public class MatrixCalculator {

	private static double[][] sum(double[][] first, double[][] second){
		double[][] sum = new double[first.length][first[0].length];			// we assume that every row is the same length
		for (int i = 0; i < first.length; i++) {
			for (int k = 0; k < first[i].length; k++) {
				sum[i][k] = first[i][k] + second[i][k];
			}
		}
		return sum;
	}
	
	public static double[][] product(double scalar, double[][] matrix){
		double[][] product = new double[matrix.length][matrix[0].length];	// we assume that every row is the same length
		for (int i = 0; i < matrix.length; i++) {
			for (int k = 0; k < matrix[i].length; k++) {
				product[i][k] = scalar * matrix[i][k];
			}
		}
		return product;
	}
	
	/* TODO Fix that shit
	public static double[][] matrixProduct(double[][] first, double[][] second){
		double[][] matrixProduct = new double[first[0].length][second.length];	// Number of columns of A equals number of rows of B
		
		for (int i = 0; i < first.length; i++) {					// for the height of the first matrix
			for (int j = 0; j < matrixProduct[i].length; j++) {		// for the width of the product
				double sum = 0;
				for (int k = 0; k < first[i].length; k++) {			// for the width of the first matrix
					sum += first[i][k] * second[k][i];
				}
				System.out.println(sum);
				matrixProduct[i][j] = sum;	
			}
		}
		return matrixProduct;
	}
	*/
	
	private static void print(double[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			System.out.print("| ");
			for (int k = 0; k < matrix[i].length; k++) {
				System.out.print(matrix[i][k] + " ");
			}
			System.out.println("|");
		}
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[][] a = { {1, 2, 3}, {3, 2, 1} };
		double[][] b = { {1, 2, 3}, {3, 2, 1} };
		double[][] c = { {1, 2, 0}, {0, 1, 2}, {1, 0, 1} };
		double[][] d = { {2, 2, 1}, {1, 2, 0}, {0, 1, 1} };
		print(sum(a, b));
		System.out.println();
		print(product(2, a));
		System.out.println();
//		print(matrixProduct(c, d));
	}

}
