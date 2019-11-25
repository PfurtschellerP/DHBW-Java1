package dhbw.java1.chapter10.exercise.geo;

public class Dreieck extends GeometrischeFigur {
	protected double seiteA, seiteB, seiteC;
	
	public Dreieck(double seiteA, double seiteB, double seiteC) {
		this.seiteA = seiteA;
		this.seiteB = seiteB;
		this.seiteC = seiteC;
	}

	@Override
	public double getFlaeche() {
		double halberUmfang = (getUmfang() / 2);
		return Math.sqrt(halberUmfang * (halberUmfang - seiteA) * (halberUmfang - seiteB) * (halberUmfang - seiteC));
	}

	@Override
	public double getUmfang() {
		return (seiteA + seiteB + seiteC);
	}

	@Override
	public String getBeschreibung() {
		return "Diese Figur ist ein Dreieck";
	}}
