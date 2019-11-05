package dhbw.java1.chapter7;

/**
 * Klasse, die ein Auto Objekt erzeugt
 * @author Patrick Pfurtscheller
 *
 */
public class Auto {
	public static int autoAnzahl;
	public String kennzeichen;
	public String modell;
	public int insassenAnzahl;
	public int tankInhalt;
	
	/**
	 * Konstruktor mit zwei Parametern
	 * @param kennzeichen Kennzeichen des Autos
	 * @param modell Modell des Autos
	 */
	public Auto(String kennzeichen, String modell) {
		autoAnzahl++;
		this.kennzeichen = kennzeichen;
		this.modell = modell;
	}
	
	/**
	 * Fügt Insassen zum Auto Objekt hinzu
	 * @param insassen Anzahl Personen, die einsteigen
	 * @return aktuelle Anzahl an Insassen
	 */
	public int einsteigen(int insassen) {
		insassenAnzahl += insassen;
		return insassenAnzahl;
	}

	/**
	 * Entfernt Insassen aus dem Auto Objekt
	 * @param insassen Anzahl Personen, ausstaeigen
	 * @return aktuelle Anzahl an Insassen
	 */
	public int aussteigen(int insassen) {
		insassenAnzahl -= insassen;
		return insassenAnzahl;
	}

	/**
	 * Fügt dem Objekt Auto Kraftstoff hinzu
	 * @param liter Kraftstoff in Litern
	 * @return aktueller Füllstand
	 */
	public int tanke(int liter) {
		tankInhalt += liter;
		return tankInhalt;
	}

	/**
	 * Vermindert den Kraftstoff des Auto Objektes
	 * @param liter Kraftstoff in Litern
	 * @return aktueller Füllstand
	 */
	public int verbrauche(int liter) {
		tankInhalt -= liter;
		return tankInhalt;
	}

}
