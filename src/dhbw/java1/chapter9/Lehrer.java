package dhbw.java1.chapter9;
public class Lehrer extends Person {            // Lehrer ist Subklasse von Person
    private String personalnummer;              // eigene Instanzvariablen
    private double gehalt;

    public Lehrer(String vorname, String nachname, int geburtsjahr, String personalnummer, double gehalt) {
        super(vorname, nachname, geburtsjahr);      // eigener Superkonstruktor-Aufruf
        this.personalnummer = personalnummer;
        this.gehalt = gehalt;
    }

    public String getPersonalnummer() {         // Getter für eigene Instanzvariable
        return personalnummer;
    }

    public double getGehalt() {                 // Getter für eigene Instanzvariable
        return gehalt;
    }
    public void setGehalt(double gehalt) {      // Setter für eigene Instanzvariable
        this.gehalt = gehalt;
    }
}