package dhbw.java1.chapter08;

public class Vektor {
	
	private final double x1, x2, x3;
	
	/**
	 * <b>Konstruktor der Klasse Vektor</b>
	 * @param x1 erster Wert des Vektors
	 * @param x2 zweiter Wert des Vektors
	 * @param x3 dritter Wert des Vektors
	 */
	public Vektor(double x1, double x2, double x3) {
		this.x1 = x1;
		this.x2 = x2;
		this.x3 = x3;
	}
	
	/**
	 * <b>Gibt den Vektor so anschaulich wie möglich als String aus</b>
	 */
	public String toString() {
		String newline = System.getProperty("line.separator");
		return ("(" + this.x1 + ")" + newline + "(" + this.x2 + ")" + newline + "(" + this.x3 + ")");
	}
	
	/**
	 * <b>Bildet den Gegenvektor</b>
	 * @return
	 */
	public Vektor gegenvektor() {
		return new Vektor(this.x1 * (-1), this.x2 * (-1), this.x3 * (-1));
	}
	
	/**
	 * <b>Addiert Vektoren</b>
	 * @param summand zweiter Vektor
	 * @return Summenvektor
	 */
	public Vektor addiere(Vektor summand) {
		return new Vektor(this.x1 + summand.x1, this.x2 + summand.x2, this.x3 + summand.x3);
	}
	
	/**
	 * <b>Subtrahiert Vektoren</b>
	 * @param subtrahend zweiter Vektor
	 * @return Differenzvektor
	 */
	public Vektor subtrahiere(Vektor subtrahend) {
		return new Vektor(this.x1 - subtrahend.x1, this.x2 - subtrahend.x2, this.x3 - subtrahend.x3);
	}
	
	/**
	 * <b>Multiplikation eines Vektors mit einem Skalar</b>
	 * @param skalar 
	 * @return
	 */
	public Vektor multipliziere(double skalar) {
		return new Vektor(this.x1 * skalar, this.x2 * skalar, this.x3 * skalar);
	}
	
	/**
	 * <b>Errechnen des Skalarprodukts zweier Vektoren</b>
	 * @param vektor zweiter Vektor
	 * @return Skalarprodukt
	 */
	public double skalarprodukt(Vektor vektor) {
		return this.x1 * vektor.x1 + this.x2 * vektor.x2 + this.x3 * vektor.x3;
	}
	
	/**
	 * <b>Bildet das Kreuzprodukt zweier Vektoren</b>
	 * @param vektor zweiter Vektor
	 * @return Kreuzprodukt
	 */
	public Vektor kreuzprodukt(Vektor vektor) {
		double neuesX1 = this.x2 * vektor.x3 - this.x3 * vektor.x2;
		double neuesX2 = this.x3 * vektor.x1 - this.x1 * vektor.x3;
		double neuesX3 = this.x1 * vektor.x2 - this.x2 * vektor.x1;
		return new Vektor(neuesX1, neuesX2, neuesX3);
	}
	
	/**
	 * <b>Errechnet das Spatprodukt dreier Vektoren</b>
	 * @param vektor1 zweiter Vektor
	 * @param vektor2 dritter Vektor
	 * @return
	 */
	public double spatprodukt(Vektor vektor1, Vektor vektor2) {
		return this.skalarprodukt(vektor1.kreuzprodukt(vektor2));
	}
	
	/**
	 * <b>Errechnet die Länge eines Vektors (den Betrag)</b>
	 * @return Länge / Betrag des Vektors
	 */
	public double laenge() {
		return Math.sqrt(Math.pow(this.x1, 2) + Math.pow(this.x2, 2) + Math.pow(this.x3, 2));
	}
	
	public double flaeche(Vektor vektor) {
		return this.kreuzprodukt(vektor).laenge();
	}
	
	/**
	 * <b>Bildet das Volumen eines Spates</b>
	 * @param vektor1 zweiter Vektor
	 * @param vektor2 dritter Vektor
	 * @return Volumen
	 */
	public double volumen(Vektor vektor1, Vektor vektor2) {
		double volumen = this.spatprodukt(vektor1, vektor2);
		return (volumen < 0) ? (volumen * (-1)) : volumen;
	}
	
	/**
	 * <b>Bildet den Einheitsvektor</b>
	 * @return Einheitsvektor (Vektor der Länge 1)
	 */
	public Vektor normiere() {
		double laenge = this.laenge();
		return new Vektor(this.x1 / laenge, this.x1 / laenge, this.x3 / laenge);
	}
	
	/**
	 * <b>Errechnet den Winkel zwischen zwei Vektoren</b> <br>
	 * 
	 * <b>Formel:</b> <code>alpha = sin^-1( skalarprodukt / ( länge1 * länge2 ) )</code><br>
	 * Die Funktion Math.asin() gibt den Wert aber im Bogenmaß aus, wesegen Math.toDegrees() vorgeschaltet ist
	 *
	 * @param vektor zweiter Vektor
	 * @return Winkel (in Grad)
	 */
	public double winkel(Vektor vektor) {
		return Math.toDegrees(Math.acos(this.skalarprodukt(vektor) / (this.laenge() * vektor.laenge())));
	}
	
	/**
	 * <b> Überprüft, ob ein Vektor ein Nullvektor ist</b>
	 * @return
	 */
	public boolean istNullvektor() {
		return (this.x1 == 0 & this.x2 == 0 & this.x3 == 0);
	}
	
	/**
	 * <b>Überprüft, ob ein Vektor ein Einheitsvektor ist </b>
	 * @return
	 */
	public boolean istEinheitsvektor() {
		return (this.laenge() == 1);
	}
	
	/**
	 * <b>Überprüft, ob ein Vektor zu einem anderen orthogonal ist (im rechten Winkel zu ihm steht)</b>
	 * @param vektor zweiter Vektor
	 * @return
	 */
	public boolean istOrthogonal(Vektor vektor) {
		return (this.skalarprodukt(vektor) == 0);
	}
	
	/**
	 * <b>Überprüft, ob ein Vektor zu einem anderen kollinear (parallel oder antiparallel) ist</b>
	 * @param vektor zweiter Vektor
	 * @return
	 */
	public boolean istKollinear(Vektor vektor) {
		return (this.istParallel(vektor) | this.istAntiparallel(vektor));
	}
	
	/**
	 * <b>Überprüft, ob ein Vektor zu einem anderen parallel ist</b>
	 * @param vektor zweiter Vektor
	 * @return
	 */
	public boolean istParallel(Vektor vektor) {
		return (this.winkel(vektor) == 0);
	}
	
	/**
	 * <b>Überprüft, ob ein Vektor zu einem anderen antiparallel ist</b>
	 * @param vektor zweiter Vektor
	 * @return
	 */
	public boolean istAntiparallel(Vektor vektor) {
		return (this.winkel(vektor) == 180);
	}
	
	/**
	 * <b>Überprüft ob zwei Vektoren gleich sind</b>
	 * @param vektor zweiter Vektor
	 * @return
	 */
	public boolean istGleich(Vektor vektor) {
		return (this.x1 == vektor.x1 & this.x2 == vektor.x2 & this.x3 == vektor.x3);
	}

}
