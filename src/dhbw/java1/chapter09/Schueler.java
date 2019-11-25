package dhbw.java1.chapter09;
public class Schueler extends Person {          // Schueler ist Subklasse von Person
    private String schuelernummer;              // eigene Instanzvariablen
    private String klasse;

    public Schueler(String vorname, String nachname, int geburtsjahr, String schuelernummer, String klasse) {
        super(vorname, nachname, geburtsjahr);      // eigener Superkonstruktor-Aufruf
        this.schuelernummer = schuelernummer;
        this.klasse = klasse;
    }

    public String getSchuelernummer() {         // Getter für eigene Instanzvariable
        return schuelernummer;
    }

    public String getKlasse() {                 // Getter für eigene Instanzvariable
        return klasse;
    }
    public void setKlasse(String klasse) {      // Setter für eigene Instanzvariable
        this.klasse = klasse;
    }
}