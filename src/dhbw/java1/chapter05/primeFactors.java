package dhbw.java1.chapter05;

/**
 * Ausgeben der Primfaktorzerlegung einer ganzen Zahl
 * 
 * @author Patrick Pfurtscheller
 *
 */
public class primeFactors {

	/**
	 * @param args not used
	 */
	public static void main(String[] args) {
		
		System.out.println("Please enter a number: ");
		@SuppressWarnings("resource")
		int userNumber = new java.util.Scanner(System.in).nextInt();
		
		
		System.out.println("Die Primfaktoren von " + userNumber + " sind:");
		for (int i = 2; i <= userNumber - 1; i++) {
			if (userNumber % i == 0) {
				System.out.println(i);
				userNumber /= i;
			}
		}
		
		System.out.println(userNumber);
		
	}

}
