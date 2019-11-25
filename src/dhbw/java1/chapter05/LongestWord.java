package dhbw.java1.chapter05;

/**
 * Gibt die Länge des längsten Worts und die entsprechenden Wörter aus
 * 
 * @author Patrick Pfurtscheller
 *
 */
public class LongestWord {

	public static void main(String[] args) {

	String words = "Wolle rote Rose kaufen";
	
	int maxLength = 0, currentLength = 0;
	
	String longestWords = "Die längsten Wörter sind: ";
	
	for (int i = 0; i < words.length(); i++) {
		if (words.charAt(i) == ' ') {
			currentLength = 0;
		} else {
			if (++currentLength > maxLength) {
				maxLength = currentLength;
				}
			}
		}
	
	String currentWord = "";
	for (int i = 0; i < words.length(); i++) {
		if (words.charAt(i) == ' ') {
			currentWord = "";
		} else {
			currentWord += words.charAt(i);
			if (currentWord.length() == maxLength) {
				longestWords += (currentWord + " ");
			}
		}	
	}
	
	System.out.println("Das längste Wort hat " + maxLength + " Buchstaben.");
	System.out.println(longestWords);	
	}
}
