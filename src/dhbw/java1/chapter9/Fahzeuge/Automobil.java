package dhbw.java1.chapter9.Fahzeuge;

public class Automobil extends Personenkraftwagen{
	
	private Automobil(int anzahlSitzplaetze, double motorLeistung, double hubraum,
			double verbrauch, double tankgroesse, double tankfuellstand, double kilometerzaehler) {
		super(4, anzahlSitzplaetze, motorLeistung, hubraum,
				verbrauch, tankgroesse, tankfuellstand, kilometerzaehler);
	}
}
