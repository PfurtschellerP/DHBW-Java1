package dhbw.java1.chaper4;
public class CelsiusConversion {
    public static void main(String[] args) {
        double celsius = 100;
        double fahrenheit;
        
        // Conversion from Celsius to Fahrenheit
        fahrenheit = ((9 / 5.0) * celsius) + 32;

        System.out.println(celsius + " °C sind " + fahrenheit + " °F.");
    }
}