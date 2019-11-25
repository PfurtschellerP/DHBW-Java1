package dhbw.java1.chapter10.Bankkonto;
/**
 * Ein Konto mit Kontonummer und Saldo, das Ein- und Auszahlungen unterstützt.
 * 
 * @author Patrick Pfurtscheller
 */
public abstract class Konto {
    private final long nummer;      // Kontonummer
    private double saldo = 0;       // aktueller Saldo
    private double guthabenszins;	// Guthabeszins (z.B. 0.02 für 2%)

    /**
     * Konto-Konstruktor.
     * 
     * @param nummer Kontonummer
     */
    public Konto(long nummer, double guthabenszins) {
        super();                    // optional
        this.nummer = nummer;
        this.guthabenszins = guthabenszins;
    }

    /**
     * Liefert die Kontonummer.
     * 
     * @return Kontonummer
     */
    public long getNummer() {
        return nummer;
    }

    /**
     * Liefert den aktuellen Saldo des Kontos.
     * 
     * @return Saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Erhöht den Saldo um den genannten Betrag.
     * 
     * @param betrag negative Werte werden ignoriert
     */
    public void einzahlen(double betrag) {
        if (betrag > 0) {
            saldo += betrag;
        }
    }

    /**
     * Vermindert den Saldo um den genannten Betrag.
     * 
     * @param betrag negative Werte werden ignoriert
     */
    public void auszahlen(double betrag) {
        if (betrag > 0) {
        	saldo -= betrag;
        }
    }

    public double getGuthabenszins() {
    	return guthabenszins;
    }
    
    public void guthabenVerzinsen() {
    	saldo += (saldo * guthabenszins);
    }
    
    @Override
    public String toString() {
        return nummer + ": " + saldo + " Euro";
    }
    
}