package dhbw.java1.chapter5;

/**
 * Überprüfen, ob eine Zeichenreihe ein Palindrom ist oder nicht
 * 
 * @author Patrick Pfurtscheller
 *
 */
public class Palindrom {

	/**
	 * @param args not used
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String worte = "lagerregal";
		boolean istPalindrom = false;
		
		for (int i = 0; i <= worte.length() - 1; i++) {
			if (worte.charAt(i) == (worte.charAt(worte.length() - 1 - i))) {
				// alles gut
				istPalindrom = true;
			} else {
				// hat was nicht gepasst
				istPalindrom = false;
				break;
			}
		}
		
		System.out.println("Ist es ein Palindrom?");
		System.out.println(istPalindrom);
	}

}
