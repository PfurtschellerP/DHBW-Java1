package dhbw.java1.chapter07;

public class Taschenrechner {
	private static int taschenrechnerAnzahl = 0;
	
	private String seriennummer;
	private String modell;
	private Person besitzer;
	
	public Taschenrechner(String seriennummer, String modell) {		// Konstruktor mit zwei Parametern
		taschenrechnerAnzahl++;
		this.seriennummer = seriennummer;
		this.modell = modell;
	}
	
	/**
	 * Konstruktor der Klasse Taschenrechner
	 * 
	 * @param seriennummer Seriennummer
	 * @param modell  Modell
	 * @param besitzer  Besitzer
	 */
	public Taschenrechner(String seriennummer, String modell, Person besitzer) {		// Konstruktor mit drei Parametern
		this(seriennummer, modell);
		this.besitzer = besitzer;
	}
	
	public static void druckeAnzahl() {
		System.out.println("Taschenrechner-Anzahl: " + taschenrechnerAnzahl);
	}
	
	public void druckeDaten() {
		System.out.println("Seriennummer: " + seriennummer);
		System.out.println("Modell: " + modell);
        if (besitzer != null) {         // ist ein Besitzer vorhanden?
            System.out.print("Besitzer: ");
            besitzer.druckeDaten();     // Besitzer druckt seine Daten selbst aus
            System.out.println();
        }
	}
}
