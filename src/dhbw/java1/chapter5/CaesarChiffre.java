package dhbw.java1.chapter5;

import java.util.Scanner;

/**
 * Verschlüsselung eines Strings mithilfe der Cäsar Verschlüsselung
 * 
 * @author Patrick Pfurtscheller
 *
 */
public class CaesarChiffre {

	/**
	 * @param args not used
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bitte eine Nachricht zum Verschlüsseln eingeben:");
		String input = scanner.nextLine();
		input = input.toUpperCase();

		System.out.println("Bitte den Verschiebeschlüssel eingeben (1-25)");
		int schluessel = scanner.nextInt();
		
		String output = "";
		
		scanner.close();
		
		for (int i = 0; i <= input.length() -1; i++) {
			
			int buchstabe = 0;
			int neuerBuchstabe = 0;
			
			switch (input.charAt(i)) {
			case 'A':
				buchstabe = 0;
				neuerBuchstabe = (buchstabe + schluessel)%26;
				break;
			case 'B':
				buchstabe = 1;
				neuerBuchstabe = (buchstabe + schluessel)%26;
				break;
			case 'C':
				buchstabe = 2;
				neuerBuchstabe = (buchstabe + schluessel)%26;
				break;
			case 'D':
				buchstabe = 3;
				neuerBuchstabe = (buchstabe + schluessel)%26;
				break;
			case 'E':
				buchstabe = 4;
				neuerBuchstabe = (buchstabe + schluessel)%26;
				break;
			case 'F':
				buchstabe = 5;
				neuerBuchstabe = (buchstabe + schluessel)%26;
				break;
			case 'G':
				buchstabe = 6;
				neuerBuchstabe = (buchstabe + schluessel)%26;
				break;
			case 'H':
				buchstabe = 7;
				neuerBuchstabe = (buchstabe + schluessel)%26;
				break;
			case 'I':
				buchstabe = 8;
				neuerBuchstabe = (buchstabe + schluessel)%26;
				break;
			case 'J':
				buchstabe = 9;
				neuerBuchstabe = (buchstabe + schluessel)%26;
				break;
			case 'K':
				buchstabe = 10;
				neuerBuchstabe = (buchstabe + schluessel)%26;
				break;
			case 'L':
				buchstabe = 11;
				neuerBuchstabe = (buchstabe + schluessel)%26;
				break;
			case 'M':
				buchstabe = 12;
				neuerBuchstabe = (buchstabe + schluessel)%26;
				break;
			case 'N':
				buchstabe = 13;
				neuerBuchstabe = (buchstabe + schluessel)%26;
				break;
			case 'O':
				buchstabe = 14;
				neuerBuchstabe = (buchstabe + schluessel)%26;
				break;
			case 'P':
				buchstabe = 15;
				neuerBuchstabe = (buchstabe + schluessel)%26;
				break;
			case 'Q':
				buchstabe = 16;
				neuerBuchstabe = (buchstabe + schluessel)%26;
				break;
			case 'R':
				buchstabe = 17;
				neuerBuchstabe = (buchstabe + schluessel)%26;
				break;
			case 'S':
				buchstabe = 18;
				neuerBuchstabe = (buchstabe + schluessel)%26;
				break;
			case 'T':
				buchstabe = 19;
				neuerBuchstabe = (buchstabe + schluessel)%26;
				break;
			case 'U':
				buchstabe = 20;
				neuerBuchstabe = (buchstabe + schluessel)%26;
				break;
			case 'V':
				buchstabe = 21;
				neuerBuchstabe = (buchstabe + schluessel)%26;
				break;
			case 'W':
				buchstabe = 22;
				neuerBuchstabe = (buchstabe + schluessel)%26;
				break;
			case 'X':
				buchstabe = 23;
				neuerBuchstabe = (buchstabe + schluessel)%26;
				break;
			case 'Y':
				buchstabe = 24;
				neuerBuchstabe = (buchstabe + schluessel)%26;
				break;
			case 'Z':
				buchstabe = 25;
				neuerBuchstabe = (buchstabe + schluessel)%26;
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
					output += input.charAt(i);
				}
			}
			
			System.out.println(output);
		}
}