package dhbw.java1.chapter7;
public class TaschenrechnerDemo {
    public static void main(String[] args) {
        Taschenrechner tr1 = new Taschenrechner("123", "TI-30X Pro");      // Objekt-Instanziierung
        tr1.druckeDaten();

        System.out.println();
        
        Taschenrechner tr2 = new Taschenrechner("456", "HP-12C", new Person("Daffy", "Duck", 1989));      // Objekt-Instanziierung
        tr2.druckeDaten();
        
        System.out.println();
        
        Taschenrechner tr3 = new Taschenrechner("789", null, new Person("Ich", "Selbst", 1999));
        tr3.druckeDaten();
        Taschenrechner.druckeAnzahl();
    }
}