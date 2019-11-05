package dhbw.java1.chapter6;
public class TowersOfHanoi {
    public static int zuege = 0;

    private static void printMoves(int scheiben, int start, int hilf, int ziel) {
        if (scheiben > 0) {
            printMoves(scheiben - 1, start, ziel, hilf);
            System.out.println(++zuege + ". Bewege die oberste Scheibe von " + start + " nach " + ziel);
            printMoves(scheiben - 1, hilf, start, ziel);
        }
    }

    public static void main(String[] args) {
        int scheiben = 3;
        printMoves(scheiben, 1, 2, 3);
        System.out.println("Für " + scheiben + " Scheiben wurden " + zuege + " Züge benötigt.");
    }
}