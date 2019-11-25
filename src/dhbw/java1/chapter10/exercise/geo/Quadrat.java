package dhbw.java1.chapter10.exercise.geo;

public class Quadrat extends Rechteck {
	
	public Quadrat(double seiteA) {
		super(seiteA, seiteA);
	}

	@Override
	public String getBeschreibung() {
		return "Diese Figur ist ein Quadrat";
	}

}
