package dhbw.java1.chapter9.Fahzeuge;

public class Fahrzeug {
	private int anzahlSitzplaetze;
	
	protected Fahrzeug(int anzahlSietzplaetze) {
		this.anzahlSitzplaetze = anzahlSietzplaetze;
	}
	
	public int getAnzahlSitzplaetze(){
		return anzahlSitzplaetze;
	}
	
}
