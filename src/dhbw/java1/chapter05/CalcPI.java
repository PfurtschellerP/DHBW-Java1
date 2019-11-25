package dhbw.java1.chapter05;

/**
 * Errechnen von Näherungswerten für Pi durch die Leibniz-Reihe
 * 
 * @author Patrick Pfurtscheller
 *
 */
public class CalcPI {

	/**
	 * @param args not used
	 */
	public static void main(String[] args) {

		int n = 1000000;
		double piSchaetzung = 0;
		
		for (int i = 0; i <= n; i++) {
			if (i % 2 == 0) {
				piSchaetzung += (1 / (2.0 * i + 1));
			} else {
				piSchaetzung -= (1 / (2.0 * i + 1));
				}
		}
		
		System.out.println("Die Näherung für Pi bei n = " + n + " ist " + 4 * piSchaetzung);
		
	}

}
