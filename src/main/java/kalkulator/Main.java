package kalkulator;

import java.util.Scanner;

public class Main {
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
        } else {
            wynik = pierwszaLiczba / drugaLiczba;
        }
        System.out.println("Wynik = " + wynik);
    }

}
