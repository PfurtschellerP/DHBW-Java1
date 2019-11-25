package dhbw.java1.chaper04;
public class TimeConversion {
    /**
     * Dient zur Umrechnung einer vorgegebenen Sekundenanzahl in die entsprechenden Jahre,
     * Tage, Stunden, Minuten und Sekunden.
     * 
     * @param args hat keine Verwendung
     */
    public static void main(String[] args) {
    	
        int totalSeconds = 123456789, seconds, minutes, hours, days, years;
        int secondsToYear = 31536000, secondsToDays = 86400, secondsToHours = 3600;
        
        // Ermittlung der Jahre
        years = totalSeconds / secondsToYear;	
        // Ermittlung der restlichen Sekunden und Errechnung der Tage
        days = (totalSeconds % secondsToYear) / secondsToDays;
        // Ermittlung der restlichen Sekunden und Errechnung der Stunden
        hours = ((totalSeconds % secondsToYear) % secondsToDays) / secondsToHours;
        // Ermittlung der restlichen Sekunden und Errechnung der Minuten
        minutes = (((totalSeconds % secondsToYear) % secondsToDays) % secondsToHours) / 60;
        // Ermittlung der restlichen Sekunden
        seconds = ((((totalSeconds % secondsToYear) % secondsToDays) % secondsToHours) % 60);
        
        // Ausgabe
        System.out.print(totalSeconds + " Sekunden sind ");
        System.out.print(years + " Jahre plus ");
        System.out.print(days + " Tage plus ");
        System.out.print(hours + " Stunden plus ");
        System.out.print(minutes + " Minuten plus ");
        System.out.println(seconds + " Sekunden.");
    }
}