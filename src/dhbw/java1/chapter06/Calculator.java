package dhbw.java1.chapter06;

import java.util.Scanner;

public class Calculator {
	
	public static long digitSumRec(long value) {
		if (value == 0) {
			return 0;
		} else {
			return (value % 10) + digitSumRec(value / 10);
		}
	}

	/**
	 * Errechnet die Quesrumme einer Zahl iterativ
	 * @param value Zahl zu der die Quesumme berechnet werden soll
	 * @return Quersumme
	 */
	public static long digitSumIt(long value) {
		long digitSum = 0;
        while (value != 0) {
        	digitSum += value % 10;		// Wir nehmen uns die letzte Zahl und addieren sie zur Summe
        	value /= 10;				// Wir "schneiden die letzte Zahl ab"
		}
        return digitSum;
	}
	
	/**
	 * Errechnet eine Potenz iterativ
	 * @param x Basis
	 * @param n Exponent
	 * @return Potenz
	 */
	public static double powerIt(double x, int n) {
		double potenz = 1;
		for (int i = 1; i <= n; i++) {
			potenz *= x;
		}
		return potenz;
	}
	
	/**
	 * Errechnet eine Potenz rekursiv
	 * @param x Basis
	 * @param n Exponent
	 * @return Potenz
	 */
	public static double powerRec(double x, int n) {
		if (n == 0) {
			return 1;
		} else if (n > 0) {
			return (x * powerRec(x, n-1));
		} else {
			return (1.0 / powerRec(x, -n));
		}
	}
	
