package dhbw.java1.aLotOfTests;

public class Spielplatz {

	public static void main(String[] args) {
		
		int[][] summen = new int[10][10];

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				summen[i][j] = i + j;
			}
		}
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(summen[i][j]);
				System.out.print("	");
			}
			System.out.println();
		}
		
	}
}
