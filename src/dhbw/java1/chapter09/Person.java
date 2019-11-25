package dhbw.java1.chapter09;
public class Person {
    private String vorname;
    private String nachname;
    private int geburtsjahr;

    public Person(String vorname, String nachname, int geburtsjahr) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.geburtsjahr = geburtsjahr;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public int getGeburtsjahr() {
        return geburtsjahr;
    }

    public String getName() {
        return vorname + " " + nachname;
    }
    public String toString() {
        return getName() + " *" + geburtsjahr;
    }
}