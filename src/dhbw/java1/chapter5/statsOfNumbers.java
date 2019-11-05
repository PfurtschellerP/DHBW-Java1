package dhbw.java1.chapter5;

/**
 * Fordern von Zahleneingaben bis eine 0 eingegeben wird.
 * Daraufhin wird das Minimum, das Maximuim und der Mittelwert augegeben.
 * 
 * @author Patrick Pfurtscheller
 *
 */
public class statsOfNumbers {

	/**
	 * 
	 * @param args not used
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		int min = 0, max = 0, i = 0, userNumber;
		double sum = 0.0;
		boolean firstRun = true;
		try {
			while ((userNumber = new java.util.Scanner(System.in).nextInt()) != 0) {
				if (firstRun) {
					min = userNumber;
					firstRun = false;
				}
				if (userNumber > max) {
					max = userNumber;
				} else if (userNumber < min){
					min = userNumber;
				}
				sum += userNumber;
				i++;
			}
			
		if (sum != 0) {
			System.out.println("Die kleinste Zahl war " + min + ", die größte " + max + " und der Durchschnitt " + (sum / i));
		} else {
			System.out.println("Das waren zu wenig Werte!");
		}
	
		
		} catch (Exception e) {
			System.out.println("Hast du auch richtige Zahlen eingegeben?");
		}
		
	}

}
