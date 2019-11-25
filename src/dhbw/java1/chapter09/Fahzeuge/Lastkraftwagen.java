package dhbw.java1.chapter09.Fahzeuge;

public class Lastkraftwagen extends Kraftfahrzeug {
	private double maximaleLadung;
	private double momentaneLadung;
	private boolean hatAnhaenger;
	private String transportunternehmen;
	
	public Lastkraftwagen(int anzahlRaeder, int anzahlSitzplaetze, double motorLeistung, double hubraum,
			double verbrauch, double tankgroesse, double tankfuellstand, double kilometerzaehler, double maximaleLadung,
			double momentaneLadung, boolean hatAnhaenger, String transportunternehmen) {
		super(anzahlRaeder, anzahlSitzplaetze, motorLeistung, hubraum,
			verbrauch, tankgroesse, tankfuellstand, kilometerzaehler);
		this.maximaleLadung = maximaleLadung;
		this.momentaneLadung = momentaneLadung;
		this.hatAnhaenger = hatAnhaenger;
		this.transportunternehmen = transportunternehmen;
	}

	public double getMomentaneLadung() {
		return momentaneLadung;
	}

	public void setMomentaneLadung(double momentaneLadung) {
		this.momentaneLadung = momentaneLadung;
	}

	public boolean isHatAnhaenger() {
		return hatAnhaenger;
	}

	public void setHatAnhaenger(boolean hatAnhaenger) {
		this.hatAnhaenger = hatAnhaenger;
	}

	public String getTransportunternehmen() {
		return transportunternehmen;
	}

	public void setTransportunternehmen(String transportunternehmen) {
		this.transportunternehmen = transportunternehmen;
	}

	public double getMaximaleLadung() {
		return maximaleLadung;
	}
}
