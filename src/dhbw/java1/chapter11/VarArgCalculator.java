package dhbw.java1.chapter11;
public class VarArgCalculator {

	/**
	 * Summenmethode mit unbegrenzter Parameter Anzahl
	 * @param summanden
	 * @return Summe
	 */
	private static double sum(double...summanden) {
		double summe = 0;
		for (double summand : summanden) {
			summe += summand;
		}
		return summe;
	}
	
	/**
	 * Produktmethode mit unbegrenzter Parameter Anzahl
	 * @param faktoren
	 * @return Produkt
	 */
	private static double product(double...faktoren) {
		double produkt = 1;
		for (double faktor : faktoren) {
			produkt *= faktor;
		}
		return produkt;
	}
	
	/**
	 * Kleinsten Wert augeben
	 * @param werte
	 * @return kleinster Wert
	 */
	private static double min(double...werte) {
		double min = Double.POSITIVE_INFINITY;
		for (double wert : werte) {
			min = wert < min ? wert : min;
		}
		return min;
	}
	
	/**
	 * Größten Wert ausgeben
	 * @param werte
	 * @return größter Wert
	 */
	private static double max(double...werte) {
		double max = Double.NEGATIVE_INFINITY;
		for (double wert : werte) {
			max = wert > max ? wert : max;
		}
		return max;
	}
	
	/**
	 * Errechnet das arithmetische Mittel beliebig vieler Werte
	 * @param werte
	 * @return arithmetisches Mittel
	 */
	private static double arithmeticMean(double...werte) {
		double summe = 0;
		int anzahl = 0;
		for (double wert : werte) {
			summe += wert;
			anzahl++;
		}
		return (summe / anzahl);
	}
	
	/**
	 * Errechnet das geometrische Mittel beliebig vieler Werte
	 * @param werte
	 * @return geometrisches Mittel
	 */
	private static double geometricMean(double...werte) {
		double produkt = 1;
		int anzahl = 0;
		for (double wert : werte) {
			produkt *= wert;
			anzahl++;			
		}
		return Math.pow(produkt, 1.0/anzahl);
	}
	
	/**
	 * Errechnet das harmonische Mittel beliebig vieler Werte
	 * @param werte
	 * @return harmonisches Mittel
	 */
	private static double harmonicMean(double...werte) {
		double summe = 0;
		int anzahl = 0;
		for (double wert: werte) {
			summe += (1.0 / wert);
			anzahl++;
		}
		return (anzahl / summe);
	}

    /**
     * Überprüft, ob der erwarte Wert mit dem angeforderten übereinstimmt
     * @param expected	erwarteter Wert
     * @param actual	erhalterner Wert
     */
    private static void testEquality(double expected, double actual) {
        if (Double.isNaN(expected)) {
            System.out.print(Double.isNaN(actual) ? " ok" : " ERROR");
        } else {
            System.out.print(expected == actual ? " ok" : " ERROR");
        }
    }
    

    public static void main(String[] args) {
        System.out.print("Summe:");
        testEquality(0, sum());
        testEquality(0, sum(0));
        testEquality(1, sum(1));
        testEquality(3, sum(1, 2));
        testEquality(6, sum(1, 2, 3));
        System.out.println();

        System.out.print("Produkt:");
        testEquality(1, product());
        testEquality(0, product(0));
        testEquality(1, product(1));
        testEquality(2, product(1, 2));
        testEquality(6, product(1, 2, 3));
        System.out.println();

        System.out.print("Minimum:");
        testEquality(Double.POSITIVE_INFINITY, min());
        testEquality(0, min(0));
        testEquality(1, min(1));
        testEquality(-1, min(-1, 2));
        testEquality(-3, min(-1, -2, -3));
        System.out.println();

        System.out.print("Maximum:");
        testEquality(Double.NEGATIVE_INFINITY, max());
        testEquality(0, max(0));
        testEquality(1, max(1));
        testEquality(1, max(1, -2));
        testEquality(3, max(1, 2, 3));
        System.out.println();
        
        System.out.print("Arithmetisches Mittel:");
        testEquality(Double.NaN, arithmeticMean());
        testEquality(0, arithmeticMean(0));
        testEquality(1, arithmeticMean(1));
        testEquality(1.5, arithmeticMean(1, 2));
        testEquality(2, arithmeticMean(1, 2, 3));
        System.out.println();
        
        System.out.print("Geometrisches Mittel:");
        testEquality(Double.NaN, geometricMean());
        testEquality(0, geometricMean(0));
        testEquality(1, geometricMean(1));
        testEquality(Math.sqrt(2), geometricMean(1, 2));
        testEquality(Math.pow(6, 1.0 / 3), geometricMean(1, 2, 3));
        System.out.println();
        
        System.out.print("Harmonisches Mittel:");
        testEquality(Double.NaN, harmonicMean());
        testEquality(1, harmonicMean(1));
        testEquality(4.0 / 3, harmonicMean(1, 2));
        testEquality(18.0 / 11, harmonicMean(1, 2, 3));
        System.out.println();
    }
}