package dhbw.java1.chapter5;
/**
 * Addition aller ungeraden Zahlen bis zu einem Maximum
 * 
 * @author Patrick Pfurtscheller
 *
 */
public class SumOfOdds {
    /**
     * @param args not used
     */
    public static void main(String[] args) {
        int max = 11;
        int sum = 0;

        // TODO Add up all odd numbers from 1 to max using the variable sum
        for (int i = 1; i <= max; i++) {
        	if (i % 2 != 0) {
        		sum += i;
        	}
        }
        
        System.out.println("Die Summe der ungeraden Zahlen von 1 bis " + max + " ist " + sum);
    }
}