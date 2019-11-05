package dhbw.java1.aLotOfTests;

/**
 * Eine lustige Klasse
 * @author Patrick Pfurtscheller
 *
 */
public class Variables {
	/**
	 * Coole Main Methode
	 * @param args
	 */
	public static void main(String[] args) {
		int x;			// Deklaration der Intergervariablen x
		x = 10;			// Initialisierung von x mit dem Wert 10 
		System.out.println("x = " + x);
		
		int y = 20;		// Deklaration und Initialisierung der Variablen y
		System.out.println("y = " + y);
		
		int z = x + y;	// Deklaration und Initialisierung der Variblen z
		System.out.println("z = " + z);
		
		int s, t = 5;	// Deklaration von zwei Variablen, eine wird auch initialisiert
		s = t;			// die zweite anschließend mit demselben Wert
		System.out.println("s = " + s);
		System.out.println("t = " + t);
		
		t = t + s;		// nachträgliche Wertänderung der Variablen t
		System.out.println("t = " + t);
		
		char buchstabe;
		buchstabe = 'T';
		System.out.println("Die Buchstaben Variable ist gerade " + buchstabe);
		
	}
}
