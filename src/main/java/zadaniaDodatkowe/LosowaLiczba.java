package zadaniaDodatkowe;

import java.util.Random;
import java.util.Scanner;

public class LosowaLiczba {
    public static void main(String[] args) {
        System.out.println("Program losuje liczbe z wybranego zakresu");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj maksymalną liczbę");
        int max = scanner.nextInt();
        System.out.println("Podaj minimalna liczbę");
        int min = scanner.nextInt();
        Random random = new Random();
        int wylosowanaLiczba = random.nextInt(max - min) + min;
        System.out.println("Wylosowana liczba to: " + wylosowanaLiczba);

    }
}
