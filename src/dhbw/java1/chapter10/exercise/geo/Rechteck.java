package dhbw.java1.chapter10.exercise.geo;

public class Rechteck extends GeometrischeFigur {
	protected double seiteA, seiteB;
	
	public Rechteck(double seiteA, double seiteB) {
		this.seiteA = seiteA;
		this.seiteB = seiteB;
	}
	
	public double getSeiteA() {
		return seiteA;
	}
	
	public double getSeiteB() {
		return seiteB;
	}

	@Override
	public double getFlaeche() {
		return seiteA * seiteB;
	}

	@Override
	public double getUmfang() {
		return (2 * seiteA + 2 * seiteB);
	}

	@Override
	public String getBeschreibung() {
		return "Diese Figur ist ein Rechteck";
	}
	

}
