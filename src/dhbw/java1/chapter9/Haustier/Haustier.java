package dhbw.java1.chapter9.Haustier;
public class Haustier {
    private String name;
    private int anzahlBeine;

    protected Haustier(String name, int anzahlBeine) {
        super();                                        // optional
        this.name = name;
        this.anzahlBeine = anzahlBeine;
    }

	public String getName() {
		return name;
	}

	public int getAnzahlBeine() {
		return anzahlBeine;
	}
	
	public String toString() {
		return this.name + " hat " + anzahlBeine + " Beine";
	}

//	public static void main(String[] args) {
//		
//		System.out.println(new Haustier("Hugo", 45));
//	}
	
}