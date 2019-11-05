package dhbw.java1.chapter5;

public class OverflowControl {

	public static void main(String[] args) {

		int lastNumber = 0;
		int sum = 0;
		
		do {
			lastNumber++;
			sum += lastNumber;
		} while ((sum + lastNumber) > 0);		// klappt auch die nächste Addition noch?
		
		System.out.println("Die Summe von 1 bis " + lastNumber + " ist " + sum);
		
	}

}
