package dhbw.java1.chapter10.Bankkonto;

/**
 * Sparbuch
 * 
 * @author Patrick Pfurtscheller
 *
 */
public class Sparbuch extends Konto{
	
	private static final double GUTHABENSZINS = 0.02;
	
	/**
	 * Sparbuch Konstruktor
	 * @param nummer
	 */
	public Sparbuch(long nummer) {
		super(nummer, GUTHABENSZINS);
	}
	
	@Override
	public void auszahlen(double betrag) {
		if ((this.getSaldo() - betrag) >= 0) {
			super.auszahlen(betrag);
		} else {
			throw new RuntimeException("Es wurde versuch mehr auszuzahlen, als vorhanden war");
		}
	}

	public static void main(String[] args) {
		
	Sparbuch sparbuch = new Sparbuch(1);
	
	sparbuch.einzahlen(50.25);
	
	System.out.println(sparbuch);
	
	sparbuch.guthabenVerzinsen();
	
	System.out.println(sparbuch);
	
//	sparbuch.auszahlen(60); // Dieser Ausdruck wirft einen Fehler aus
	

	}

}
