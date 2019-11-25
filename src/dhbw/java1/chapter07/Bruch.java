package dhbw.java1.chapter07;

public class Bruch {

	public final long zaehler, nenner;
	
// Hilfsmethoden
	
	private static long ggt(long zahl1, long zahl2) {
		while (zahl2 != 0) {
		   if (zahl1 > zahl2) {
			   zahl1 = zahl1 - zahl2;
		   } else {
			   zahl2 = zahl2 - zahl1;
		   }
	   }
	   return zahl1;
	}
	
	
// Wichtige Methoden

	/**
	 * Konstruktor der Klasse Bruch
	 * @param zaehler
	 * @param nenner
	 */
	public Bruch(long zaehler, long nenner) {
		if (nenner < 0) {			// von vornerein ausschließen, dass der Nenner negativ sein kann
			nenner *= (-1);
			zaehler *= (-1);
		}
		
		this.zaehler = zaehler;
		this.nenner = nenner;
		
	}
	
	/**
	 * Negiert Brüche
	 * @return negierter Bruch
	 */
	public Bruch negiere() {
		return new Bruch(this.zaehler * (-1), this.nenner);
	}
	
	/**
	 * Kürzt Brüche
	 * @param bruch Bruch, der gekürzt werden soll
	 * @return gekürtzter Bruch
	 */
	public Bruch kuerzen(Bruch bruch) {
		long teiler = 0;
		if (bruch.zaehler < 0) {	// sicherstellen, dass die ggt Methode keinen Wert kleiner null bekommt
			teiler = ggt(bruch.zaehler * (-1), bruch.nenner);
		} else {
			teiler = ggt(bruch.zaehler, bruch.nenner);
		}
		return new Bruch(bruch.zaehler / teiler, bruch.nenner / teiler);
		
	}
	
	/**
	 * Addiert zwei Brüche
	 * @param summand Bruch, der zum ersten addiert werden soll
	 * @return Summe
	 */
	public Bruch addiere(Bruch summand) {
		if (this.nenner == summand.nenner) {
			return new Bruch(this.zaehler + summand.zaehler, this.nenner);
		} else {
			long neuerNenner = this.nenner * summand.nenner;							// Auf einen Nenner kommen
			long neuerErsterZaehler = this.zaehler * (neuerNenner / this.nenner);			// Brüche erweitern
			long neuerZweiterZaehler = summand.zaehler * (neuerNenner / summand.nenner);
			return kuerzen(new Bruch(neuerErsterZaehler + neuerZweiterZaehler, neuerNenner));
		}
	}
	
	/**
	 * Subtrahiert zwei Brüche voneinander
	 * @param subtrahend Bruch, der vom ersten abgezogen werden soll
	 * @return Differenz
	 */
	public Bruch subtrahiere(Bruch subtrahend) {
		if (this.nenner == subtrahend.nenner) {
			return new Bruch(this.zaehler - subtrahend.zaehler, this.nenner);
		} else {
			long neuerNenner = this.nenner * subtrahend.nenner;							// Auf einen Nenner kommen
			long neuerErsterZaehler = this.zaehler * (neuerNenner / this.nenner);			// Brüche erweitern
			long neuerZweiterZaehler = subtrahend.zaehler * (neuerNenner / subtrahend.nenner);
			return kuerzen(new Bruch(neuerErsterZaehler - neuerZweiterZaehler, neuerNenner));
		}
	}
	
	/**
	 * @return Kerwert des Bruchs
	 */
	public Bruch kehrwert() {
		return new Bruch(nenner, zaehler);	
	}
	
	/**
	 * Multiplizieren zweier Brüche
	 * @param faktor Bruch mit dem der erste multipliziert werden soll
	 * @return Produkt
	 */
	public Bruch multipliziere(Bruch faktor) {
		return kuerzen(new Bruch(this.zaehler * faktor.zaehler, this.nenner * faktor.nenner));
	}
	
	/**
	 * Dividieren zweier Brüche
	 * @param divisor Bruch durch den der erste geteilt werden soll
	 * @return Quotient
	 */
	public Bruch dividiere(Bruch divisor) {
		divisor = divisor.kehrwert();
		return this.multipliziere(divisor);
	}
	
	/**
	 * Potenzieren eines Bruches
	 * @param exponent der Exponent
	 * @return der potenzierte Bruch
	 */
	public Bruch potenziere(int exponent) {
		long neuerZaehler = 1;
		long neuerNenner = 1;
		for (int i = 1; i <= exponent; i++) {
			neuerZaehler *= this.zaehler;
			neuerNenner *= this.nenner;
		}
		return kuerzen(new Bruch(neuerZaehler, neuerNenner));
	}
	
	/**
	 * Vergleich zweier Brüche
	 * @param bruch Bruch, der mit dem ursprünglichen Bruch verglichen werden soll
	 * @return sind die Brüche gleich?
	 */
	public boolean istGleich(Bruch bruch) {		
		String ersterBruch = kuerzen(this).toString();
		String zweiterBruch = kuerzen(bruch).toString();		
		return (ersterBruch.equals(zweiterBruch));
	}
	
	/**
	 * Ausgabe des Bruchs als Fließkommazahl
	 * @return Bruch als Fließkommazahl
	 */
	public double toDouble() {
		double dividend = this.zaehler;
		double divisor = this.nenner;
		return dividend / divisor;
	}
	
	/**
	 * Ausgabe des Bruchs als String
	 * @return Bruch als String
	 */
	public String toString() {
		return kuerzen(this).zaehler + "/" + kuerzen(this).nenner;
	}

}
