package dhbw.java1.chapter05;
/**
 * Errechnen der Quersumme einer Zahl
 * 
 * @author Patrick Pfurtscheller
 *
 */
public class DigitSum {
    /**
     * @param args not used
     */
    public static void main(String[] args) {
        int value = 4711, digitSum = 0;
        System.out.print("Die Quersumme von " + value + " ist ");

        int restSumme = value;
        
        while (restSumme != 0) {
        	digitSum += restSumme % 10;		// Wir nehmen uns die letzte Zahl und addieren sie zur Summe
        	restSumme /= 10;				// Wir "schneiden die letzte Zahl ab"
		}
        
        System.out.println(digitSum);
    }
}