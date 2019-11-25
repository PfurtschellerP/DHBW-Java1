package dhbw.java1.chapter05;

import java.util.Scanner;

/**
 * Ausgabe der Collatz Folge für beliebige Ausgangszahl n bis sie 1 ergibt. 
 * Anschließende Ausgabe der Ausgangszahl, der höchsten Zahl und der Folgenlänge
 * @author Patrick Pfurtscheller
 *
 */
public class CollatzSequence {

	/**
	 * @param args not used
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bitte Startzahl eingeben: ");
		int n = scanner.nextInt();
		int startNumber = n;
		int max = 1, sequenceLenght = 1;
		
		scanner.close();
		
		System.out.print(n + " ");
		
		while (n != 1) {
			if (n % 2 == 0) {
				n /= 2;
			} else {
				n = (3 * n + 1);
			}
			sequenceLenght++;
			max = ((n > max) ? n : max);
			System.out.print(n + " ");
		}
		System.out.print('\n');
		
		System.out.println("Die Folge war " + sequenceLenght + " Zahlen lang, die höchste Zahl war " + max + " und die Startzahl war " + startNumber + ".");
		
		
	}

}
