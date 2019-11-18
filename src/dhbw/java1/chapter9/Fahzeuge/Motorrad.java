package dhbw.java1.chapter9.Fahzeuge;

public class Motorrad extends Personenkraftwagen {
	
	public Motorrad(double motorLeistung, double hubraum,
			double verbrauch, double tankgroesse, double tankfuellstand, double kilometerzaehler) {
		super(2, 1, motorLeistung, hubraum,
			verbrauch, tankgroesse, tankfuellstand, kilometerzaehler);
	}
}
