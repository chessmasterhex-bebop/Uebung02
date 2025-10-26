package h3;

import java.util.Scanner;

public class H3_main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Bitte zwei Zahlen eingeben (auch negativ oder mit Nachkommastellen möglich).");
        System.out.println("Wir berechnen dann k anhand von Bedingungen zu i und j.");
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

        s.close();

        // Ausdrücke aus der Aufgabenstellung
        boolean expr1 = (i > j);      // Ausdruck 1
        boolean expr2 = (i > 200);    // Ausdruck 2
        boolean expr3 = (j > 100);    // Ausdruck 3

        int k = -10; // Startwert wie gefordert

        // Jetzt die Fälle 1–5 exakt nach Aufgabenblatt prüfen

        // Fall: Ausdruck 1 wahr, Ausdruck 2 und Ausdruck 3 NICHT wahr -> k = 1
        if (expr1 && !expr2 && !expr3) {
            k = 1;
        }
        // Fall: Ausdruck 1 und 2 wahr, Ausdruck 3 NICHT wahr -> k = 2
        else if (expr1 && expr2 && !expr3) {
            k = 2;
        }
        // Fall: Ausdruck 1 und 2 und 3 sind wahr -> k = 3
        else if (expr1 && expr2 && expr3) {
            k = 3;
        }
        // Fall: alle drei Ausdrücke sind NICHT wahr -> k = 4
        else if (!expr1 && !expr2 && !expr3) {
            k = 4;
        }
        // sonst: k bleibt -10 (der "alle anderen Fälle"-Fall)

        // Ausgabe
        System.out.println();
        System.out.println("Eingegebene Werte:");
        System.out.println("i = " + i + ", j = " + j);
        System.out.println("Ausdruck 1 (i > j): " + expr1);
        System.out.println("Ausdruck 2 (i > 200): " + expr2);
        System.out.println("Ausdruck 3 (j > 100): " + expr3);
        System.out.println("=> k = " + k);
        System.out.println("--- Programm beendet ---");
    }
}
