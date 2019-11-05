package dhbw.java1.chapter5;

import java.util.Scanner;

/**
 * Rechnet zwei Zahlen gemäß dem gewälten operator zusammen
 * 
 * @author Patrick Pfurtscheller
 *
 */
public class Calculator {

	/**
	 * @param args not used
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Bitte erste Zalh eingeben:");
		double numberA = scanner.nextDouble();
			
		System.out.println("Bitte zweite Zahl eingeben:");
		double numberB = scanner.nextDouble();
		
		System.out.println("Bitte Operator eingeben");
		String operator = scanner.next();			
		
		scanner.close();
		
		double solution = 0;
		
		boolean valid = true;
		
		switch (operator) {
		case "+":
			solution = numberA + numberB;
			break;
		case "-":
			solution = numberA - numberB;
			break;
		case "*":
			solution = numberA * numberB;
			break;
		case "/":
			solution = numberA / numberB;
			break;
		default:
			System.out.println("Ungültiger Operator");
			valid = false;
		}
		if (valid) {
			System.out.println("Das Ergebnis von " + numberA + " " + operator + " " + numberB + " = " + solution);
		} else {
			System.out.println("Das Ergebnis konnte leider nicht errechnet werden");
		}
		
		
	}

}
