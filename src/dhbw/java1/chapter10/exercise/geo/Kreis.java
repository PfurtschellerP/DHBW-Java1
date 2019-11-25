package dhbw.java1.chapter10.exercise.geo;

public class Kreis extends GeometrischeFigur {
	protected double radius;
	
	public Kreis(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	@Override
	public double getFlaeche() {
		return Math.PI*radius*radius;
	}

	@Override
	public double getUmfang() {
		return 2*Math.PI*radius;
	}

	@Override
	public String getBeschreibung() {
		return "Diese Figur ist ein Kreis";
	}
	
}
