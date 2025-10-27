package h2;

public class H2_main {
    public static void main(String[] args) {

        // Gefordert: i, j, k, min, max als int
        int i = 5;
        int j = 12;
        int k = -3;

        int min;
        int max;

        // Minimum unter i, j, k bestimmen
        if (i < j && i < k) {
            min = i;
        } else if (j < i && j < k) {
            min = j;
        } else {
            min = k;
        }

        // Maximum unter i, j, k bestimmen
        if (i > j && i > k) {
            max = i;
        } else if (j > i && j > k) {
            max = j;
        } else {
            max = k;
        }

        // Kontrolle/Debug-Ausgabe
        System.out.println("i = " + i + ", j = " + j + ", k = " + k);
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}
