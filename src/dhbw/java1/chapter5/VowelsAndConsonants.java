package dhbw.java1.chapter5;
/**
 * Zählen von Vokalen, Konsonanten und Umlauten in gegebenen Strings
 * @author Patrick Pfurtscheller
 *
 */
public class VowelsAndConsonants {
    public static void main(String[] args) {
        String input = "Militär";
        int vowelCount = 0, consonantCount = 0, diacriticsCount = 0;

        // TODO Count the vowels and consonants of the given input
        
        for (int i = 0; i <= input.length() - 1; i++) {
        	switch (input.charAt(i)) {
        	case 'a': case 'e': case 'i': case 'o': case 'u':
        		vowelCount++;
        		break;
        	case 'ä': case 'ö': case 'ü':
        		diacriticsCount++;
        		break;
        	default:
        		consonantCount++;
        		break;
        	}
        }
        
        System.out.println('"' + input + '"' + " enthält " + vowelCount + " Vokal(e), " + consonantCount + " Konsonant(en) und " + diacriticsCount + " Umlaut(e)");
    }
}