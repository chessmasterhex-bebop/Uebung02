package h3;

public class H3_main {
    public static void main(String[] args) {

        // Gefordert: i, j, k als int mit beliebigen Werten
        int i = 210;
        int j = 102;
        int k = -10; // Startwert laut Aufgabenblatt

        // Ausdrücke aus der Aufgabenstellung
        boolean expr1 = (i > j);    // Ausdruck 1
        boolean expr2 = (i > 200);  // Ausdruck 2
        boolean expr3 = (j > 100);  // Ausdruck 3

        // Jetzt die Fälle exakt wie beschrieben prüfen:

        // Fall 1:
        // Ausdruck1 wahr && Ausdruck2 NICHT wahr && Ausdruck3 NICHT wahr → k = 1
        if (expr1 && !expr2 && !expr3) {
            k = 1;
        }
        // Fall 2:
        // Ausdruck1 wahr && Ausdruck2 wahr && Ausdruck3 NICHT wahr → k = 2
        else if (expr1 && expr2 && !expr3) {
            k = 2;
        }
        // Fall 3:
        // Ausdruck1 wahr && Ausdruck2 wahr && Ausdruck3 wahr → k = 3
        else if (expr1 && expr2 && expr3) {
            k = 3;
        }
        // Fall 4:
        // alle drei NICHT wahr → k = 4
        else if (!expr1 && !expr2 && !expr3) {
            k = 4;
        }
        // sonst bleibt k = -10

        // Debug-Ausgabe
        System.out.println("i = " + i + ", j = " + j + ", k = " + k);
        System.out.println("expr1 (i > j)     = " + expr1);
        System.out.println("expr2 (i > 200)   = " + expr2);
        System.out.println("expr3 (j > 100)   = " + expr3);
        System.out.println("Endwert k         = " + k);
    }
}
