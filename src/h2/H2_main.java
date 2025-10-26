package h2;

import java.util.Scanner;

public class H2_main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Bitte drei verschiedene Zahlen eingeben (auch negativ oder mit Nachkommastellen möglich).");
        System.out.println("Hinweis: Gib mindestens zwei unterschiedliche Zahlen ein – alle müssen paarweise verschieden sein.");
        System.out.println();

        // i einlesen
        System.out.print("i = ");
        if (!s.hasNextDouble()) {
            System.out.println("Fehler: Ungültige Eingabe für i! Es muss eine Zahl sein.");
            s.close();
            return;
        }
        double i = s.nextDouble();

        // j einlesen
        System.out.print("j = ");
        if (!s.hasNextDouble()) {
            System.out.println("Fehler: Ungültige Eingabe für j! Es muss eine Zahl sein.");
            s.close();
            return;
        }
        double j = s.nextDouble();

        // k einlesen
        System.out.print("k = ");
        if (!s.hasNextDouble()) {
            System.out.println("Fehler: Ungültige Eingabe für k! Es muss eine Zahl sein.");
            s.close();
            return;
        }
        double k = s.nextDouble();

        s.close();

        // Paarweise verschieden prüfen
        if (i == j || i == k || j == k) {
            System.out.println("Fehler: Die Zahlen müssen paarweise verschieden sein!");
            System.out.println("--- Programm beendet ---");
            return;
        }

        // Minimum bestimmen
        double min;
        if (i < j && i < k) {
            min = i;
        } else if (j < i && j < k) {
            min = j;
        } else {
            min = k;
        }

        // Maximum bestimmen
        double max;
        if (i > j && i > k) {
            max = i;
        } else if (j > i && j > k) {
            max = j;
        } else {
            max = k;
        }

        // Ausgabe
        System.out.println();
        System.out.println("Eingegebene Werte:");
        System.out.println("i = " + i + ", j = " + j + ", k = " + k);
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
        System.out.println("--- Programm beendet ---");
    }
}
