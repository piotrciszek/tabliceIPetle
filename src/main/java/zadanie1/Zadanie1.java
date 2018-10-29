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
            do {
                System.out.println("Podaj " + ((int) i +1)  + " liczbę, liczby nie mogą się powtarzać.");
                pointedNumber = scanner.nextInt();
            } while (isUnique(pointedNumber,userNumbers));
            userNumbers[i] = pointedNumber;
        }


        Random random = new Random();
        int generatedNumber;

        for (int j=0; j<6; j++) {
            do {
                generatedNumber = random.nextInt(49) + 1;
            } while (isUnique(generatedNumber, randomNumbers));

            randomNumbers[j] = generatedNumber;
        }

        System.out.println("Wybrane liczby to: ");
        for (int i : userNumbers) {
            System.out.print(i);
            System.out.print(" ");
        }


        System.out.println();
        System.out.println("Wylosowane liczby to: ");
        for (int i : randomNumbers) {
            System.out.print(i);
            System.out.print(" ");
        }

        System.out.println();
        System.out.println("Trafiłeś " + compareTable(userNumbers, randomNumbers));

    }
    private static boolean isUnique(int number, int[] table) {
        for (int i = 0; i<table.length; i++) {
            if (table[i] == number) {
                return true;
            }
        } return false;
    }

    private static int compareTable(int[] pointed, int[] generated) {
        int ile = 0;
        for (int i = 0; i < pointed.length; i++) {
            for (int j = 0; j < generated.length; j++) {
                if (pointed[i] == generated[j]) {
                    ile++;
                }
            }
        } return ile;
    }
}