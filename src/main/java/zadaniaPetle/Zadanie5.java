package zadaniaPetle;

import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę, zostanie obliczona suma jej cyfr");
        String number = scanner.nextLine();
        String[] digits = number.split("");
        int sum = 0;

        for (int i = 0; i < digits.length; i++) {
            sum += Integer.parseInt(digits[i]);

        }
        System.out.println("Wynik to: " + sum);
    }

}
