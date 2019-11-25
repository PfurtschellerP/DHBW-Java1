package dhbw.java1.chapter06;

public class TextUtilities {
	
	public static boolean isPalindromAdvanced(String text) {
		text = text.toUpperCase();
		text = text.replace(" ", "");
		text = text.replace("!", "");
		text = text.replace(".", "");
		text = text.replace(",", "");
		text = text.replace("?", "");
		boolean istPalindrom = false;
		
		for (int i = 0; i <= text.length() - 1; i++) {
			if (text.charAt(i) == (text.charAt(text.length() - 1 - i))) {
				// alles gut
				istPalindrom = true;
			} else {
				// hat was nicht gepasst
				istPalindrom = false;
				break;
			}
		}		
		return istPalindrom;
	}
	
	/**
	 * Gibt die Länge des längsten Wortes aus
	 * @param text Text, der geprüft werden soll
	 * @return Länge der längsten Wortes
	 */
	public static int lengthOfLongestWord(String text) {
		int maxLength = 0, currentLength = 0;		
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == ' ') {
				currentLength = 0;
			} else {
				if (++currentLength > maxLength) {
					maxLength = currentLength;
				}
			}
		}
		return maxLength;
	}
	
	/**
	 * Verschlüsselt einen gegebenen Text nach der Cäser Verschlüsselung
	 * @param text Text, der verschlüsselt werden soll
	 * @param key Schlüssel (Zahl um die die Buchsaben verschoben werden sollen)
	 * @return Verschlüsselter Text
	 */
	public static String caesarCipher(String text, int key) {
		text = text.toUpperCase();
		String output = "";
		for (int i = 0; i < text.length(); i++) {
			
			int buchstabe = 0;
			int neuerBuchstabe = 0;
			
			switch (text.charAt(i)) {
			case 'A':
				buchstabe = 0;
				neuerBuchstabe = (buchstabe + key)%26;
				break;
			case 'B':
				buchstabe = 1;
				neuerBuchstabe = (buchstabe + key)%26;
				break;
			case 'C':
				buchstabe = 2;
				neuerBuchstabe = (buchstabe + key)%26;
				break;
			case 'D':
				buchstabe = 3;
				neuerBuchstabe = (buchstabe + key)%26;
				break;
			case 'E':
				buchstabe = 4;
				neuerBuchstabe = (buchstabe + key)%26;
				break;
			case 'F':
				buchstabe = 5;
				neuerBuchstabe = (buchstabe + key)%26;
				break;
			case 'G':
				buchstabe = 6;
				neuerBuchstabe = (buchstabe + key)%26;
				break;
			case 'H':
				buchstabe = 7;
				neuerBuchstabe = (buchstabe + key)%26;
				break;
			case 'I':
				buchstabe = 8;
				neuerBuchstabe = (buchstabe + key)%26;
				break;
			case 'J':
				buchstabe = 9;
				neuerBuchstabe = (buchstabe + key)%26;
				break;
			case 'K':
				buchstabe = 10;
				neuerBuchstabe = (buchstabe + key)%26;
				break;
			case 'L':
				buchstabe = 11;
				neuerBuchstabe = (buchstabe + key)%26;
				break;
			case 'M':
				buchstabe = 12;
				neuerBuchstabe = (buchstabe + key)%26;
				break;
			case 'N':
				buchstabe = 13;
				neuerBuchstabe = (buchstabe + key)%26;
				break;
			case 'O':
				buchstabe = 14;
				neuerBuchstabe = (buchstabe + key)%26;
				break;
			case 'P':
				buchstabe = 15;
				neuerBuchstabe = (buchstabe + key)%26;
				break;
			case 'Q':
				buchstabe = 16;
				neuerBuchstabe = (buchstabe + key)%26;
				break;
			case 'R':
				buchstabe = 17;
				neuerBuchstabe = (buchstabe + key)%26;
				break;
			case 'S':
				buchstabe = 18;
				neuerBuchstabe = (buchstabe + key)%26;
				break;
			case 'T':
				buchstabe = 19;
				neuerBuchstabe = (buchstabe + key)%26;
				break;
			case 'U':
				buchstabe = 20;
				neuerBuchstabe = (buchstabe + key)%26;
				break;
			case 'V':
				buchstabe = 21;
				neuerBuchstabe = (buchstabe + key)%26;
				break;
			case 'W':
				buchstabe = 22;
				neuerBuchstabe = (buchstabe + key)%26;
				break;
			case 'X':
				buchstabe = 23;
				neuerBuchstabe = (buchstabe + key)%26;
				break;
			case 'Y':
				buchstabe = 24;
				neuerBuchstabe = (buchstabe + key)%26;
				break;
			case 'Z':
				buchstabe = 25;
				neuerBuchstabe = (buchstabe + key)%26;
				break;
			default:
				neuerBuchstabe = 27;
				break;
			}
			
			if (neuerBuchstabe <=26) {
					switch (neuerBuchstabe) {
					case 0:
						output += 'A';
						break;
					case 1:
						output += 'B';
						break;
					case 2:
						output += 'C';
						break;
					case 3:
						output += 'D';
						break;
					case 4:
						output += 'E';
						break;
					case 5:
						output += 'F';
						break;
					case 6:
						output += 'G';
						break;
					case 7:
						output += 'H';
						break;
					case 8:
						output += 'I';
						break;
					case 9:
						output += 'J';
						break;
					case 10:
						output += 'K';
						break;
					case 11:
						output += 'L';
						break;
					case 12:
						output += 'M';
						break;
					case 13:
						output += 'N';
						break;
					case 14:
						output += 'O';
						break;
					case 15:
						output += 'P';
						break;
					case 16:
						output += 'Q';
						break;
					case 17:
						output += 'R';
						break;
					case 18:
						output += 'S';
						break;
					case 19:
						output += 'T';
						break;
					case 20:
						output += 'U';
						break;
					case 21:
						output += 'V';
						break;
					case 22:
						output += 'W';
						break;
					case 23:
						output += 'X';
						break;
					case 24:
						output += 'Y';
						break;
					case 25:
						output += 'Z'; 
						break;
					}
				} else {
					output += text.charAt(i);
				}
			}
		return output;
	}
	
	/**
	 * Zählt die Wörter in einem String
	 * @param text Text, in welchem die Wörter gezählt werden sollen
	 * @return Anzahl der Wörter
	 */
	public static int wordCount(String text) {
		int numberOfWords = 0;
        for (int i = 0; i <= text.length() - 1; i++) {
        	if (text.charAt(i) == ' ') {
        		numberOfWords++;
        	}
        }
        numberOfWords++;		// im Satz ist immer ein Wort mehr, als es Leerzeichen gibt
        return numberOfWords;
	}

	/**
	 * Überprüfung , ob ein Wort ein Palindrom ist
	 * @param word Wort welches berprüft werden soll
	 * @return Ist es ein Palindrom?
	 */
	public static boolean isPalindrome(String word) {
		word = word.toUpperCase();
		boolean stillPalindrom = false;
		for (int i = 0; i <= word.length() - 1; i++) {
			if (word.charAt(i) == (word.charAt(word.length() - 1 - i))) {
				// alles gut
				stillPalindrom = true;
			} else {
				// hat was nicht gepasst
				stillPalindrom = false;
				break;
			}
		}
		return stillPalindrom;
	}
	
	/**
	 * Dreht Texte um, aber rekursiv
	 * @param text Text, der umgedreht werden soll
	 * @return der umgedrehte Text
	 */
	public static String reverseRec(String text) {
		if (text.length() <= 1) {
			return text;
		} else {
			return (text.charAt(text.length() - 1)) + (reverseRec(text.substring(0, text.length() - 1)));
		}
	}
	
	/**
	 * Dreht Texte um
	 * @param text Text, der umgedreht werden soll
	 * @return der umgedrehte Text
	 */
	public static String reverse(String text) {
		String output = "";
        for (int position = text.length() - 1; position >= 0; position--) {
        	output += text.charAt(position);
        }
        return output;
	}
	
	public static void main(String[] args) {

//		System.out.println(reverse("Hello"));
		
//		System.out.println(isPalindrome("Lagerregal"));
		
//		System.out.println(wordCount("Hallo das ist ein Test"));
		
//		System.out.println(caesarCipher("Hallo", 1));
		
//		System.out.println(lengthOfLongestWord("Hallo das ist ein Beispiel"));
		
//		System.out.println(reverseRec("Test"));
		
		System.out.println(isPalindromAdvanced("Bahre Bürde drüber hab!"));
	}

}