	/**
	 * Überprüfen, ob eine Zahl n eine Primzahl ist
	 * @param n Zahl, die geprüft werden soll
	 * @return ist die Zahl eine Primzahl?
	 */
	public static boolean isPrime(long n) {
		if (n > 1) {
			for (long i = 2; i < n; i++) {
				if (n % i == 0) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Überprüfen, ob die Teilermenge einer Zahl doppelt so groß ist wie sie selbst
	 * @param n Zahl, die überprüft werden soll
	 * @return ist die Zahl halb so groß wie ihre Teilermenge?
	 */
	public static boolean isPerfect(long n) {
		return (divisorSum(n) == (2 * n));
	}
	
	/**
	 * Errechnen der Teilersumme einer Zahl n
	 * @param n Zahl, dessen Teilersumme errechnet werden soll
	 * @return Teilersumme von n
	 */
	public static long divisorSum(long n) {
		long sum = 0;
		for (long i = 1; i <= n; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}
		return sum;
	}
	
	/**
	 * Errechnen des harmonischen Mittels zweier Zahlen
	 * @param x erste Zahl
	 * @param y zweite Zahl
	 * @return harmonisches Mittel der beiden Ausgangswerte
	 */
	public static double harmonicAverage(double x, double y) {
		return 2 / ((1.0 / x) + (1.0 / y));
	}
	
	/**
	 * Errechnen des geometrischen Mittels zweier Zahlen
	 * @param x erste Zahl
	 * @param y zweite Zahl
	 * @return geometrisches Mittel der beiden Ausgangswerte
	 */
	public static double geometricalAverage(double x, double y) {
		return Math.sqrt((x * y));
	}
	
	/**
	 * Errechnen der arithmetischen Mittels zweier Zahlen
	 * @param x erste Zahl
	 * @param y zweite Zahl
	 * @return arithmetisches Mittel der beiden Ausgangswerte
	 */
	public static double arithmeticAverage(double x, double y) {
		return (x + y) / 2.0;
	}
	
	/**
	 * Errechnen des Betrags einer ganzen Zahl
	 * @param x Die Zahl, zu welcher der Betrag errechnet werden soll
	 * @return Der Betrag der Zahl
	 */
	public static int abs(int x) {
		if (x > 0) {
			return x;
		} else {
			return (x * (-1));
		}
	}
	
	/**
	 * Errechnen des Betrags einer Gleitkommazahl
	 * @param x Die Zahl, zu welcher der Betrag errechnet werden soll
	 * @return Der Betrag der Zahl
	 */
	public static double abs(double x) {
		if (x > 0) {
			return x;
		} else {
			return (x * (-1));
		}
	}
	
	/**
	 * Prüft, ob eine Zahl gerade ist
	 * 
	 * @param number Die Zahl, welche eingegeben wird
	 * @return True, wenn die Zahl gerade ist und false, wenn sie ungerade ist
	 */
	public static boolean isOdd(int number) {
		return (number % 2 == 0) ? true : false;
	}
	
	public static void main(String[] args) {
		
		System.out.println("====  Mega cooler Kalkualtinator 2000 ====");
		System.out.println("");
		System.out.println("1 - isOdd");
		System.out.println("2 - Betrag (Double)");
		System.out.println("3 - Betrag (Integer)");
		System.out.println("4 - Durchschnitt");
		System.out.println("5 - Teilersumme");
		System.out.println("6 - Teilersumme doppelt so groß, wie Zahl?");
		System.out.println("7 - Primzahltest");
		System.out.println("8 - Potenzen");
		System.out.println("9 - Quersumme");
		
		Scanner scanner = new Scanner(System.in);
		
		int chosenMenueItem = scanner.nextInt();
		
		int number = 0;
		double decimal = 0.0;
		
		switch (chosenMenueItem) {
		case 1:
			System.out.println("Bitte Zahl zum Testen eingeben:");
			number = scanner.nextInt();
			if(isOdd(number)) {
				System.out.println("Die Zahl " + number + " ist gerade");
			} else {
				System.out.println("Die Zahl " + number + " ist ungerade");
			}
			break;
		case 2:
			System.out.println("Bitte Dezimahlzahl, dessen Betrag gebildet werden soll, eingeben:");
			decimal = scanner.nextDouble();
			System.out.println("Der Betrag von " + decimal + " ist " + abs(decimal));
			break;
		case 3:
			System.out.println("Bitte Ganzzahl, dessen Betrag gebildet werden soll, eingeben:");
			number = scanner.nextInt();
			System.out.println("Der Betrag von " + number + " ist " + abs(number));
			break;
		case 4:
			System.out.println("");
			System.out.println("==== Durchschnitt ====");
			System.out.println("1 - arithmetisches Mittel");
			System.out.println("2 - geometrisches Mittel");
			System.out.println("3 - harmonisches Mittel");
			
			int menueItem = scanner.nextInt();
			System.out.println("Bitte Zahl 1 eingeben");
			double firstNumber = scanner.nextDouble();
			System.out.println("Bitte Zahl 2 eingeben");
			double secondNumber = scanner.nextDouble();
			
			switch (menueItem) {
			case 1:
				System.out.println("Das arithmetische Mittel von " + firstNumber + " und " + secondNumber + " ist " + arithmeticAverage(firstNumber, secondNumber));
				break;
			case 2:
				System.out.println("Das geometrische Mittel von " + firstNumber + " und " + secondNumber + " ist " + geometricalAverage(firstNumber, secondNumber));
				break;
			case 3:
				System.out.println("Das harmonische Mittel von " + firstNumber + " und " + secondNumber + " ist " + harmonicAverage(firstNumber, secondNumber));
			}
			break;
		default:
			main(args);
			
		}
		
		scanner.close();
//		Zu Nummer 3
//		System.out.println(arithmeticAverage(2, 4));
//		System.out.println(geometricalAverage(1, 4));
//		System.out.println(harmonicAverage(1, 4));
		
//		Zu Nummer 4
//		System.out.println(divisorSum(4));
//		System.out.println(isPerfect(6));
		
//		Zu Nummer 5
//		System.out.println(isPrime(11));
		
//		Zu Nummer 6
//		System.out.println(powerRec(5, -1));
//		System.out.println(powerIt(2, 5));
		
//		Zu Nummer 7
//		System.out.println(digitSum(123));
	
//		Zu Nummer 8
//		System.out.println(digitSumRec(12345));
	}

}
