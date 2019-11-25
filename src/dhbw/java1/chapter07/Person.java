package dhbw.java1.chapter07;
public class Person {
    public String vorname;                                              // Instanzvariablen
    public String nachname;
    public int geburtsjahr;

    public Person(String vorname, String nachname, int geburtsjahr) {   // Konstruktor
        this.vorname = vorname;
        this.nachname = nachname;
        this.geburtsjahr = geburtsjahr;
    }

    public void druckeDaten() {                                         // Datenausgabe
        System.out.println(vorname + " " + nachname + " *" + geburtsjahr);
    }
}