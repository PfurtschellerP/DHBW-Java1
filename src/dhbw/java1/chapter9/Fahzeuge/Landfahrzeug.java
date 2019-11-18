package dhbw.java1.chapter9.Fahzeuge;

public class Landfahrzeug extends Fahrzeug {
	private int anzahlRaeder;
	
	protected Landfahrzeug(int anzahlRaeder, int anzahlSitzplaetze) {
		super(anzahlSitzplaetze);
		this.anzahlRaeder = anzahlRaeder;
	}
	
	public int getAnzahlRaeder() {
		return anzahlRaeder;
	}
}
