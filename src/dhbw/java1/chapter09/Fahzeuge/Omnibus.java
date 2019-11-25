package dhbw.java1.chapter09.Fahzeuge;

public class Omnibus extends Personenkraftwagen{

	private String verkehrsVerbund;
	
	public Omnibus(int anzahlRaeder, int anzahlSitzplaetze, double motorLeistung, double hubraum,
			double verbrauch, double tankgroesse, double tankfuellstand, double kilometerzaehler, String verkehrsVerbund) {
		super(anzahlRaeder, anzahlSitzplaetze, motorLeistung, hubraum,
			verbrauch, tankgroesse, tankfuellstand, kilometerzaehler);
		this.verkehrsVerbund = verkehrsVerbund;
	}

	public String getVerkehrsVerbund() {
		return verkehrsVerbund;
	}

	public void setVerkehrsVerbund(String verkehrsVerbund) {
		this.verkehrsVerbund = verkehrsVerbund;
	}
}
