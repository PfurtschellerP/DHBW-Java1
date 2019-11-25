package dhbw.java1.chapter07;

public class BruchTest {

	public static void main(String[] args) {

		System.out.println("Auto-Test startet");
		
		int fehler = 0;
		
		System.out.println("Test der toString() Methode");
		
			if (new Bruch(1, 3).toString().equals("1/3")) {
				System.out.print("OK ");
			} else {
				System.out.print("Error ");
				fehler++;
			}
			
			if (new Bruch(2, 4).toString().equals("1/2")) {
				System.out.print("OK ");
			} else {
				System.out.print("Error ");
				fehler++;
			}
			
			if (new Bruch(-2, 3).toString().equals("-2/3")) {
				System.out.print("OK ");
			} else {
				System.out.print("Error ");
				fehler++;
			}
			
			if (new Bruch(2, -3).toString().equals("-2/3")) {
				System.out.print("OK ");
			} else {
				System.out.print("Error ");
				fehler++;
			}
			
			if (new Bruch(-2, -3).toString().equals("2/3")) {
				System.out.print("OK ");
			} else {
				System.out.print("Error ");
				fehler++;
			}
			
			System.out.println();
			
		System.out.println("Test der negiere() Methode");
		
			if (new Bruch(1, 3).negiere().toString().equals("-1/3")) {
				System.out.println("OK ");
			} else {
				System.out.println("Error ");
				fehler++;
			}	
			
		System.out.println("Test der addiere() Methode");
			
			if (new Bruch(1, 3).addiere(new Bruch(1, 2)).toString().equals("5/6")) {
				System.out.println("OK ");
			} else {
				System.out.println("Error ");
				fehler++;
			}
			
		System.out.println("Test der subtrahiere() Methtode");
			
			if (new Bruch(3, 4).subtrahiere(new Bruch(5, 6)).toString().equals("-1/12")) {
				System.out.println("OK ");
			} else {
				System.out.println("Error ");
				fehler++;
			}
			
		System.out.println("Test der kehrwert() Methode");
			
			if (new Bruch(2, 3).kehrwert().toString().equals("3/2")) {
				System.out.println("OK ");
			} else {
				System.out.println("Error ");
				fehler++;
			}
			
		System.out.println("Test der multipliziere() Methode");
		
			if (new Bruch(2, 3).multipliziere(new Bruch(6, 8)).toString().equals("1/2")) {
				System.out.println("OK ");
			} else {
				System.out.println("Error ");
				fehler++;
			}
			
		System.out.println("Test der dividiere() Methode");
			
			if (new Bruch(3, 4).dividiere(new Bruch(5, 6)).toString().equals("9/10")) {
				System.out.println("OK ");
			} else {
				System.out.println("Error ");
				fehler++;
			}
			
		System.out.println("Test der potenzieren() Methode");
			
			if (new Bruch(4, 6).potenziere(3).toString().equals("8/27")) {
				System.out.println("OK ");
			} else {
				System.out.println("Error ");
				fehler++;
			}
			
		System.out.println("Test der istGleich() Methode");
			
			if (new Bruch(1, 2).istGleich(new Bruch(3, 4))) {
				System.out.print("OK ");
			} else {
				System.out.print("Error ");
				fehler++;
			}
			
			if (new Bruch(3, 4).istGleich(new Bruch(6, 8))) {
				System.out.print("OK ");
			} else {
				System.out.print("Error ");
				fehler++;
			}
			
			System.out.println();
		
		System.out.println("Test der toDouble() Methode");
		
			if (new Bruch(3, 4).toDouble() == 0.75) {
				System.out.println("OK ");
			} else {
				System.out.println("Error ");
				fehler++;
			}
		
		System.out.println("Anzahl der Fehler: " + fehler);
	}

}
