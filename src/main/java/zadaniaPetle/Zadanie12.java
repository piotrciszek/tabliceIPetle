package zadaniaPetle;

import java.util.Scanner;

public class Zadanie12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int liczba =0;
        do {
            System.out.println("Podaj liczbę od 1 do 20, program narysuje trójką z tych liczb");
            liczba = scanner.nextInt();
            if (liczba<=20) {
                for (int i = 1; i <= liczba; i++) {
                    System.out.println();
                    for (int j = 1; j <= i; j++) {
                        System.out.print(j);
                    }
                }
            }

        } while (liczba > 20) ;


    }
}
