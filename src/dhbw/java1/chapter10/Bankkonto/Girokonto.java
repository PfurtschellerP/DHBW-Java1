package dhbw.java1.chapter10.Bankkonto;

/**
 * Girokonto
 * @author Patrick Pfurtscheller
 *
 */
public class Girokonto extends Konto {
	
	private static final double GUTHABENSZINS = 0.02;
	
	public Girokonto(long nummer) {
		super(nummer, GUTHABENSZINS);
		this.einzahlen(50);
	}

	public static void main(String[] args) {
		
		

	}

}
