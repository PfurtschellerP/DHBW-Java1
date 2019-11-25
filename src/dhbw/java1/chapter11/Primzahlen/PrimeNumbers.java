package dhbw.java1.chapter11.Primzahlen;
import java.util.Scanner;
import dhbw.java1.chapter06.Calculator;

public class PrimeNumbers {

    /**
     * Generiert die ersten <code>size</code> Primzahlen und gibt sie
     * aufsteigend sortiert als Feld zurück.
     * 
     * @param size Anzahl der zu generierenden Primzahlen
     * @return Feld der Größe <code>size</code> mit den ersten Primzahlen
     */
    public static int[] generatePrimes(int size) {
       int[] primes = new int[size];
       int position = 0;
       for(int i = 2; position < size; i++) {
    	   if (Calculator.isPrime((long) i)) {
    		   primes[position] = i;
    		   position++;
    	   } 
       }
       return primes;
    }

    /**
     * Gibt das angegebene <code>int</code>-Feld auf der Konsole aus.
     * 
     * @param values
     */
    public static void print(int[] values) {
    	String output = "[ ";
        for (int i = 0; i < values.length; i++) {
        	output += (values[i] + ", ");
        }
        output = output.substring(0, output.length()-2);			// ", " am Ende entfernen
        output += " ]";
        System.out.print(output);
    }

    public static void main(String[] args) {
        System.out.print("Wie viele Primzahlen sollen generiert werden? ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        scanner.close();
        int[] primes = generatePrimes(size);
        System.out.print("Ergebnis:");
        print(primes);
    }
}