package dhbw.java1.chaper04;
public class LeapYear {
    /**
     * Dient zur Errechnung der Tage eines Jahres im Blick auf ein moegliches Schaltjahr
     * 
     * @param args wird hier nicht gebraucht
     */
    public static void main(String[] args) {
        int year = 2020;
        int days = 0;

        if (year % 4 == 0) {
        	if ((year % 100 == 0) && (year % 400 != 0)) {
        		//Jahr ist kein Schaltjahr
        		days = 365;
        	} else {
        		//Jahr ist ein Schaltjahr
        		days = 366;
        	}
        } else {
        	//Jahr ist kein Schaltjahr
        	days = 365;
        }
        System.out.println("Das Jahr " + year + " hat " + days + " Tage.");
    }
}