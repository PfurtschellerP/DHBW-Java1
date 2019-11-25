package dhbw.java1.chapter11;

public class FibonacciIterative {
    public static long fibonacci(int n) {
        // TODO berechne die n-te Fibonacci-Zahl unter Benutzung eines long-Feldes
    	long[] numbers = new long[n];
    	
    	numbers[0] = 0;
    	numbers[1] = 1;
    	
    	for (int i = 2; i < n; i++) {
    		numbers[i] = numbers[i-1] + numbers[i-2];
    	}
    	
    	return numbers[n-1];
    }

    public static void main(String[] args) {
        // TODO gebe einige aussagekräftige Fibonacci-Zahlen zur Demonstration aus
    	System.out.println(fibonacci(10));
    }
}
