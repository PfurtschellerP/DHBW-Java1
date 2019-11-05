package dhbw.java1.chapter8;

public class Vektor {
	
	private final double x1, x2, x3;
	
	public Vektor(double x1, double x2, double x3) {
		this.x1 = x1;
		this.x2 = x2;
		this.x3 = x3;
	}
	
	public String toString() {
		String newline = System.getProperty("line.separator");
		return ("(" + this.x1 + ")" + newline + "(" + this.x2 + ")" + newline + "(" + this.x3 + ")");
	}
	
	public Vektor gegenvektor() {
		return new Vektor(this.x1 * (-1), this.x2 * (-1), this.x3 * (-1));
	}
	
	public Vektor addiere(Vektor summand) {
		return new Vektor(this.x1 + summand.x1, this.x2 + summand.x2, this.x3 + summand.x3);
	}
	
	public Vektor subtrahiere(Vektor subtrahend) {
		return new Vektor(this.x1 - subtrahend.x1, this.x2 - subtrahend.x2, this.x3 - subtrahend.x3);
	}
	
	public Vektor multipliziere(double skalar) {
		return new Vektor(this.x1 * skalar, this.x2 * skalar, this.x3 * skalar);
	}
	
	public double skalarprodukt(Vektor vektor) {
		return this.x1 * vektor.x1 + this.x2 * vektor.x2 + this.x3 * vektor.x3;
	}
	
	public Vektor kreuzprodukt(Vektor vektor) {
		double neuesX1 = this.x2 * vektor.x3 - this.x3 * vektor.x2;
		double neuesX2 = this.x3 * vektor.x1 - this.x1 * vektor.x3;
		double neuesX3 = this.x1 * vektor.x2 - this.x2 * vektor.x1;
		return new Vektor(neuesX1, neuesX2, neuesX3);
	}
	
	public double spatprodukt(Vektor vektor1, Vektor vektor2) {
		return skalarprodukt(vektor1.kreuzprodukt(vektor2));
	}
	
	public double laenge() {
		return Math.sqrt(Math.pow(this.x1, 2) + Math.pow(this.x2, 2) + Math.pow(this.x3, 2));
	}
	
	public double flaeche(Vektor vektor) {
		return this.kreuzprodukt(vektor).laenge();
	}

}
