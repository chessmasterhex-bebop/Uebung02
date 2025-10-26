package h1;

import java.util.Scanner;

public class H1_main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Bitte eine Zahl eingeben (beliebig, auch negativ oder mit Nachkommastellen): ");

        if (s.hasNextDouble()) {  // prüft, ob wirklich eine Zahl eingegeben wurde
            double z = s.nextDouble();

            if (z > 10) {
                z = z - 10;
            }

            System.out.println("Ergebnis: " + z);
        } else {
            System.out.println("Fehler: Bitte eine gültige Zahl eingeben!");
        }

        s.close();
    }
}

