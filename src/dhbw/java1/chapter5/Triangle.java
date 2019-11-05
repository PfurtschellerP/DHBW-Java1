package dhbw.java1.chapter5;

/**
 * Überprüfen, ob Dreiecke gültig sind und ob es sich um spezielle Dreiecke handelt
 * 
 * @author Patrick Pfurtscheller
 *
 */
public class Triangle {
	/**
	 * @param args not used
	 */
	public static void main(String[] args) {

		double a = 2, b = 3, c = 4;
		
		if ((a >= (b + c)) | (b >= (a+c)) | (c >= (a+b))) {
			System.out.println("Das Dreieck ist ungültig!");
		} else {
			if ((a == b) && (b == c)) {
				System.out.println("Dreieck ist gleichseitig!");
			} else if ((a == b) && (b != c)) {
				System.out.println("Dreieck ist gleichschenklig!");
			} else if ((Math.pow(a,2) + Math.pow(b,2) == Math.pow(c, 2))) {
				System.out.println("Dreieck ist rechtwinklig!");
			} else {
				System.out.println("Dreieck ist gültig, aber kein Plan was das ist!");
			}
		}
		
	}

}
