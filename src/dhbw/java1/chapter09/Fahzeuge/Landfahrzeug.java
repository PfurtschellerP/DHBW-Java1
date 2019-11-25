package dhbw.java1.chapter09.Fahzeuge;

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
