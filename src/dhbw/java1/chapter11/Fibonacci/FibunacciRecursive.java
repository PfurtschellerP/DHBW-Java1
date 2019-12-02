package dhbw.java1.chapter11.Fibonacci;

public class FibunacciRecursive {
	private static long[] numbers = new long[100];
	
	public static long fibonacci(int n) {
	    if (n <= 1) {	// Abbruchbedingung
	        return n;
	    }
	    if (numbers[n] == 0) {
            numbers[n] = fibonacci(n-2) + fibonacci(n-1);   // berechneten Wert im Feld speichern
        }
        return numbers[n];                                  // ... und zurückgeben
	}

    public static void main(String[] args) {
        // gebe einige aussagekräftige Fibonacci-Zahlen zur Demonstration aus
    	System.out.println(fibonacci(50));
    }

}
