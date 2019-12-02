package dhbw.java1.chapter11;
public class VectorCalculator {

    /**
     * Berechnet die Summe zweier Vektoren.
     * 
     * @param first
     * @param second
     * @return Vektorsumme
     */
    public static double[] sum(double[] first, double[] second) {
        double[] sum = new double[first.length];
    	for (int i = 0; i < first.length; i++) {
    		sum[i] = first[i] + second[i];
    	}
    	return sum;
    }

    /**
     * Berechnet das Produkt aus einem Skalar und einem Vektor.
     * 
     * @param scalar
     * @param vector
     * @return Produkt
     */
    public static double[] product(double scalar, double[] vector) {
    	double[] product = new double[vector.length];
    	for (int i = 0; i < vector.length; i++) {
    		product[i] = scalar * vector[i];
    	}
    	return product;
    }

    /**
     * Berechnet das Skalarprodukt zweier Vektoren.
     * 
     * @param first
     * @param second
     * @return Skalarprodukt
     */
    public static double scalarProduct(double[] first, double[] second) {
        // TODO
    	double sum = 0;
    	for (int i = 0; i < first.length; i++) {
    		sum += (first[i] * second[i]);
    	}
    	return sum;
    }

    /**
     * Berechnet den Betrag eines Vektors.
     * 
     * @param vector
     * @return Vektorbetrag
     */
    public static double magnitude(double[] vector) {
        // TODO
    	double radicant = 0;
    	for (int i = 0; i < vector.length; i++) {
    		radicant += Math.pow(vector[i], 2);
    	}
    	return Math.sqrt(radicant);
    }

    /**
     * Gibt den Vektor in der Konsole aus.
     * 
     * @param vector
     */
    public static void print(double[] vector) {
        for (int index = 0; index < vector.length; index++) {
            System.out.print(vector[index] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        double[] a = {1, 2, 3};
        double[] b = {4, 5, 6};
        print(sum(a, b));
        print(product(2, a));
        System.out.println(scalarProduct(a, b));
        System.out.println(magnitude(a));

        // TODO mehr Tests
    }
}