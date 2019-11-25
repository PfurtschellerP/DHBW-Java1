package dhbw.java1.chaper04;
import java.util.Scanner;

public class Ostertag {

	public static void main(String[] args) {
		int jahr = 0;
		int k, p, q, M, N, a, b, c, d, t, e, tag, monat;
		
		Scanner Jahreszahl = new Scanner( System.in );		//Nutzereingabe einfordern
		System.out.print("Bitte Jahreszahl eingeben:");
		try {
			jahr = Integer.parseInt(Jahreszahl.next());
			Jahreszahl.close();
			
			k = jahr / 100;
			p = (8 * k + 13) / 25;
			q = k / 4;
			M = (15 + k - p - q) % 30;
			N = (4 + k - q) % 7;
			a = jahr % 19;
			b = jahr % 4;
			c = jahr % 7;
			d = (19 * a + M) % 30;
			e = (2 * b + 4 * c + 6 * d + N) % 7;
			t = 22 + d + e;
			
			if (t < 32) {
				tag = t;
				monat = 3;
			} else {
				tag = t - 31;
				monat = 4;
			}
			
			System.out.println("Ostern findet im Jahr " + jahr + " am " + tag + "." + monat + ". statt.");
			
		} catch(NumberFormatException r) {
			System.out.print("Keine gültige Jahreszahl!");
		}
		
		

	}

}
