package zadanie1;

import java.util.Random;
import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        int[] userNumbers = new int[6];
        int[] randomNumbers = new int[6];

        Scanner scanner = new Scanner(System.in);
        int pointedNumber;

        for (int i=0; i<6; i++) {
            System.out.print("Podaj liczbe, liczby nie mogą się powtarzać");
            pointedNumber = scanner.nextInt();

            userNumbers[i] = pointedNumber;
        }
        Random random = new Random();
        int generatedNumber;

        for (int j=0; j<6; j++) {
            generatedNumber = random.nextInt(49) + 1;
            randomNumbers[j] = generatedNumber;
        }

        System.out.println("Wybrane liczby to: ");
        for (int i=0; i<userNumbers.length; i++) {
            System.out.print(userNumbers[i]);
            System.out.print(" ");
        }
        System.out.println();
        System.out.println("Wylosowane liczby to: ");
        for (int j=0; j<randomNumbers.length; j++) {
            System.out.print(randomNumbers[j]);
            System.out.print(" ");
        }

    }

}
