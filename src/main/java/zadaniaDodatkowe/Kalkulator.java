package zadaniaDodatkowe;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj rodzaj działania: +,-,*,/");
        String dzialania = scanner.nextLine();
        System.out.println("Podaj pierwsza liczbe");
        double pierwszaLiczba = scanner.nextDouble();
        System.out.println("Podaj druga liczbe");
        double drugaLiczba = scanner.nextDouble();

        double wynik = 0;

        if (dzialania.equals("+")) {
            wynik = pierwszaLiczba + drugaLiczba;
        } else if (dzialania.equals("-")) {
            wynik = pierwszaLiczba - drugaLiczba;
        } else if (dzialania.equals("*")) {
            wynik = pierwszaLiczba * drugaLiczba;
        } else if (dzialania.equals("/")) {
            if (drugaLiczba == 0) {
                System.out.println("Nie mozna dzielic przez 0");
            } else {
                wynik = pierwszaLiczba / drugaLiczba;
            }
        }
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        System.out.println("Wynik = " + decimalFormat.format(wynik));
    }
}
