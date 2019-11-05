package dhbw.java1.chapter5;
/**
 * Zählen der Wörter in einem String
 * 
 * @author Patrick Pfurtscheller
 *
 */
public class WordCount {
    /**
     * @param args not used
     */
    public static void main(String[] args) {
        String input = "Wie viele Worte hat dieser Satz";
        int numberOfWords = 0;

        // TODO Count the words contained in the input string using the variable numberOfWords
        
        for (int i = 0; i <= input.length() - 1; i++) {
        	if (input.charAt(i) == ' ') {
        		numberOfWords++;
        	}
        }
        
        numberOfWords++;		// im Satz ist immer ein Wort mehr, als es Leerzeichen gibt
        
        
        System.out.println("Die Anzahl der Worte in \"" + input + "\" ist " + numberOfWords);
    }
}