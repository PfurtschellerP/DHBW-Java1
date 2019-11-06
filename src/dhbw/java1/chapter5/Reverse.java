package dhbw.java1.chapter5;
/**
 * Umkehren eines gegebenen Strings
 * 
 * @author Patrick Pfurtscheller
 *
 */
public class Reverse {
    /**
     * @param args not used
     */
    public static void main(String[] args) {
        String input = "Meine Eingabe";

        String output = "";
     
        for (int position = input.length() - 1; position >= 0; position--) {
        	output += input.charAt(position);
        }
        
        System.out.println(output);
    }
}