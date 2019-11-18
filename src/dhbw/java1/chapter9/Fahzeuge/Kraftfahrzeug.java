package dhbw.java1.chapter9.Fahzeuge;

public class Kraftfahrzeug extends Landfahrzeug{
	private double motorLeistung;		// in ps
	private double hubraum;				// in l
	private double verbrauch;			// in l/100km
	private double tankgroesse;			// in l
	private double tankfuellstand;		// in l
	private double kilometerzaehler;	// in km
	
	protected Kraftfahrzeug(int anzahlRaeder, int anzahlSitzplaetze, double motorLeistung, double hubraum,
			double verbrauch, double tankgroesse, double tankfuellstand, double kilometerzaehler) {
		super(anzahlRaeder, anzahlSitzplaetze);
		this.motorLeistung = motorLeistung;
		this.hubraum = hubraum;
		this.verbrauch = verbrauch;
		this.tankgroesse = tankgroesse;
		this.tankfuellstand = tankfuellstand;
		this.kilometerzaehler = kilometerzaehler;
	}

	public double getVerbrauch() {
		return verbrauch;
	}

	public void setVerbrauch(double verbrauch) {
		this.verbrauch = verbrauch;
	}

	public double getTankfuellstand() {
		return tankfuellstand;
	}

	public void setTankfuellstand(double tankfuellstand) {
		this.tankfuellstand = tankfuellstand;
	}

	public double getKilometerzaehler() {
		return kilometerzaehler;
	}

	public void setKilometerzaehler(double kilometerzaehler) {
		this.kilometerzaehler = kilometerzaehler;
	}

	public double getMotorLeistung() {
		return motorLeistung;
	}

	public double getHubraum() {
		return hubraum;
	}

	public double getTankgroesse() {
		return tankgroesse;
	}
	
}
